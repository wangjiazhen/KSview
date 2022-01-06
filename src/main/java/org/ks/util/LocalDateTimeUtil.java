package org.ks.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Pattern;

/**
 * java 8 LocalDateTime 时间转换工具类
 */
public final class LocalDateTimeUtil {
    private static Logger log = LoggerFactory.getLogger(LocalDateTimeUtil.class);
    /**
     * 默认时间格式 yyyy-MM-dd
     */
    private static final DateTimeFormatter DEFAULT_DATETIME_FORMATTER = TimeFormat.SHORT_DATE_PATTERN_NONE.formatter;

    /**
     * 无参数的构造函数,防止被实例化
     */
    private LocalDateTimeUtil() {
    }

    /**
     * 获取两个时间点的月份差
     *
     * @param start 第一个时间点
     * @param end 第二个时间点
     * @return 月数差
     */
    public static Integer monthDiff(LocalDate start, LocalDate end) {
        //获取第一个时间点的月份
        int month1 = start.getMonthValue();
        //获取第一个时间点的年份
        int year1 = start.getYear();
        //获取第一个时间点的月份
        int month2 = end.getMonthValue();
        //获取第一个时间点的年份
        int year2 = end.getYear();
        //返回两个时间点的月数差
        return (year2 - year1) * 12 + (month2 - month1);
    }

    /**
     * 获取两个时间点的月份差
     *
     * @param start 第一个时间点
     * @param end 第二个时间点
     * @return 月数差
     */
    public static Integer monthDiff(LocalDateTime start, LocalDateTime end) {
        return monthDiff(start.toLocalDate(), end.toLocalDate());
    }

    /**
     * String 转化为 LocalDateTime
     *
     * @param timeStr 被转化的字符串
     * @return LocalDateTime
     */
    public static LocalDateTime parseTime(String timeStr) {
        return LocalDateTime.parse(timeStr, DEFAULT_DATETIME_FORMATTER);

    }

    public static LocalDate parseDate(String dateStr) {
        return LocalDate.parse(dateStr, DEFAULT_DATETIME_FORMATTER);

    }

    /**
     * String 转化为 LocalDate
     *
     * @param timeStr    被转化的字符串
     * @param timeFormat 转化的时间格式
     * @return LocalDate
     */
    public static LocalDate parseDate(String timeStr, TimeFormat timeFormat) {
        return LocalDate.parse(timeStr, timeFormat.formatter);

    }

    public static LocalDateTime formatDate(String timeStr, TimeFormat timeFormat) {
        return LocalDateTime.parse(timeStr, timeFormat.formatter);

    }



    /**
     * LocalDateTime 转化为String
     * 默认格式yyyyMMdd
     * @param time LocalDateTime
     * @return String
     */
    public static String formatTime(LocalDateTime time) {
        return DEFAULT_DATETIME_FORMATTER.format(time);

    }
    /**
     * LocalDateTime 转化为String
     * 默认格式yyyyMMdd
     * @param date LocalDate
     * @return String
     */
    public static String formatDate(LocalDate date) {
        return DEFAULT_DATETIME_FORMATTER.format(date);

    }

    /**
     * LocalDateTime 时间转 String
     *
     * @param time   LocalDateTime
     * @param format 时间格式
     * @return String
     */
    public static String formatTime(LocalDateTime time, TimeFormat format) {
        return format.formatter.format(time);

    }
    /**
     * LocalDate 时间转 String
     *
     * @param date   LocalDate
     * @param format 时间格式
     * @return String
     */
    public static String formatDate(LocalDate date, TimeFormat format) {
        return format.formatter.format(date);

    }

    public static Date getDate(LocalDateTime time) {
        return Date.from(time.atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * 获取多少年之前的日期
     * @param year 之前的日期 正整数  之后的日期 整数
     * @return
     */
    public static Date getLastYearDate(int year) {
        // 获取当前日期
        return getLastMonthDate(year*12);
    }

    /**
     * 获取多少年之前的1号
     * @param year 正整数  之后的日期 整数
     * @return
     */
    public static Date getLastYearDateWithFirstDay(int year) {
        return getLastMonthDate(year*12);
    }
    /**
     * 获取多少月之前的日期
     * @param month 之前的日期 正整数  之后的日期 整数
     * @return
     */
    public static Date getLastMonthDate(int month) {
        // 获取当前日期
        LocalDate now = LocalDate.now();
        LocalDate last = now.minusMonths(month);
        return Date.from(last.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * 获取多少月之前的1号
     * @param month 正整数  之后的日期 整数
     * @return
     */
    public static Date getLastMonthDateWithFirstDay(int month) {
        // 获取当前日期
        LocalDate now = LocalDate.now();
        LocalDate last = now.minusMonths(month).withDayOfMonth(1);
        return Date.from(last.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }

    public static Date getDate(LocalDate localDate) {
        return Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }

    public static LocalDateTime getLocalDateTime(Date date) {
        Instant instant = date.toInstant();
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime localDateTime = instant.atZone(zoneId).toLocalDateTime();
        return localDateTime;
    }

    /**
     * 获取当前时间
     *
     * @return
     */
    public static String getCurrentDateTimeStr() {
        return DEFAULT_DATETIME_FORMATTER.format(LocalDateTime.now());
    }

    /**
     * 获取当前时间
     *
     * @param timeFormat 时间格式
     * @return
     */
    public static String getCurrentDateTimeStr(TimeFormat timeFormat) {
        return timeFormat.formatter.format(LocalDateTime.now());
    }
    /**
     * 获取当前时间
     *
     * @param timeFormat 时间格式
     * @return
     */
    public static String getCurrentDateTimeStr(TimeFormat timeFormat,Date date) {
        LocalDateTime localDateTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        return timeFormat.formatter.format(localDateTime);
    }

    /**
     * 内部枚举类
     *
     * @author xiaowen
     * @date 2016年11月1日 @ version 1.0
     */
    public enum TimeFormat {
        // 短时间格式 年月日
        /**
         * 时间格式：yyyy-MM-dd
         */
        SHORT_DATE_PATTERN_LINE("yyyy-MM-dd"),
        /**
         * 时间格式：yyyy/MM/dd
         */
        SHORT_DATE_PATTERN_SLASH("yyyy/MM/dd"),
        /**
         * 时间格式：yyyy\\MM\\dd
         */
        SHORT_DATE_PATTERN_DOUBLE_SLASH("yyyy\\MM\\dd"),
        /**
         * 时间格式：yyyyMMdd
         */
        SHORT_DATE_PATTERN_NONE("yyyyMMdd"),
        /**
         * 时间格式：HHmmss
         */
        SHORT_TIME_PATTERN_NONE("HHmmss"),

        /**
         * 时间格式：yyyy-MM-dd HH:mm:ss
         */
        LONG_DATE_PATTERN_LINE("yyyy-MM-dd HH:mm:ss"),

        /**
         * 时间格式：yyyy/MM/dd HH:mm:ss
         */
        LONG_DATE_PATTERN_SLASH("yyyy/MM/dd HH:mm:ss"),
        /**
         * 时间格式：yyyy/MM/dd HH:mm:ss
         */
        LONG_DATE_PATTERN_SLASH_CHINA("yyyy年MM月dd日 HH:mm:ss"),
        /**
         * 时间格式：yyyy\\MM\\dd HH:mm:ss
         */
        LONG_DATE_PATTERN_DOUBLE_SLASH("yyyy\\MM\\dd HH:mm:ss"),

        /**
         * 时间格式：yyyyMMddHHmmss
         */
        LONG_DATE_PATTERN_NONE("yyyyMMddHHmmss"),
        /**
         * 时间格式：yyyyMMdd HH:mm:ss
         */
        LONG_DATE_MIN("yyyyMMddHHmm"),

        // 长时间格式 年月日时分秒 带毫秒
        LONG_DATE_PATTERN_WITH_MILSEC_LINE("yyyy-MM-dd HH:mm:ss.SSS"),

        LONG_DATE_PATTERN_WITH_MILSEC_SLASH("yyyy/MM/dd HH:mm:ss.SSS"),

        LONG_DATE_PATTERN_WITH_MILSEC_DOUBLE_SLASH("yyyy\\MM\\dd HH:mm:ss.SSS"),

        LONG_DATE_PATTERN_WITH_MILSEC_NONE("yyyyMMdd HH:mm:ss.SSS"),

        LONG_DATE_PATTERN_WITH_WEEK_AND_ZONE("EEE MMM dd yyyy HH:mm:ss z"),

        YEAR_MONTH("yyyyMM");
        private transient DateTimeFormatter formatter;

        TimeFormat(String pattern) {
            formatter = DateTimeFormatter.ofPattern(pattern);
        }
    }

    public static String formatTime(Long ms) {
        Integer ss = 1000;
        Integer mi = ss * 60;
        Integer hh = mi * 60;
        Integer dd = hh * 24;

        Long day = ms / dd;
        Long hour = (ms - day * dd) / hh;
        Long minute = (ms - day * dd - hour * hh) / mi;
        Long second = (ms - day * dd - hour * hh - minute * mi) / ss;
        Long milliSecond = ms - day * dd - hour * hh - minute * mi - second * ss;

        StringBuilder sb = new StringBuilder();
        if (day > 0) {
            sb.append(day + "d ");
        }
        if (hour > 0) {
            sb.append(hour + "h ");
        }
        if (minute > 0) {
            sb.append(minute + "m ");
        }
        if (second > 0) {
            sb.append(second + "s ");
        }
        if (milliSecond >= 0) {
            sb.append(milliSecond + "ms");
        }
        return sb.toString();
    }
    public final static String FORMAT_STRING_TIME_ZONE = "EEE MMM dd yyyy HH:mm:ss z";
    public final static String[] REPLACE_STRING = new String[]{"GMT+0800", "GMT+08:00"};
    public final static String SPLIT_STRING = "(中国标准时间)";
    public final static String FORMAT_STRING_YYYYMMDD = "yyyyMMdd";

    /**
     * vue前端传入时间字符串格式转换为yyyyMMdd
     * @param vueTimeStr
     * @return
     * @throws ParseException
     */
    public static String getTimeStrFromVueTimeStr(String vueTimeStr) throws ParseException {
        vueTimeStr = vueTimeStr.split(Pattern.quote(SPLIT_STRING))[0].replace(REPLACE_STRING[0], REPLACE_STRING[1]);
//        LocalDateTime localDateTime = LocalDateTime.parse(vueTimeStr, TimeFormat.LONG_DATE_PATTERN_WITH_WEEK_AND_ZONE.formatter);
//        System.out.println(localDateTime);//转换为date
        SimpleDateFormat sf1 = new SimpleDateFormat(FORMAT_STRING_TIME_ZONE, Locale.ENGLISH);
        Date date = sf1.parse(vueTimeStr);
        return new SimpleDateFormat(FORMAT_STRING_YYYYMMDD).format(date);
    }

    public static void main(String[] args) throws Exception {


    }


}
