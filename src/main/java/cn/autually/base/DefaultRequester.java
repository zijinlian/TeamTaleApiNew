package cn.autually.base;

import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;

import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.UUID;


/**
 * Created by fangzhen on 2016/12/5.
 */
public class DefaultRequester implements IBeanCopy {

    public Object setHeader(Object obj,String message,String status,boolean scuess){
        try {
            Field msg = obj.getClass().getField("msg");
            if (msg != null) {
                msg.set(obj,message);
            }
            Field s = obj.getClass().getField("status");
            if (s != null) {
                s.set(obj,status);
            }
            Field su = obj.getClass().getField("success");
            if (su != null) {
                su.set(obj,scuess);
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return  obj;
    }

    public SqlSession openSession(){
        return DBPool.getInstance().openSession();
    }
    public SqlSession openSession(ExecutorType type){
        return DBPool.getInstance().openSession(type);
    }

    public Object fromJson(String json, Class cls){
        return JXRMapping.g.fromJson(json,cls);
    }
    public String toJson(Object obj){
        return JXRMapping.g.toJson(obj);
    }
    public String uuid(){
        return UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
    }
    public String getTime(){
        SimpleDateFormat f=new SimpleDateFormat("HHmmss");
        return f.format(Calendar.getInstance().getTime());
    }
    public String getDate(){
        SimpleDateFormat f=new SimpleDateFormat("yyyyMMdd");
        return f.format(Calendar.getInstance().getTime());
    }
    public String getDateTime(){
        SimpleDateFormat f=new SimpleDateFormat("yyyyMMddHHmmss");
        return f.format(Calendar.getInstance().getTime());
    }
    public int s2i(String s){
        int i = 0;
        try {
            i = Integer.parseInt(s);
        }catch (Exception e){
            e.printStackTrace();
        }
        return i;
    }

    public String getMD5(String s) {
        char hexDigits[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        try {
            byte[] btInput = s.getBytes();
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            mdInst.update(btInput);
            byte[] md = mdInst.digest();
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /***
     * MD5加码 生成32位md5码
     */
    public String string2MD5(String inStr){
        MessageDigest md5 = null;
        try{
            md5 = MessageDigest.getInstance("MD5");
        }catch (Exception e){
            System.out.println(e.toString());
            e.printStackTrace();
            return "";
        }
        char[] charArray = inStr.toCharArray();
        byte[] byteArray = new byte[charArray.length];

        for (int i = 0; i < charArray.length; i++)
            byteArray[i] = (byte) charArray[i];
        byte[] md5Bytes = md5.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++){
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16)
                hexValue.append("0");
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();

    }

    /**
     * 所有数据是否都为空
     *
     * @param objs
     * @return
     */
    public boolean empty(Object... objs) {
        for (Object obj : objs) {
            if (obj != null && !obj.toString().equals("")) {
                return false;
            }
        }
        return true;
    }
}
