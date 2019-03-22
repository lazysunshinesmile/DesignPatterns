package com.sunxiang.headfirst.example;

import java.util.Observable;

public class WeatherStation extends Observable {
    private float mTemperature;
    private float mPressure;
    private float mHumidity;

    public float getHumidity() {
        return mHumidity;
    }

    public float getPressure() {
        return mPressure;
    }

    public float getTemperature() {
        return mTemperature;
    }

    public void setData(float mTemperature, float mPressure, float mHumidity) {
        this.mTemperature = mTemperature;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        notifyChange();
    }

    private void notifyChange() {
        //在通知观察者之前必须调用setChanged，否则不会通知。
        setChanged();
        notifyObservers(new WeatherData(getTemperature(), getPressure(), getHumidity()));
    }




}
