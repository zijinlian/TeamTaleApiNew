package com.work.common;

import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@SuppressWarnings("unused")
public class DateUtil {

    public static final String formatYMDHMS = "yyyy-MM-dd HH:mm:ss";
    public static final String noFormatYMDHMS = "yyyyMMddHHmmss";
    public static final String formatYMD = "yyyy-MM-dd";
    public static final String formatChinaYMD = "yyyy年-MM月-dd日 HH时:mm分:ss秒";

    /**
     * 缺省格式化日期，返回yyyy-MM-dd格式日期
     *
     * @param date
     * @return
     */
    public static String defaultFormat(Date date) {
        return defaultFormat(date, "yyyy-MM-dd");
    }

    /**
     * 缺省格式化日期，返回yyyy-MM-dd HH:mm:ss格式日期
     *
     * @param date
     * @return yyyy-MM-dd HH:mm:ss
     */
    public static String formatDate(Date date) {
        return defaultFormat(date, "yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 缺省格式化日期，返回指定格式日期
     *
     * @param date
     * @return
     */
    public static String defaultFormat(Date date, String format) {
        if (date == null) {
            return "";
        }
        SimpleDateFormat sf = new SimpleDateFormat(format);
        return sf.format(date);
    }

    /**
     * 缺省格式化日期，返回yyyy-MM-dd格式日期
     *
     * @param date
     * @return
     */
    public static String defaultFormat(long date) {
        return defaultFormat(new Date(date), "yyyy-MM-dd");
    }

    /**
     * 缺省格式化日期，返回指定格式日期
     *
     * @param date
     * @return
     */
    public static String defaultFormat(long date, String format) {
        return defaultFormat(new Date(date), format);
    }

    /**
     * 将字符串转换为日期类型
     *
     * @param dateStr
     * @param format
     * @return
     * @throws ParseException
     */
    public static Date StringToDate(String dateStr, String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date date = sdf.parse(dateStr);
        return date;
    }

    public static String StringFormatString(String dateStr) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(dateStr);
        return formatDate(date);
    }

    public static String StringFormatString2(String dateStr) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(dateStr);
        return defaultFormat(date);
    }

    public static String dateToString(Date date) {
        String format = "yyyy年MM月dd日 HH点:mm分:ss秒";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

    public static String dateToString(Date date, String format) {
        //String format = "yyyy年MM月dd日 hh点:mm分:ss秒";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

    /**
     * 根据日期获得星期
     *
     * @param date
     * @return
     */
    public static String getWeekOfDate(Date date) {
        String[] weekDaysName = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        String[] weekDaysCode = {"0", "1", "2", "3", "4", "5", "6"};
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int intWeek = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        return weekDaysName[intWeek];
    }

    /**
     * 获得前day天的日期
     *
     * @return
     * @throws ParseException
     */
    public static Date getLastDate(int day) throws ParseException {
        Calendar c = Calendar.getInstance();
        Date date = new Date();
        c.setTime(date);
        c.add(Calendar.DAY_OF_MONTH, -day);
        Date lastDate = c.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String str = defaultFormat(lastDate);
        return sdf.parse(str);
    }

    /**
     * 获得明天的日期
     *
     * @return
     * @throws ParseException
     */
    public static Date getTomorrowDate() {
        Calendar c = Calendar.getInstance();
        Date date = new Date();
        c.setTime(date);
        c.add(Calendar.DAY_OF_MONTH, +1);
        Date lastDate = c.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String str = defaultFormat(lastDate);
        try {
            return sdf.parse(str);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 将日期推后n个月
     *
     * @param dateStr
     * @return
     */
    public static String getAddMonth(String dateStr, int yearAdd, int monthAdd, int dayAdd, int hourAdd) {
        if (dateStr == null || dateStr.equals("")) {
            return "";
        }

        String formatStr = "yyyy-MM-dd HH:mm";
        SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
        Calendar cal = Calendar.getInstance();
        Date newDate = null;
        try {
            Date date = sdf.parse(dateStr);
            cal.setTime(date);
            int year = cal.get(Calendar.YEAR) + yearAdd;
            int month = cal.get(Calendar.MONTH) + 1 + monthAdd;
            int day = cal.get(Calendar.DATE) + dayAdd;

            int hour = cal.get(Calendar.HOUR_OF_DAY) + hourAdd;
            int minute = cal.get(Calendar.MINUTE);

            newDate = sdf.parse(year + "-" + month + "-" + day + " " + hour + ":" + minute);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return DateUtil.defaultFormat(newDate, formatStr);
    }

    public static Date getLastDayOfMonth(Date date) {
        Calendar cDay = Calendar.getInstance();
        cDay.setTime(date);
        cDay.set(Calendar.DAY_OF_MONTH, cDay.getActualMaximum(Calendar.DAY_OF_MONTH));
        return cDay.getTime();
    }

    /**
     * 获得当前年份
     *
     * @return
     */
    public static int getYear() {
        return Calendar.getInstance().get(Calendar.YEAR);
    }

    /**
     * 获得当前月份
     *
     * @return
     */
    public static int getMonth() {
        return Calendar.getInstance().get(Calendar.MONTH) + 1;
    }

    /**
     * 获得某月最后一天
     *
     * @return
     */
    public static String getLastDayOfMonth(int year, int month) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DATE));
        return new SimpleDateFormat("yyyy-MM-dd ").format(cal.getTime());
    }

    /**
     * 获得某月第一天
     *
     * @return
     */
    public static String getFirstDayOfMonth(int year, int month) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.DAY_OF_MONTH, cal.getMinimum(Calendar.DATE));
        return new SimpleDateFormat("yyyy-MM-dd ").format(cal.getTime());
    }

    /**
     * 获取2个天数差  单位天
     *
     * @param beginDate
     * @param endDate
     * @return
     * @throws ParseException
     */
    public static int getTheday(Date beginDate, Date endDate) throws ParseException {
        Long timethis = DateUtil.StringToDate(DateUtil.defaultFormat(beginDate), "yyyy-MM-dd").getTime();
        Long timeend = DateUtil.StringToDate(DateUtil.defaultFormat(endDate), "yyyy-MM-dd").getTime();
        Long theday = (timeend - timethis) / (1000 * 60 * 60 * 24);
        return theday.intValue();
    }

    public static Date getAddDate(int minute) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE, minute);
        return calendar.getTime();
    }

    public static Date getAddDay(Date date, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, day);
        return calendar.getTime();
    }

    public static Date getYear(Date date, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.YEAR, year);
        return calendar.getTime();
    }

    /**
     * 返回指定年季的季的第一天
     *
     * @param year
     * @param quarter
     * @return
     */
    public static String getFirstDayOfQuarter(Integer year, Integer quarter) {
        Calendar calendar = Calendar.getInstance();
        int month;
        if (quarter == 1) {
            month = 1;
        } else if (quarter == 2) {
            month = 4;
        } else if (quarter == 3) {
            month = 7;
        } else if (quarter == 4) {
            month = 10;
        } else {
            month = calendar.get(Calendar.MONTH);
        }
        return getFirstDayOfMonth(year, month);
    }

    /**
     * 返回指定年季的季的最后一天
     *
     * @param year
     * @param quarter
     * @return
     */
    public static String getLastDayOfQuarter(Integer year, Integer quarter) {
        Calendar calendar = Calendar.getInstance();
        int month;
        if (quarter == 1) {
            month = 3;
        } else if (quarter == 2) {
            month = 6;
        } else if (quarter == 3) {
            month = 9;
        } else if (quarter == 4) {
            month = 12;
        } else {
            month = calendar.get(Calendar.MONTH);
        }
        return getLastDayOfMonth(year, month);
    }

    /**
     * 返回指定日期的季度
     *
     * @param date
     * @return
     */
    public static int getQuarterOfYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.MONTH) / 3 + 1;
    }

    /**
     * 根据日期和当前时间比较 返回对应 字符串 如: 2天前, 今天 9:00
     * isMinute date格式是否保护时 分
     *
     * @param date
     * @return
     */
    @SuppressWarnings("unchecked")
    public static String getDayStrFormat(String date, boolean isMinute) {
        try {
            int days = getTheday(StringToDate(date, "yyyy-MM-dd"), StringToDate(defaultFormat(new Date()), "yyyy-MM-dd"));
            if (days >= 1) {
                return StringUtils.join(days, "天前");
            } else {
                if (isMinute) {
                    return StringUtils.join("今天", defaultFormat(StringToDate(date, "yyyy-MM-dd HH:mm"), "HH:mm"));
                } else {
                    return "今天";
                }
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";
    }

    //由出生日期获得年龄
    public static int getAge(Date birthDay) {
        Calendar cal = Calendar.getInstance();
        if (cal.before(birthDay)) {
            throw new IllegalArgumentException(
                    "The birthDay is before Now.It's unbelievable!");
        }
        int yearNow = cal.get(Calendar.YEAR);
        int monthNow = cal.get(Calendar.MONTH);
        int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH);
        cal.setTime(birthDay);

        int yearBirth = cal.get(Calendar.YEAR);
        int monthBirth = cal.get(Calendar.MONTH);
        int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);

        int age = yearNow - yearBirth;

        if (monthNow <= monthBirth) {
            if (monthNow == monthBirth) {
                if (dayOfMonthNow < dayOfMonthBirth) age--;
            } else {
                age--;
            }
        }
        return age;
    }

    /**
     * 日期比较
     * @param startDateStr 开始时间
     * @param endDateStr 结束时间
     * @param dataStr 要比较的时间
     * @return
     * @throws ParseException
     */
    public static boolean dataCompare(String startDateStr,String endDateStr,String dataStr) throws ParseException {
        Date startDate = StringToDate(startDateStr,formatYMD);
        Date endDate = StringToDate(endDateStr,formatYMD);
        Date date = StringToDate(dataStr,formatYMD);

        if (startDate.getTime()< date.getTime()){
            if (endDate.getTime()>date.getTime()) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) throws ParseException {
        System.out.println(dateToString(getYear(new Date(),-20),"yyyy-MM-dd"));
        System.out.println(dataCompare("1982-05-22","1990-05-22","1986-03-20"));
    }
}
