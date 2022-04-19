package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    public static void sendOkhttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(address)//传入url字符串
                .build();
        client.newCall(request).enqueue(callback);//回调接口
    }
}
