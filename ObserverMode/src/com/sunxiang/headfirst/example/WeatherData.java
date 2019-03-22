package com.sunxiang.headfirst.example;

public class WeatherData {

    private float mTemperature;
    private float mPressure;
    private float mHumidity;

    public WeatherData(float mTemperature, float mPressure, float mHumidity) {
        this.mHumidity = mHumidity;
        this.mTemperature = mTemperature;
        this.mPressure = mPressure;
    }

    public float getTemperature() {
        return mTemperature;
    }

    public float getPressure() {
        return mPressure;
    }

    public float getHumidity() {
        return mHumidity;
    }
}
