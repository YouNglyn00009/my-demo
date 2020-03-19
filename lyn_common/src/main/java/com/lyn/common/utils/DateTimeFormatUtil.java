package com.lyn.common.utils;

import org.apache.commons.lang.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * @Description
 */
public class DateTimeFormatUtil {

    /**
     * 只有日期的表达式
     * 支持格式:
     * yyyy-MM-dd
     * yyyy-M-d
     * yyyy/MM/dd
     * yyyy/M/d
     */
    private static final String ONLY_DATE_REG = "\\d{4}(-|\\/)\\d{1,2}(-|\\/)\\d{1,2}";

    /**
     * 日期+小时+分钟+秒
     */
    private static final String DATE_TIME_REG = "\\d{4}(-|\\/)\\d{1,2}(-|\\/)\\d{1,2} \\d{2}:\\d{2}:\\d{2}";

    /**
     * 日期+小时+分钟
     */
    private static final String DATE_TIME_NON_SEC_REG = "\\d{4}(-|\\/)\\d{1,2}(-|\\/)\\d{1,2} \\d{2}:\\d{2}";


    /**
     * 日期格式
     */
    private static final String[] DATE_FORMAT_LIST = {
            "yyyy-MM-dd",
            "yyyy/MM/dd",
    };

    /**
     * 日期+时间（包含秒）的格式
     */
    private static final String[] DATE_TIME_FORMAT_LIST = {
            "yyyy-MM-dd HH:mm:ss",
            "yyyy/MM/dd HH:mm:ss"
    };

    /**
     * 日期+时间（不包含秒）的格式
     */
    private static final String[] DATE_TIME_NON_SEC_FORMAT = {
            "yyyy-MM-dd HH:mm",
            "yyyy/MM/dd HH:mm"
    };

    /**
     * 标准日期格式
     */
    public static final String STANDARD_DATE_FORMAT = "yyyy-MM-dd";

    /**
     * 标准日期+时间格式
     */
    public static final String STANDARD_DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    /**
     * 日期格式是否合法
     * @return
     */
    public static boolean dateTimeIsLegal(String dateTimeStr) {

        if (StringUtils.isBlank(dateTimeStr)) {
            return false;
        }

        if (Pattern.matches(ONLY_DATE_REG, dateTimeStr)) {
            return true;
        }

        if (Pattern.matches(DATE_TIME_REG, dateTimeStr)) {
            return true;
        }

        if (isNonSec(dateTimeStr)) {
            return true;
        }
        return false;
    }

    /**
     * 判断是否是没有秒的日期格式
     * @return
     */
    public static boolean isNonSec(String dateTimeStr) {
        if (StringUtils.isBlank(dateTimeStr)) {
            return false;
        }
        if (Pattern.matches(DATE_TIME_NON_SEC_REG, dateTimeStr)) {
            return true;
        }
        return false;
    }

    public static Date parseDate(String dateTimeStr) {
        if (StringUtils.isBlank(dateTimeStr)) {
            return null;
        }

        String[] dateTimeSplit = dateTimeStr.split(" ");

        if (dateTimeSplit.length == 1) {

            return parseDate(dateTimeStr, DATE_FORMAT_LIST);

        } else if (dateTimeSplit.length == 2) {

            Date date = parseDate(dateTimeStr, DATE_TIME_NON_SEC_FORMAT);
            if (date != null) {
                dateTimeStr += ":00";
            }
            date = parseDate(dateTimeStr, DATE_TIME_FORMAT_LIST);
            return date;
        } else {
            return null;
        }

    }

    /**
     * 转换日期
     * @param dateStr
     * @param formats
     * @return
     */
    public static Date parseDate(String dateStr, String[] formats) {
        for (String dateFormat : formats) {
            SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
            try {
                return sdf.parse(dateStr);
            } catch (ParseException e) {
            }
        }
        return null;
    }

    /**
     * 将日期按照格式转换成字符串类型
     * @return
     */
    public static String formatDateTime(Date date, SimpleDateFormat simpleDateFormat) {

        if (date == null || simpleDateFormat == null) {
            return null;
        }

        return simpleDateFormat.format(date);
    }

    public static void main(String[] args) {
        String s = "2020-3-1 21:01";
//        String s = null;
        if (!DateTimeFormatUtil.dateTimeIsLegal(s)) {
            System.out.println("不合法");
            return;
        }
        Date parse = DateTimeFormatUtil.parseDate(s);
        System.out.println(DateTimeFormatUtil.formatDateTime(parse, new SimpleDateFormat(DateTimeFormatUtil.STANDARD_DATE_TIME_FORMAT)));
    }


}
