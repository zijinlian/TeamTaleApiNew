package cn.autually.base;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by fangzhen on 2016/12/5.
 */
public class CommonUtils {
     static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static  String date2string(Date d){
        return format.format(d);
    }
}
