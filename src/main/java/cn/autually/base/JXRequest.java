package cn.autually.base;


import com.work.common.md5.SecretUtils;

import javax.servlet.http.Part;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.IdentityHashMap;

/**
 * Created by fangzhen on 2016/11/27.
 */
public class JXRequest {
    public HashMap<String, String> params = new HashMap<>();
    public IdentityHashMap<String, FileWraper> files = new IdentityHashMap<>();
    public PrintWriter out;

    public class FileWraper {
        public Part part;
        public String savePath;
        public String url;
        public String savePathBase;
        public String fileName;
        public String pref;

        public String save() {
            if (part != null) {
                try {
                    part.write(savePath);
                    return url;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }
    }

    public void sendResponse(String s) {
        if (out != null) {
            if (params.containsKey("encrypt")&&"true".equals(params.get("encrypt"))){
                out.print(SecretUtils.enParameterByDES(s));
            }else {
                out.print(s);
            }
            out.flush();
            out.close();
        }
    }
}
