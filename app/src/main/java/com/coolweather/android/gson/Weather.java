package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;
/*
{"HeWeather": [
	{
	"now":{}
	"aqi":{},
	"basic":{},
	"daily_forecast":[],
	"hourly_forecast":[],
	"status":"ok",
	"suggestion":{}
]}
 */
public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")  //使用@SerializedName来对java字段和Json字段建立映射。
    public List<Forecast> forecastList;
}
