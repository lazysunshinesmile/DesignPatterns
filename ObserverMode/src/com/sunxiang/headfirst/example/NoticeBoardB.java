package com.sunxiang.headfirst.example;

import java.util.Observable;
import java.util.Observer;

public class NoticeBoardB implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        if(arg instanceof WeatherData) {
            WeatherData data = (WeatherData)arg;
            display(data);
        }
    }

    public void display(WeatherData data) {
        System.out.println("明天温度：" + data.getTemperature());
        System.out.println("明天气压：" + data.getPressure());
        System.out.println("明天湿度：" + data.getHumidity());
    }
}
