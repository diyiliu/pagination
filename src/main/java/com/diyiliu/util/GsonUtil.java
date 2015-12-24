package com.diyiliu.util;

import com.google.gson.Gson;

/**
 * Description: GsonUtil
 * Author: DIYILIU
 * Update: 2015-12-22 16:03
 */
public class GsonUtil {

    private static Gson gson = new Gson();

    public static String toJson(Object object){

        return gson.toJson(object);
    }
}
