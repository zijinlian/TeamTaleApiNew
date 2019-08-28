package cn.autually.base;

import java.lang.reflect.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

/**
 * Created by fangzhen on 2016/12/5.
 */
public interface IBeanCopy {

    default void copy(Object dst, Object src, Class type, Object parent) throws InstantiationException, IllegalAccessException {
        if (src == null) return;
        if (type == null&&parent==null) {
            copy(dst, src);
        } else {
            Class<?> dstClass = dst.getClass();
            Class<?> srcClass = src.getClass();
            if (Collection.class.isAssignableFrom(dstClass) && Collection.class.isAssignableFrom(srcClass)) {
                List srcList = (List) src;
                List dstList = (List) dst;
                if (dstList == null) {
                    dstList = new ArrayList();
                }
                for (int i = 0; i < srcList.size(); i++) {
                    Object s = srcList.get(i);
                    Object d = null;
//                                copy(d, s);
                    if (type.getName().indexOf("$")!=-1){
                        try {
                            Constructor<?> constructor = type.getConstructor(parent.getClass());
                            d = constructor.newInstance(parent);
                            copy(d,s);
                        } catch (NoSuchMethodException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e) {
                            e.printStackTrace();
                        }
                    }else{
                        d = type.newInstance();
                        copy(d,s);
                    }
                    dstList.add(d);
                }
            }
        }
    }

    default void copy(Object dst, Object src) throws IllegalAccessException, InstantiationException {
        if (src == null) return;
        if (dst == null) {
            return;
        }
        Class<?> dstClass = dst.getClass();
        Class<?> srcClass = src.getClass();
        if (Collection.class.isAssignableFrom(dstClass) && Collection.class.isAssignableFrom(srcClass)) {
            List srcList = (List) src;
            List dstList = (List) dst;
            if (dstList == null) {
                dstList = new ArrayList();
            }
            for (int i = 0; i < srcList.size(); i++) {
                Object s = srcList.get(i);
//                                Object d = ;
//                                copy(d, s);
                System.out.println(((ParameterizedType) dstClass.getGenericSuperclass()).getActualTypeArguments()[0]);
                dstList.add(s);
            }
        } else {
            for (Field dstField : dstClass.getDeclaredFields()) {
//                System.out.println(srcField.getName());
                Field srcField = null;
                try {
                    srcField = srcClass.getDeclaredField(dstField.getName());
                } catch (NoSuchFieldException e) {
//                    e.printStackTrace();
                    continue;
                }
                Class<?> srcType = srcField.getType();
                Class<?> dstType = dstField.getType();
                srcField.setAccessible(true);
                dstField.setAccessible(true);
                if (srcField != null) {
                    if (dstType.getTypeName().indexOf("$") != -1) {
                        try {
                            Constructor<?> constructor = dstType.getConstructor(dstClass);
                            dstField.set(dst, constructor.newInstance(dst));
                            Object srcO = srcField.get(src);
                            Object dstO = dstField.get(dst);
                            copy(dstO, srcO);
                        } catch (IllegalAccessException e) {
//                            e.printStackTrace();
                        } catch (InstantiationException e) {
//                            e.printStackTrace();
                        } catch (NoSuchMethodException e) {
//                            e.printStackTrace();
                        } catch (InvocationTargetException e) {
//                            e.printStackTrace();
                        }
                    } else if (Collection.class.isAssignableFrom(srcType) && Collection.class.isAssignableFrom(dstType)) {
                        try {
                            if (dstType.getTypeName().indexOf("$") != -1) {
                                List srcList = (List) srcField.get(src);
//                                Class srcGenericTypeClass = getFieldGenericType(srcField);
//                                Constructor srcConstructor = srcGenericTypeClass.getConstructor(srcClass);

                                List dstList = (List) dstField.get(dst);
                                if (dstList == null) {
                                    dstList = new ArrayList();
                                    dstField.set(dst, dstList);
                                }
                                Class dstGenericTypeClass = getFieldGenericType(dstField);
                                Constructor constructor = dstGenericTypeClass.getConstructor(dstClass);

                                for (int i = 0; i < srcList.size(); i++) {
                                    Object s = srcList.get(i);
                                    Object d = constructor.newInstance(dst);
                                    copy(d, s);
                                    dstList.add(d);
                                }
                            } else {
                                List srcList = (List) srcField.get(src);
//                                Class srcGenericTypeClass = getFieldGenericType(srcField);
//                                Constructor srcConstructor = srcGenericTypeClass.getConstructor(srcClass);

                                List dstList = (List) dstField.get(dst);
                                if (dstList == null) {
                                    dstList = new ArrayList();
                                    dstField.set(dst, dstList);
                                }
                                Class dstGenericTypeClass = getFieldGenericType(dstField);

                                for (int i = 0; i < srcList.size(); i++) {
                                    Object s = srcList.get(i);
                                    Object d = dstGenericTypeClass.newInstance();
                                    copy(d, s);
                                    dstList.add(d);
                                }
                            }
                        } catch (NoSuchMethodException e) {
//                            e.printStackTrace();
                        } catch (InvocationTargetException e) {
//                            e.printStackTrace();
                        }
                    } else if (srcType == Object.class) {
                        Object srcO = srcField.get(src);
                        Object dstO = dstField.get(dst);
                        copy(dstO, srcO);
                    } else {
                        try {
                            if (dstType == srcType) {
                                Object o = srcField.get(src);
                                if (o == null || o.equals("")) {
                                    dstField.set(dst, null);
                                } else {
                                    dstField.set(dst, srcField.get(src));
                                }
                            } else if (srcType == Date.class && dstType == String.class) {
                                Date date = (Date) srcField.get(src);
                                dstField.set(dst, JXRMapping.format.format(date));
                            } else if (srcType == Date.class && (dstType == Long.class || dstType == Int.getClass())) {
                                Date date = (Date) srcField.get(src);
                                dstField.set(dst, date.getTime());
                            } else if ((dstType == Integer.class && srcType == int.class) ||
                                    (dstType == int.class && srcType == Integer.class) ||
                                    (dstType == Double.class && srcType == double.class) ||
                                    (dstType == double.class && srcType == Double.class)
                                    ) {
                                Object o = srcField.get(src);
                                if (o != null) {
                                    dstField.set(dst, o);
                                }
                            } else if ((dstType == Double.class || dstType == double.class) && srcType == String.class) {
                                double v = Double.parseDouble((String) srcField.get(src));
                                dstField.set(dst, v);
                            } else if ((dstType == Integer.class || dstType == int.class) && srcType == String.class) {
                                String _s = (String) srcField.get(src);
                                if (_s != null && _s.trim().equals("") == false) {
                                    int v = Integer.parseInt(_s);
                                    dstField.set(dst, v);
                                }
                            } else if (dstType == BigDecimal.class && srcType == String.class) {
                                String _s = (String) srcField.get(src);
                                if (_s != null && _s.trim().equals("") == false) {
                                    double v = Double.parseDouble(_s);
                                    dstField.set(dst, new BigDecimal(v));
                                }
                            }
                        } catch (IllegalAccessException e) {
//                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        copyMethod(dst, src);
    }

    default void copyMethod(Object dst, Object src) {
        if (dst == null) throw new IllegalArgumentException("拷贝的目标对象为null");
        if (src == null) throw new IllegalArgumentException("拷贝的源对象为null");
        Class<?> srcClass = src.getClass();
        Class<?> dstClass = dst.getClass();
        for (Method method : srcClass.getMethods()) {
            String name = method.getName();
            if (name.startsWith("get")) {
//                System.out.println(name);
                Field declaredField = null;
                try {
                    String s = StringTookit.methodToParam(name);
//                    System.out.println(s);
                    declaredField = dstClass.getDeclaredField(s);
                } catch (NoSuchFieldException e) {
                }
                if (declaredField != null) {
                    try {
                        Object invoke = method.invoke(src);
                        if (declaredField.getType() == method.getReturnType()) {
                            declaredField.set(dst, invoke);
                        }
                    } catch (IllegalAccessException e) {
//                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
//                        e.printStackTrace();
                    }
                } else {
                    try {
                        Method setMethod = dstClass.getMethod("set" + name.substring(3), Object.class);
                        if (setMethod != null) {
                            setMethod.invoke(dst, method.invoke(src));
                        }
                    } catch (NoSuchMethodException e) {
//                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
//                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
//                        e.printStackTrace();
                    }
                }

            }
        }
    }

    default Class getFieldGenericType(Field field) {
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
