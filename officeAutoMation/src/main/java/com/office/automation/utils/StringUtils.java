package com.office.automation.utils;

/**
 * Created by zhangfan on 2017/1/20.
 */
public class StringUtils {

    public static boolean isEmpty(String str) {
        return str == null || "".equals(str.trim());
    }
}
