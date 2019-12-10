package com.lyn.common.json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;

public final class JsonUtil {

    private static Gson GSON;

    static {
        GSON = new Gson();
    }

    private JsonUtil() {
    }

    /**
     * 将json通过类型转换成对象
     * <p>
     * <pre>
     *     {@link JsonUtil JsonUtil}.fromJson("{\"username\":\"username\", \"password\":\"password\"}", User.class);
     * </pre>
     *
     * @param json  json字符串
     * @param clazz 泛型类型
     * @return 返回对象
     * @throws IOException
     */
    public static <T> T fromJson(String json, Class<T> clazz) throws IOException {
        return (T) GSON.fromJson(json, clazz);
    }

    /**
     * 将json通过类型转换成对象，并对已转义的json自动还原
     *
     * <p>例如，默认的Gson.toJson时会把单引号转义成\u0027，这里会自动还原，即把\u0027还原成单引号</p>
     * @param json
     * @param clazz
     * @param <T>
     * @return
     * @throws IOException
     */
    public static <T> T fromJsonUnescape(String json, Class<T> clazz) throws IOException {
        // \u0027 还原为 '
        json = json.replace("\\u0027", "'");
        // \u0036 还原为 =
        json = json.replace("\\u003d", "=");
        // \u003e 还原为 >
        json = json.replace("\\u003e", ">");
        // \u003c 还原为 <
        json = json.replace("\\u003c", "<");
        return (T) GSON.fromJson(json, clazz);
    }

    /**
     * 将json通过类型转换成对象
     * <p>
     * <pre>
     *     {@link JsonUtil JsonUtil}.fromJsonByGoogle("{\"username\":\"username\", \"password\":\"password\"}", User.class);
     * </pre>
     *
     * @param json  json字符串
     * @param clazz 泛型类型
     * @return 返回对象
     * @see com.google.gson.Gson
     */
    public static <T> T fromJsonByGoogle(String json, Class<T> clazz) {
        return GSON.fromJson(json, clazz);
    }

    /**
     * 将json通过类型转换成对象
     * <p>
     * <pre>
     *     {@link JsonUtil JsonUtil}.fromJsonByGoogle("[{\"username\":\"username\", \"password\":\"password\"}, {\"username\":\"username\", \"password\":\"password\"}]", new TypeToken&lt;List&lt;User&gt;&gt;() {});
     * </pre>
     *
     * @param json json字符串
     * @param type 引用类型
     * @return 返回对象
     * @see com.google.gson.Gson
     */
    public static <T> T fromJsonByGoogle(String json, TypeToken<?> type) {
        return (T) GSON.fromJson(json, type.getType());
    }

    /**
     * 将对象转换成json
     * <p>
     * <pre>
     *     {@link JsonUtil JsonUtil}.toJsonByGoogle(user);
     * </pre>
     *
     * @param src 对象
     * @return 返回json字符串
     * @see com.google.gson.Gson
     */
    public static <T> String toJsonByGoogle(T src) {
        return GSON.toJson(src);
    }

    /**
     * 将对象转换成json
     * <p>
     * <pre>
     *     {@link JsonUtil JsonUtil}.toJson(user);
     * </pre>
     *
     * @param src 对象
     * @return 返回json字符串
     */
    public static <T> String toJson(T src) {
        return GSON.toJson(src);
    }


}
