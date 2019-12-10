package com.lyn.common.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.List;
import java.util.Map;


public final class FastJsonUtil {

    private FastJsonUtil() {
    }

    public static String toJson(Object object) {
        return JSON.toJSONString(object);
    }

    /**
     * 将objects转换为json字符串的过程中，对objects中的每一个对象额外追加extraInfoMap信息
     *
     * @param objects      待json序列化对象
     * @param extraInfoMap 额外追加的信息
     * @return objects携带extraInfoMap信息后的json序列化数据
     */
    public static String toJson(List objects, Map<String, Object> extraInfoMap) {
        if (objects == null) {
            return null;
        }
        if (objects.size() == 0) {
            return "[]";
        }

        JSONArray jsonArray = new JSONArray(objects.size());
        for (Object object : objects) {
            JSONObject jsonObject = (JSONObject) JSON.toJSON(object);
            if (extraInfoMap != null && !extraInfoMap.isEmpty()) {
                for (String key : extraInfoMap.keySet()) {
                    jsonObject.put(key, extraInfoMap.get(key));
                }
            }
            jsonArray.add(jsonObject);
        }

        return jsonArray.toJSONString();
    }

    public static <T> T fromJson(String json, Class<T> clazz) {
        return JSON.parseObject(json, clazz);
    }

}
