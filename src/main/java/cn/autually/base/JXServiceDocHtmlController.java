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
import java.util.concurrent.ConcurrentHashMap;

import static cn.autually.base.JXRMapping.apiEnable;

/**
 * Created by fangzhen on 2016/11/24.
 */
@WebServlet(urlPatterns = "/doc/html")
@MultipartConfig
public class JXServiceDocHtmlController extends JXBaseController {
    Gson g = new Gson();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(!apiEnable) return;
        StringBuilder html = new StringBuilder("<!DOCTYPE html>\n<html lang=\"en\" style=\"height: 100%;\">\n<head>\n<meta charset=\"UTF-8\">\n<title>API开发指南</title>\n<style type=\"text/css\">\nbody {\npadding: 0;\nmargin: 0;\nheight: 100%;\n}\nul {\nlist-style-type: decimal;\npadding: 1rem 1rem 1rem 1rem;\nmargin: 0 0 0 1rem;\n}\n.menu {\nwidth: 25%;\nheight: auto;\nbackground-color: #f6f6f6;\ndisplay: flex;\njustify-content: flex-start;\nalign-items: flex-start;\noverflow: scroll;\n}\n.contextRoot {\nwidth: 85%;\nheight: auto;\nbackground-color: #ffffff;\noverflow: scroll;\n}\n\n.context {\nwidth: 96%;\n/*height: 100%;*/\nbackground-color: #ffffff;\ndisplay: flex;\nflex-direction: column;\njustify-content: flex-start;\nalign-items: stretch;\npadding: 1rem 2% 1rem 2%;\n}\n.divisionV {\nwidth: 1rem;\nheight: auto;\nbackground-size: 1rem 100%;\nbackground: linear-gradient(90deg, #dedede, #c9c9c9) no-repeat;\n}\n\n.divisionH {\nwidth: 100%;\nheight: 1rem;\nbackground-size: 100% 1rem;\nbackground: linear-gradient(0deg, #dedede, #c9c9c9) no-repeat;\n}\nli{\npadding: 0.25rem 1.5rem;\ncolor: #4d4d4d;\nfont-size: 1rem;\ntransition: all 0.5s;\n background-image: linear-gradient(#4d4d4d 100%, transparent 0%);\n background-repeat: no-repeat;\n background-size: 0 1px;\n background-position: bottom;\n}\nli:hover {padding: 0.25rem 0rem 0.25rem 2rem;color: #333333;}\n.li_select {\n padding: 0.25rem 1rem;\n color: #706eff;\n font-size: 1rem;\n background-image: linear-gradient(#4d4d4d 100%, transparent 0%);\n background-repeat: no-repeat;\n background-size: 100% 1px;\n background-position: bottom;\n}\n\nspan {\n color: #333;\n font-size: 1.2rem;\n margin: 0.2rem;\n}\n\ntable {\n width: 100%;\n border-collapse: collapse !important;\n box-shadow: 0 0 1rem -1px #cacaca;\n}\n\nth {\n border: 1px solid #cacaca;\n padding: 0.5rem 1rem;\n color: #000;\n font-size: 1.2rem;\n background-color: #ffffff;\n}\n\ntd {\n border: 1px solid #cacaca;\n padding: 0.5rem 1rem;\n}\n\ntr:nth-child(even) {\n background-color: #eee;\n}\ntr:nth-child(odd) {\n background-color: #fff;\n}\n.code {\n box-shadow: 0 0 1rem -1px #cacaca;\n border-radius: 5px;\n border: 1px solid #dddddd;\n padding: 1rem;\n background-color: #f8f8f8;\n}\n</style>\n</head>\n<body>\n<div style=\"display: flex;\n justify-content: space-between;\n align-items: stretch;\n width: 100%;\n height: 100%;\">\n<div class=\"menu\">\n<ul class=\"list-group\" style=\"width: 100%;\">\n{{menu}}</ul>\n</div>\n<div class=\"divisionV\"></div>\n<div id=\"cxt\" class=\"contextRoot\">\n");
        final int[] index = {1};
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        StringBuilder menu = new StringBuilder();
//        md.append("# API开发指南 - V" + JXRMapping.API_VERSION).append(enter);
//        md.append("接口地址：" + JXRMapping.Server).append(enter);

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
//            if (!annotation.createApi()) {
//                continue;
//            }
            menu.append("<li class=\"li_unselect\">"+annotation.describe()+"</li>");
            StringBuilder md = new StringBuilder("<div id=\"Requester"+ index[0] +"\" class=\"context\">");
            md.append("<h2>"+ index[0] +annotation.describe()+"</h2>");
            md.append("<div><span>地址：</span><a href=\""+JXRMapping.Server).append(annotation.path()+"\">"+JXRMapping.Server).append(annotation.path()+"</a></div>");
            md.append("<span>参数:</span>");
            StringBuilder paramSB = new StringBuilder();
            Field[] fields = value.obj.getClass().getFields();
            //反射参数
            IdentityHashMap<String, Pa> tableMap1 = new IdentityHashMap<>();
            insertMap(value.obj.getClass(), tableMap1);
            md.append("<table class=\".table-striped\">\n<tr>\n<th>名称</th>\n<th>类型</th>\n<th>描述</th>\n</tr>");
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
                md.append("<tr>\n<td>"+entry.getKey()+"</td>\n<td>"+type+"</td>\n<td>"+entry.getValue().description+"</td>\n</tr>");
            }
            md.append("</table>");
            for (int i = 0; i < fields.length; i++) {
                AnParam annotation1 = fields[i].getAnnotation(AnParam.class);
                if (annotation1 != null) {
                    String name = fields[i].getType().getName();
                    if (name.indexOf("$") != -1) { //参数为内部类
                        Constructor con2 = null;
                        try {
                            Object o = createObjFromString(name, value.obj);
                            String json = g.toJson(o);
                            json = StringTookit.JSONStringFormat(json);
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
                        json = StringTookit.JSONStringFormat(json);
                        paramSB.append(fields[i].getName()).append("=").append(json);
                    }
                    if (i < value.obj.getClass().getFields().length - 1) {
                        paramSB.append("&");
                    }
                }
            }
            md.append("<span>参数示例</span><pre class=\"code\">").append(paramSB).append("</pre><span>返回值</span>");
            IdentityHashMap<String, Pa> tableMap = new IdentityHashMap<>();
            for (Class<?> aClass : value.obj.getClass().getClasses()) {
                AnResponse an1 = aClass.getAnnotation(AnResponse.class);
                if (an1 != null) {
                    insertMap(aClass, tableMap);
                }
            }
            md.append("<table class=\".table-striped\">\n<tr>\n<th>名称</th>\n<th>类型</th>\n<th>描述</th>\n</tr>");
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
                md.append("<tr>\n<td>"+entry.getKey()+"</td>\n<td>"+type+"</td>\n<td>"+entry.getValue().description+"</td>\n</tr>");

            }
            md.append("</table>");
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

                            }
                        }
                        json = g.toJson(obj);
                        json = StringTookit.JSONStringFormat(json);
                        md.append("<span>返回示例</span><pre class=\"code\">").append(json).append(" </pre>\n</div>\n<div class=\"divisionH\"><br/></div>");
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
                }
            }
            html.append(md.toString());
            index[0] += 1;
            return e;
        }).count();

        html.append("</div>\n</div>\n<script type=\"text/javascript\">\nfunction getOs()\n{\nvar OsObject = \"\";\nif(navigator.userAgent.indexOf(\"MSIE\")>0) {\nreturn \"MSIE\";\n}\nif(isFirefox=navigator.userAgent.indexOf(\"Firefox\")>0){\nreturn \"Firefox\";\n}\nif(isSafari=navigator.userAgent.indexOf(\"Safari\")>0) {\nreturn \"Safari\";\n}\nif(isCamino=navigator.userAgent.indexOf(\"Camino\")>0){\nreturn \"Camino\";\n}\nif(isMozilla=navigator.userAgent.indexOf(\"Gecko/\")>0){\nreturn \"Gecko\";\n}\n\n}window.onload = function () {\nvar menus = document.getElementsByTagName(\"li\");\nfor (var i = 0; i < menus.length; i++) {\nmenus[i].index=i+1;\nmenus[i].onclick = function () {\nfor (var j = 0; j < menus.length; j++) {\nmenus[j].className = \"\";\n}\nthis.className = \"li_select\";\nvar req = document.getElementById(\"Requester\" + this.index);\nvar div = document.getElementById(\"cxt\");\nconsole.log(this.index+\" \"+div.offsetTop);\nvar currTop = div.scrollTop;\nvar reqTop = req.offsetTop;\nvar yz= Math.abs(currTop-reqTop)/30\nconsole.log(\"yz:\"+yz);\nvar time_id = setInterval(function () {\nif (reqTop > currTop) {\ncurrTop += yz;\n} else {\ncurrTop -= yz;\n}\nif(getOs()==\"Firefox\"){\ndiv.scrollTo(0,currTop);\n}else{\ndiv.scrollTop=currTop;\n}\nif (Math.abs(currTop - reqTop)<yz||currTop-reqTop==0) {\nif(reqTop>0){\nif(currTop>reqTop){\nif(getOs()==\"Firefox\"){\ndiv.scrollTo(0,currTop);\n}else{\ndiv.scrollTop=currTop;\n}\n}else{\nif(getOs()==\"Firefox\"){\ndiv.scrollTo(0,reqTop);\n}else{\ndiv.scrollTop=reqTop;\n}\n}\n}else{\nif(getOs()==\"Firefox\"){\ndiv.scrollTo(0,0);\n}else{\ndiv.scrollTop=0;\n}\n}\nclearInterval(time_id); if(getOs()==\"Firefox\"){\ndiv.scrollTo(0,reqTop);\n}else{\ndiv.scrollTop=reqTop;\n};\n}\n},1);\n};\n}\n}\n</script>\n</body>\n</html>");
        int i = html.indexOf("{{menu}}");
        html.replace(i,i+8,menu.toString());
        PrintWriter out = response.getWriter();
        out.print(html);
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
                    insertMap(fieldGenericType, tableMap);
                } else {
                    insertMap(field.getType(), tableMap);
                }

            }
        }
    }

    public Object createObjFromString(String name, Object parent) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
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