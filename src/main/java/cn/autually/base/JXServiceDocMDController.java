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
@WebServlet(urlPatterns = "/doc/md")
@MultipartConfig
public class JXServiceDocMDController extends JXBaseController {
    Gson g = new Gson();
    String enter = "<br/>";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(!apiEnable) return;
        final int[] index = {1};
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        StringBuilder md = new StringBuilder();
        md.append("[TOC]").append(enter);
        md.append("# API开发指南 - V" + JXRMapping.API_VERSION).append(enter);
        md.append("接口地址：" + JXRMapping.Server).append(enter);
        md.append("# API列表").append(enter);

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
            md.append("##").append(index[0]).append("-").append(annotation.describe()).append(enter);
            md.append("###地址").append(JXRMapping.Server).append(annotation.path()).append(enter);
            md.append("###参数").append(enter);
            StringBuilder paramSB = new StringBuilder();
            Field[] fields = value.obj.getClass().getFields();
            //反射参数
            IdentityHashMap<String, Pa> tableMap1 = new IdentityHashMap<>();
            insertMap(value.obj.getClass(), tableMap1);
            md.append("|名称|类型|描述|").append(enter);
            md.append("|------|------|------|------|").append(enter);
            ArrayList<Map.Entry<String, Pa>> entries = new ArrayList<>(tableMap1.entrySet());
            Collections.sort(entries, new Comparator<Map.Entry<String, Pa>>() {
                @Override
                public int compare(Map.Entry<String, Pa> o1, Map.Entry<String, Pa> o2) {
                    return o1.getKey().compareTo(o2.getKey());
                }
            });
            for (Map.Entry<String, Pa> entry : entries) {
                String type = entry.getValue().type;
                String[] split = type.split("\\.");
                if (split.length > 0) {
                    type = split[split.length - 1];
                }
                String[] $s = type.split("\\$");
                if ($s.length > 0) {
                    type = $s[$s.length - 1];
                }
                md.append("|").append(entry.getKey()).append("|").append(type).append("|").append(entry.getValue().description).append("|").append(enter);

            }
            md.append(enter);

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
                            json = StringTookit.JSONStringFormat(json).replaceAll("\n", enter).replaceAll("\t", "&nbsp;&nbsp;&nbsp;&nbsp;").replaceAll(" ", "&nbsp;");
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

                    } else if (fields[i].getType() == String.class || fields[i].getType() == StringBuffer.class || fields[i].getType() == StringBuilder.class) {
                        paramSB.append(fields[i].getName()).append("=").append("1");
                    } else if (fields[i].getType() == Comparator.class) {
                    } else if (fields[i].getType() == Boolean.class || fields[i].getType() == boolean.class) {
                        paramSB.append(fields[i].getName()).append("=").append("true");
                    } else if (fields[i].getType() == float.class || fields[i].getType() == Float.class
                            || fields[i].getType() == Double.class || fields[i].getType() == double.class
                            || fields[i].getType() == BigDecimal.class) {
                        paramSB.append(fields[i].getName()).append("=").append("0.1");
                    } else { //普通参数
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
                        json = StringTookit.JSONStringFormat(json).replaceAll("\n", enter).replaceAll("\t", "&nbsp;&nbsp;&nbsp;&nbsp;").replaceAll(" ", "&nbsp;");
                        paramSB.append(fields[i].getName()).append("=").append(json);
//                        paramSB.append(fields[i].getName()).append("=").append("1");
                    }
                    if (i < value.obj.getClass().getFields().length - 1) {
                        paramSB.append("&");
                    }
                }
            }
            md.append("参数示例").append(enter);
            md.append("```").append(enter).append(paramSB).append(enter).append("```").append(enter);

            md.append("###返回值").append(enter);
            IdentityHashMap<String, Pa> tableMap = new IdentityHashMap<>();
            for (Class<?> aClass : value.obj.getClass().getClasses()) {
                AnResponse an1 = aClass.getAnnotation(AnResponse.class);
                if (an1 != null) {
                    insertMap(aClass, tableMap);
                }
            }
            md.append("|名称|类型|描述|").append(enter);
            md.append("|------|------|------|------|").append(enter);
            ArrayList<Map.Entry<String, Pa>> entries1 = new ArrayList<>(tableMap.entrySet());
            Collections.sort(entries1, new Comparator<Map.Entry<String, Pa>>() {
                @Override
                public int compare(Map.Entry<String, Pa> o1, Map.Entry<String, Pa> o2) {
                    return o1.getKey().compareTo(o2.getKey());
                }
            });
            for (Map.Entry<String, Pa> entry : entries1) {
                String type = entry.getValue().type;
                String[] split = type.split("\\.");
                if (split.length > 0) {
                    type = split[split.length - 1];
                }
                String[] $s = type.split("\\$");
                if ($s.length > 0) {
                    type = $s[$s.length - 1];
                }
                md.append("|").append(entry.getKey()).append("|").append(type).append("|").append(entry.getValue().description).append("|").append(enter);

            }
            md.append(enter);
            //生成返回
            for (Class<?> aClass : value.obj.getClass().getClasses()) {
                AnResponse an1 = aClass.getAnnotation(AnResponse.class);
                if (an1 != null) {
                    Object obj = null;
                    String json = null;
                    try {
                        obj = createObjFromString(aClass.getName(), value.obj);

                        for (Field field : aClass.getFields()) {
                            AnParam annotation1 = field.getAnnotation(AnParam.class);
                            if (annotation1 != null) {
                                // 构造成员内部类实例
//                        Constructor con2 = aClass.getDeclaredConstructor(value.obj.getClass());
//                        con2.setAccessible(true);
//                        Object obj2 = con2.newInstance(value.obj);


                            }
                        }
                        json = g.toJson(obj);
                        json = StringTookit.JSONStringFormat(json).replaceAll("\n", enter).replaceAll("\t", "&nbsp;&nbsp;&nbsp;&nbsp;").replaceAll(" ", "&nbsp;");
                        md.append("返回示例").append(enter);
                        md.append("```").append(enter).append(json).append(enter).append("```").append(enter);
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
            md.append(enter).append(enter);
            index[0] += 1;
            return e;
        }).count();
        PrintWriter out = response.getWriter();
        out.print(md);
        out.flush();
        out.close();
    }

    private void insertMap(Class<?> aClass, IdentityHashMap<String, Pa> tableMap) {
        for (Field field : aClass.getFields()) {
            AnParam an = field.getAnnotation(AnParam.class);
            if (an != null) {
                Pa pa = new Pa();
                pa.type = field.getType().getTypeName();
                pa.description = an.describe();
                tableMap.put(new String(field.getName()), pa);
                if (Collection.class.isAssignableFrom(field.getType())) {
                    Class fieldGenericType = getFieldGenericType(field);
//                    tableMap.put(new String(""),new Pa());
                    insertMap(fieldGenericType, tableMap);
                } else {
//                    tableMap.put(new String(""),new Pa());
                    insertMap(field.getType(), tableMap);
                }

            }
        }
    }

    public Object createObjFromString(String name, Object parent) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
//        System.out.println(name);
        Class<?> cls;
        Object obj = null;
        if (parent == null) {
            cls = Class.forName(name);
            if (cls == BigDecimal.class) {
                obj = new BigDecimal(0.01).setScale(4, BigDecimal.ROUND_HALF_DOWN);
                return obj;
            } else if (cls == Comparator.class) {
                return null;
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
//                        Object o = declaredConstructor.newInstance(parent);
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
                } else if (fieldType.getName().indexOf("$") != -1) {
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
                obj = new BigDecimal(0.1).setScale(4, BigDecimal.ROUND_HALF_DOWN);
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
//                        Object o = declaredConstructor.newInstance(parent);
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
                } else if (fieldType.getName().indexOf("$") != -1) {
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

    public class Pa {
        public String name = "";
        public String type = "";
        public String description = "";
    }
}
