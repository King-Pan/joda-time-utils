package club.javalearn.date.utils;

import org.joda.time.DateTime;

/**
 * @author king-pan
 * @date 2019/1/4
 * @Description  joda-time日期工具类
 */
public class DateUtil {


    /**
     * 默认的date格式
     */
    public static final String DEFAULT_DATE_FORMAT = "yyyyMMdd";

    /**
     * 默认的time格式
     */
    public static final String DEFAULT_TIME_FORMAT = "yyyyMMddHHmmss";

    public static String getLastMonday(){
        //获取当前日期
        DateTime dateTime = new DateTime();
        //获取本周日日期
        dateTime = dateTime.withDayOfWeek(7);
        //本周日-7天得到上周日日期
        dateTime = dateTime.plusDays(-7);
        return dateTime.toString(DEFAULT_DATE_FORMAT);
    }

    public static String getCurrentTime(){
        //获取当前时间
        DateTime now = new DateTime();
        return now.toString(DEFAULT_TIME_FORMAT);
    }


    public static void main(String[] args) {
        System.out.println(DateUtil.getLastMonday());
        System.out.println(DateUtil.getCurrentTime());
    }
}
