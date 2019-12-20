package com.lyn.common.utils;


/**
 * @Description 编码处理工具
 */
public class LynNoUtil {


    public static String generateNo(Long id, String prefix) {
        if (id == null) {
            throw new NullPointerException("id can not be null...");
        }
        return String.format(prefix + "%012d", id);
    }

}
