package com.xl.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import org.apache.commons.lang.StringUtils;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 徐立
 * @Date: 2018-05-03
 * @Time: 12:52
 * To change this template use File | Settings | File Templates.
 */
public class DateUtil {
    private static SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    private static SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddhhmm");
    private static SimpleDateFormat sfm = new SimpleDateFormat("yyyyMMddHHmmssSSS");
    private static SimpleDateFormat tf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    
    public synchronized static String getDate() {
        Date date = new Date();
        return tf.format(date);
    }
    
    /**
     * 将字符串转换成日期类型 yyyy-MM-dd
     *
     * @param date 传入的字符串
     * @return 转换成的日期值
     */
    public static Date parseDate(String date) {
        Date ret = null;
        if (date != null && date != "") {
            try {
                ret = df.parse(date);
            } catch (ParseException e) {
                ret = null;
            }
        }
        return ret;
    }
    
    /**
     * 将字符串转换成日期类型 yyyy-MM-dd HH:mm:ss
     *
     * @param date 日期字符串
     * @return 转换成的日期值
     */
    public static Date parseTime(String date) {
        Date ret = null;
        if (date != null && date != "") {
            try {
                ret = tf.parse(date);
            } catch (ParseException e) {
                ret = null;
            }
        }
        return ret;
    }
    
    /**
     * 将日期类型转换成"yyyy-MM-dd"字符串
     *
     * @param date 传入的日期值
     * @return 字符串类型的日期值
     */
    public static String formatDate(Date date) {
        String ret = "";
        try {
            ret = df.format(date);
        } catch (Exception e) {
            ret = "";
        }
        return ret;
    }
    
    /**
     * 将日期类型转换成"yyyyMMdd"字符串
     *
     * @param date 传入的日期值
     * @return 字符串类型的日期值
     */
    public static String formatDateString(Date date) {
        String ret = "";
        try {
            ret = sf.format(date);
        } catch (Exception e) {
            ret = "";
        }
        return ret;
    }
    
    /**
     * 文件上传时,生成文件名 将日期类型转换成"yyyyMMddHHmmssSSS"字符串
     *
     * @param date
     * @return 字符串类型的日期值
     */
    public static String formatFileUploadTime(Date date) {
        String ret = "";
        try {
            ret = sfm.format(date);
        } catch (Exception e) {
            ret = "";
        }
        return ret;
    }
    
    /**
     * 将日期类型转换成"yyyy-MM-dd  HH:mm:ss"字符串
     *
     * @param date
     * @return 返回字符串类型的日期值
     */
    public static String formatTime(Date date) {
        String ret = "";
        try {
            ret = tf.format(date);
        } catch (Exception e) {
            ret = "";
        }
        return ret;
    }
    
    public static Date formatDate(String date, String format) throws ParseException {
        if (StringUtils.isBlank(format)) {
            format = "yyyy-MM-dd";
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        Date sysdate = null;
        if (StringUtils.isBlank(date)) {
            return null;
        } else {
            sysdate = dateFormat.parse(date);
            return sysdate;
        }
    }
    
    public synchronized static String formatDate(Date date, String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return tf.format(date);
    }
    
    /**
     * 格式化现在的日期
     *
     * @return
     */
    public static String formatLocalDate() {
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        return LocalDate.now().format(timeFormatter);
    }
}
