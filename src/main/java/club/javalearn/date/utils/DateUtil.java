package club.javalearn.date.utils;

import org.joda.time.DateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author king-pan
 * @date 2019/1/4
 * @Description joda-time日期工具类
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

    public static final String YYYY_MM_DD_HH_SS_MM = "yyyy-MM-dd HH:mm:ss";

    public static String getLastMonday() {
        //获取当前日期
        DateTime dateTime = new DateTime();
        //获取本周日日期
        dateTime = dateTime.withDayOfWeek(7);
        //本周日-7天得到上周日日期
        dateTime = dateTime.plusDays(-7);
        return dateTime.toString(DEFAULT_DATE_FORMAT);
    }


    public static String parseDate(String dateFormat, String date, String format) {
        String time = "";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
        try {
            DateTime dateTime = new DateTime(simpleDateFormat.parse(date).getTime());
            time = dateTime.toString(format);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return time;
    }

    public static String getCurrentTime() {
        //获取当前时间
        DateTime now = new DateTime();
        return now.toString(DEFAULT_TIME_FORMAT);
    }


    public static void main(String[] args) {
        System.out.println(DateUtil.getLastMonday());
        System.out.println(DateUtil.getCurrentTime());

        System.out.println(DateUtil.parseDate("yyyy-MM-dd HH:mm:ss","2019-01-08 01:31:03","yyyyMMddHHmmss"));
    }
}
