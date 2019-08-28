package cn.autually.base;

import com.work.common.md5.SecretUtils;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.net.URLDecoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

/**
 * Created by fangzhen on 2016/11/24.
 */
@WebServlet(urlPatterns = "/api/*")
@MultipartConfig
public class JXServiceController extends JXBaseController {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println(req.getRequestURI() + " " + req.getContentType());
        String contentType = req.getContentType();
        if (contentType == null) {
            return;
        }
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        resp.addHeader("Access-Control-Allow-Origin", "*");
        resp.addHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
        Path savePath = Paths.get(req.getServletContext().getRealPath(JXRMapping.UPLOAD_FILE));
        if (!Files.exists(savePath)) {
            Files.createDirectory(savePath);
        }
        if (contentType.startsWith("application/x-www-form-urlencoded")) {
//            for (Map.Entry<String, String[]> se : req.getParameterMap().entrySet()) {
//                System.out.println(se.getKey());
//                System.out.println(se.getValue()[0]);
//            }
            executeParams(req,resp);
        } else if (contentType.startsWith("multipart/form-data")) {
            String path = req.getRequestURI();
            System.out.println(path);
            JXRMapping.Requester rmr = JXRMapping.requesterMap.get(path.substring(req.getContextPath().length()+4));
            if (rmr == null || rmr.obj == null || rmr.method == null) {
                PrintWriter out = resp.getWriter();
                out.print("{\"msg\":\"url错误\"}");
                out.flush();
                out.close();
                return;
            }
            JXRequest jxRequest = new JXRequest();
            jxRequest.out = resp.getWriter();
            for (Part part : req.getParts()) {
                System.out.println("name->"+part.getName() + " " + part.getSize() + " type->" + part.getContentType());
                if (part.getContentType()==null || part.getContentType().startsWith("text/plain")) {
                    StringBuilder sb = new StringBuilder();
                    InputStream inputStream = part.getInputStream();
                    char[] buff = new char[512];
                    int len = -1;
                    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream,"UTF-8"));
                    while ((len = reader.read(buff)) != -1) {
                        sb.append(buff, 0, len);
                    }
//                    System.out.println(sb);//参数值
                    if(part.getName().equals("encrypt")) {
                        jxRequest.params.put(part.getName(), sb.toString());
                    } else  {
                        jxRequest.params.put(part.getName(), SecretUtils.deParameterByDES(URLDecoder.decode(sb.toString())));
                    }
                    //jxRequest.params.put(part.getName(),sb.toString());
                } else {
                    String header = part.getHeader("content-disposition");
                    String fileName = header.substring(header.lastIndexOf("=") + 2, header.length() - 1);
                    System.out.println(fileName);
//                    part.write(savePath + File.separator + fileName);
//                    Date time= Calendar.getInstance().getTime();
//                    String t = JXRMapping.format.format(time);
//                    String s = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
                    StringBuilder sp = new StringBuilder();
                    sp.append(savePath);
                    sp.append(File.separator);
                    sp.append(getDateString());
                    sp.append(File.separator);
                    sp.append(getTimeString());
                    sp.append(System.nanoTime());
                    sp.append(fileName.substring(fileName.lastIndexOf(".")));
                    Path dirPath = Paths.get(savePath + File.separator + getDateString());
                    if (!Files.exists(dirPath)) {
                        Files.createDirectory(dirPath);
                    }
//                    System.out.println(savePath);
//                    System.out.println(savePath + File.separator);
                    System.out.println(sp);
                    String pref = savePath.getParent().toString();
//                    part.write(sp.toString());//+ fileName.substring(1)
                    JXRequest.FileWraper fileWraper = jxRequest.new FileWraper();
                    fileWraper.part=part;
                    fileWraper.savePath=sp.toString();
                    fileWraper.savePathBase=savePath.toString();
                    fileWraper.fileName=fileName;
                    fileWraper.pref=pref;
                    fileWraper.url = sp.toString().substring(pref.length()).replaceAll("\\\\","/");
                    jxRequest.files.put(part.getName(),fileWraper);
                }
            }
            try {
                rmr.method.invoke(rmr.obj, jxRequest);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }

        }
    }
    public String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
    }
    public String getDateString() {
        String rel;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        Date curDate = new Date(System.currentTimeMillis());
        rel = formatter.format(curDate);
        return rel;
    }
    public String getTimeString() {
        String rel;
        SimpleDateFormat formatter = new SimpleDateFormat("HHmmss");
        Date curDate = new Date(System.currentTimeMillis());
        rel = formatter.format(curDate);
        return rel;
    }
    public String getDateTimeString() {
        String rel;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        Date curDate = new Date(System.currentTimeMillis());
        rel = formatter.format(curDate);
        return rel;
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        executeParams(request,response);
    }

    protected  void executeParams(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String path = request.getRequestURI();
//        System.out.println("--------path-------");
//        System.out.println(request.getContextPath());
//        System.out.println(path);
//        for (Map.Entry<String, JXRMapping.Requester> entry : JXRMapping.requesterMap.entrySet()) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }
        JXRMapping.Requester rmr = JXRMapping.requesterMap.get(path.substring(request.getContextPath().length()+4));
        try {
            String encrypt = StringUtils.defaultIfBlank(request.getParameter("encrypt"), "");
            if(StringUtils.isNotEmpty(encrypt)&&encrypt.equals("true")) {

                if (rmr != null && rmr.obj != null && rmr.method != null) {
                    JXRequest jxRequest = new JXRequest();
                    for (Map.Entry<String, String[]> se : request.getParameterMap().entrySet()) {
                        if(se.getValue().length>0) {
                            if(se.getKey().equals("encrypt")) {
                                jxRequest.params.put(se.getKey(), se.getValue()[0]);
                            } else  {
                                jxRequest.params.put(se.getKey(), SecretUtils.deParameterByDES(URLDecoder.decode(se.getValue()[0])));
                            }
                        }else{
                            jxRequest.params.put(se.getKey(), "");
                        }
                    }
                    jxRequest.out = response.getWriter();

                    rmr.method.invoke(rmr.obj, jxRequest);
                }else{
                    PrintWriter out = response.getWriter();
                    out.print("{\"msg\":\"url错误\"}");
                    out.flush();
                    out.close();
                }

            }else{
                if (rmr != null && rmr.obj != null && rmr.method != null) {
                    JXRequest jxRequest = new JXRequest();
                    for (Map.Entry<String, String[]> se : request.getParameterMap().entrySet()) {
                        if(se.getValue().length>0) {
                            jxRequest.params.put(se.getKey(), se.getValue()[0]);
                        }else{
                            jxRequest.params.put(se.getKey(), "");
                        }
                    }
                    jxRequest.out = response.getWriter();

                    rmr.method.invoke(rmr.obj, jxRequest);
                }else{
                    PrintWriter out = response.getWriter();
                    out.print("{\"msg\":\"url错误\"}");
                    out.flush();
                    out.close();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }catch (InvocationTargetException e){
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

}
