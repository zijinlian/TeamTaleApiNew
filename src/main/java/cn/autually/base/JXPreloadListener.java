package cn.autually.base;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by fangzhen on 2016/11/27.
 */
public class JXPreloadListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("contextInitialized");
//        try {
//            DBRegister.regist(User.class);
//            DBRegister.regist(RoleBean.class);
//            DBRegister.regist(Message.class);
//            DBRegister.regist(Group.class);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        System.out.println(servletContextEvent.getServletContext().getContextPath());
//        String path = this.getClass().getClassLoader().getResource(".").getPath();
//        String path1 = servletContextEvent.getServletContext().getRealPath("/");
//        if (Hardware.isWindows()) {
//            path = path.substring(1);
//        }
        String path= servletContextEvent.getServletContext().getClassLoader().getResource("/").getPath();
//        path = path + "/WEB-INF/classes";
        System.out.println(path);
        if (Hardware.isWindows()) {
            path = path.substring(1);
        }
        registerController(Paths.get(path), Paths.get(path));

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("contextDestroyed");
    }

    public void registerController(Path base, Path path) {
        DirectoryStream<Path> pathsFilter = null;
        try {
            pathsFilter = Files.newDirectoryStream(path, "*");//"*.{java,txt,bat,class}"
            for (Path p : pathsFilter) {
//                System.out.println(p.toString());
                if (Files.isDirectory(p)) {
                    registerController(base, p);
                } else {
                    if (p.toAbsolutePath().toString().endsWith(".class")) {
                        String s = p.toAbsolutePath().toString();
//                        s = s.replaceAll(base.toString(), "");
                        s = s.substring(base.toString().length());
                        if (Hardware.isWindows()) {
                            s = s.replaceAll("\\\\", ".");
                        } else {
                            s = s.replaceAll("/", ".");
                        }
                        s = s.replaceAll(".class", "");
//                        System.out.println(s);
                       	if(s.startsWith(".")){
                       		s = s.substring(1);
                       	}
                        try {
//                            System.out.println(s);
                            if (!s.startsWith(JXRMapping.REQUESTER_PACKAGE)) {
                                continue;
                            }
                            Class<?> aClass = Class.forName(s);
                            AnController annotation = aClass.getAnnotation(AnController.class);
                            if (annotation != null) {
                                Object obj = aClass.newInstance();
                                for (Method method : aClass.getMethods()) {
                                    AnRequestMapping requestMappingAnn = method.getAnnotation(AnRequestMapping.class);
                                    if (requestMappingAnn != null) {
                                        String url = annotation.path();
                                        JXRMapping.Requester requester = new JXRMapping.Requester();
                                        requester.obj = obj;
                                        requester.method = method;
                                        JXRMapping.requesterMap.put(url, requester);
                                        System.out.println(url);
                                    }
                                }
                            }
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        } catch (InstantiationException e) {
                            e.printStackTrace();
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
