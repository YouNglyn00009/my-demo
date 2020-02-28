package com.lyn.common.utils;

/**
 * @Description
 */
public class CommonUtils {

    public static String formatClassName(Object obj) {
        if (obj != null) {
            return obj instanceof Class ? ((Class)obj).getName() : obj.getClass().getName();
        } else {
            return null;
        }
    }

}
