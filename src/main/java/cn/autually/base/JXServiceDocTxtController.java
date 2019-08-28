package cn.autually.base;

import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.math.BigDecimal;
import java.text.Collator;
import java.util.*;

import static cn.autually.base.JXRMapping.apiEnable;

/**
 * Created by fangzhen on 2016/11/24.
 */
@WebServlet(urlPatterns = "/doc/txt")
@MultipartConfig
public class JXServiceDocTxtController extends JXBaseController {
    Gson g = new Gson();
    String enter = "<br/>";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(!apiEnable) return;
        final int[] index = {1};
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        StringBuilder txt = new StringBuilder();

        JXRMapping.requesterMap.entrySet().stream().filter(e -> {
            AnController a1 = e.getValue().obj.getClass().getAnnotation(AnController.class);
            if (a1.createApi()) {
                return true;
            }
            return false;
        }).sorted((o1, o2) -> {
            Collator instance = Collator.getInstance(Locale.CHINA);
            AnController a1 = o1.getValue().obj.getClass().getAnnotation(AnController.class);
            AnController a2 = o2.getValue().obj.getClass().getAnnotation(AnController.class);
            return instance.compare(a1.describe(), a2.describe());
        }).map(e -> {
            JXRMapping.Requester value = e.getValue();
            AnController annotation = value.obj.getClass().getAnnotation(AnController.class);
            txt.append("[remark]").append(index[0]).append("-").append(annotation.describe()).append(enter);
            txt.append("[url]").append(JXRMapping.Server).append(annotation.path()).append(enter);
            StringBuilder paramSB = new StringBuilder();
            Field[] fields = value.obj.getClass().getFields();
            for (int i = 0; i < fields.length; i++) {
                AnParam annotation1 = fields[i].getAnnotation(AnParam.class);
                if (annotation1 != null) {
                    String name = fields[i].getType().getName();
//                    System.out.println(name + " " + fields[i].getGenericType().getTypeName());
                    if (name.indexOf("$") != -1) { //参数为内部类
                        Constructor con2 = null;
                        try {
//                            con2 = Class.forName(name).getDeclaredConstructor(value.obj.getClass());
//                            con2.setAccessible(true);
//                            Object obj2 = con2.newInstance(value.obj);
                            Object o = createObjFromString(name, value.obj);
                            String json = g.toJson(o);
                            paramSB.append(fields[i].getName()).append("=").append(json);
                        } catch (NoSuchMethodException e1) {
                            e1.printStackTrace();
                        } catch (IllegalAccessException e1) {
                            e1.printStackTrace();
                        } catch (InstantiationException e1) {
                            e1.printStackTrace();
                        } catch (InvocationTargetException e1) {
                            e1.printStackTrace();
                        } catch (ClassNotFoundException e1) {
                            e1.printStackTrace();
                        }
                    } else if (Collection.class.isAssignableFrom(fields[i].getType())) {//参数为集合
                        Class genericTypeClass = getFieldGenericType(fields[i]);
                    } else if(fields[i].getType() == String.class||fields[i].getType() == StringBuffer.class||fields[i].getType() == StringBuilder.class){
                        paramSB.append(fields[i].getName()).append("=").append("1");
                    } else if(fields[i].getType() == Comparator.class){
                    } else if(fields[i].getType() == Boolean.class||fields[i].getType() == boolean.class){
                        paramSB.append(fields[i].getName()).append("=").append("true");
                    } else if(fields[i].getType() == float.class||fields[i].getType() == Float.class
                            ||fields[i].getType() == Double.class||fields[i].getType() == double.class
                            ||fields[i].getType() == BigDecimal.class){
                        paramSB.append(fields[i].getName()).append("=").append("0.1");
                    } else{ //普通参数
                        Object o = null;
                        try {
                            o = createObjFromString(name, null);
                        } catch (ClassNotFoundException e1) {
                            e1.printStackTrace();
                        } catch (IllegalAccessException e1) {
                            e1.printStackTrace();
                        } catch (InstantiationException e1) {
                            e1.printStackTrace();
                        } catch (NoSuchMethodException e1) {
                            e1.printStackTrace();
                        } catch (InvocationTargetException e1) {
                            e1.printStackTrace();
                        }
                        String json = g.toJson(o);
                        paramSB.append(fields[i].getName()).append("=").append(json);
//                        paramSB.append(fields[i].getName()).append("=").append("1");
                    }
                    if (i < value.obj.getClass().getFields().length - 1) {
                        paramSB.append("&");
                    }
                }
            }
            txt.append("[param]").append(paramSB).append(enter);
            for (Class<?> aClass : value.obj.getClass().getClasses()) {
                AnResponse an1 = aClass.getAnnotation(AnResponse.class);
                if (an1 != null) {
                    Object obj = null;
                    String json = null;
                    try {
                        obj = createObjFromString(aClass.getName(), value.obj);
                        json = g.toJson(obj);
                        txt.append("[response]").append(json).append("\n");
                    } catch (ClassNotFoundException e1) {
                        e1.printStackTrace();
                    } catch (IllegalAccessException e1) {
                        e1.printStackTrace();
                    } catch (InstantiationException e1) {
                        e1.printStackTrace();
                    } catch (NoSuchMethodException e1) {
                        e1.printStackTrace();
                    } catch (InvocationTargetException e1) {
                        e1.printStackTrace();
                    }
//                    System.out.println(aClass.getName());
                }
            }
            txt.append(enter).append(enter);
            index[0] += 1;
            return e;
        }).count();
        PrintWriter out = response.getWriter();
        out.print(txt);
        out.flush();
        out.close();
    }

    public Object createObjFromString(String name, Object parent) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
//        System.out.println(name);
        Class<?> cls;
        Object obj = null;
        if (parent == null) {
            cls = Class.forName(name);
            if (cls == BigDecimal.class){
                obj = new BigDecimal(0.01).setScale(4, BigDecimal.ROUND_HALF_DOWN);
                return obj;
            }else if(cls == Comparator.class){
                return null;
            }else {
                obj = cls.newInstance();
            }
            for (Field field : cls.getFields()) {
//                System.out.println("file:" + field.getName());
                Class<?> fieldType = field.getType();
                if (fieldType == String.class || fieldType == StringBuffer.class || fieldType == StringBuilder.class) {
                    field.set(obj, "");
                } else if (fieldType == Boolean.class || fieldType == boolean.class) {
                    field.set(obj, false);
                } else if (fieldType == Integer.class || fieldType == int.class) {
                    field.set(obj, 1);
                } else if (fieldType == Double.class || fieldType == double.class || fieldType == float.class || fieldType == Float.class) {
                    field.set(obj, 0.0);
                } else if (Collection.class.isAssignableFrom(field.getType())) {
                    Class fieldGenericType = getFieldGenericType(field);
                    ArrayList arrayList = new ArrayList();
                    if (fieldGenericType.getName().indexOf("$") != -1) {
                        Constructor declaredConstructor = fieldGenericType.getDeclaredConstructor(parent.getClass());
                        declaredConstructor.setAccessible(true);
                        Object objFromString = createObjFromString(fieldGenericType.getName(), parent);
                        arrayList.add(objFromString);
                    } else if (fieldGenericType == String.class || fieldGenericType == StringBuilder.class || fieldGenericType == StringBuffer.class) {
                        arrayList.add("");
                    } else if (fieldGenericType == Integer.class || fieldGenericType == int.class || fieldGenericType == long.class || fieldGenericType == Long.class) {
                        arrayList.add(-1);
                    } else if (fieldGenericType == Float.class || fieldGenericType == Double.class || fieldGenericType == double.class || fieldGenericType == float.class) {
                        arrayList.add(0.1);
                    } else if (fieldType == BigDecimal.class) {
                        field.set(obj, new BigDecimal(0.1).setScale(4, BigDecimal.ROUND_HALF_DOWN));
                    } else {
                        Object objFromString = createObjFromString(fieldGenericType.getName(), null);
                        arrayList.add(objFromString);
                    }
                    field.set(obj, arrayList);
                } else if(fieldType.getName().indexOf("$") != -1){
                    Object o = createObjFromString(fieldType.getName(), parent);
                    field.set(obj, o);
                } else {
                    Object o = createObjFromString(fieldType.getName(), null);
                    field.set(obj, o);
                }
            }
        } else {
            cls = Class.forName(name);
            if (cls.getName().indexOf("$") != -1) {
                Constructor<?> con = cls.getDeclaredConstructor(parent.getClass());
                con.setAccessible(true);
                obj = con.newInstance(parent);
            } else if (cls == BigDecimal.class) {
                obj = new BigDecimal(0);
                return obj;
            } else {
                obj = cls.newInstance();
            }
            for (Field field : cls.getFields()) {
//                System.out.println("file:" + field.getName());
                Class<?> fieldType = field.getType();
                if (fieldType == String.class || fieldType == StringBuffer.class || fieldType == StringBuilder.class) {
                    field.set(obj, "");
                } else if (fieldType == Boolean.class || fieldType == boolean.class) {
                    field.set(obj, false);
                } else if (fieldType == Integer.class || fieldType == int.class) {
                    field.set(obj, 1);
                } else if (fieldType == Double.class || fieldType == double.class || fieldType == float.class || fieldType == Float.class) {
                    field.set(obj, 0.1);
                } else if (fieldType == BigDecimal.class) {
                    field.set(obj, new BigDecimal(0.1).setScale(4, BigDecimal.ROUND_HALF_DOWN));
                } else if (Collection.class.isAssignableFrom(field.getType())) {

                    Class fieldGenericType = getFieldGenericType(field);
                    ArrayList arrayList = new ArrayList();
                    if (fieldGenericType.getName().indexOf("$") != -1) {
                        Constructor declaredConstructor = fieldGenericType.getDeclaredConstructor(parent.getClass());
                        declaredConstructor.setAccessible(true);
                        Object objFromString = createObjFromString(fieldGenericType.getName(), parent);
                        arrayList.add(objFromString);
                    } else if (fieldGenericType == String.class || fieldGenericType == StringBuilder.class || fieldGenericType == StringBuffer.class) {
                        arrayList.add("");
                    } else if (fieldGenericType == Integer.class || fieldGenericType == int.class || fieldGenericType == long.class || fieldGenericType == Long.class) {
                        arrayList.add(-1);
                    } else if (fieldGenericType == Float.class || fieldGenericType == Double.class || fieldGenericType == double.class || fieldGenericType == float.class) {
                        arrayList.add(0.0);
                    } else {
                        Object objFromString = createObjFromString(fieldGenericType.getName(), null);
                        arrayList.add(objFromString);
                    }
                    field.set(obj, arrayList);
                } else if(fieldType.getName().indexOf("$") != -1){
                    Object o = createObjFromString(fieldType.getName(), parent);
                    field.set(obj, o);
                } else {
                    Object o = createObjFromString(fieldType.getName(), null);
                    field.set(obj, o);
                }
            }
        }
        return obj;
    }


    public Class getFieldGenericType(Field field) {
        if (ParameterizedType.class.isAssignableFrom(field.getGenericType().getClass())) {
            ParameterizedType genericType =
                    (ParameterizedType) field.getGenericType();
            String typeName = genericType.getActualTypeArguments()[0].getTypeName();
//            System.out.println(typeName);
            Class<?> aClass = null;
            try {
                aClass = Class.forName(typeName);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            return aClass;
        }
        return null;
    }
}
