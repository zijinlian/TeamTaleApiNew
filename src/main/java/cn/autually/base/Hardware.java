package cn.autually.base;

/**
 * Created by fangzhen on 2016/12/5.
 */


public class Hardware {
    public enum ESystem {
        LINUX, MAC, WINDOWS
    }
    public static String getSystem() {
        return System.getProperty("os.name");
    }

    public static ESystem getESystem() {
        String os = System.getProperty("os.name");
        if(os.toLowerCase().startsWith("mac")){
            return ESystem.MAC;
        }else if(os.toLowerCase().startsWith("win")){
            return ESystem.WINDOWS;
        }else{
            return ESystem.LINUX;
        }
    }
    public static boolean isWindows(){
        ESystem eSystem = getESystem();
        if (eSystem== ESystem.WINDOWS) {
            return true;
        }
        return false;
    }
}