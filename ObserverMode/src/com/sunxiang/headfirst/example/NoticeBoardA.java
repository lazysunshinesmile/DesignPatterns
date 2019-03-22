package com.sunxiang.headfirst.example;

import java.util.Observable;
import java.util.Observer;

public class NoticeBoardA implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        if(arg instanceof WeatherData) {
            WeatherData data = (WeatherData)arg;
            display(data);
        }
    }

    public void display(WeatherData data) {
        System.out.println("今天温度：" + data.getTemperature());
        System.out.println("今天气压：" + data.getPressure());
        System.out.println("今天湿度：" + data.getHumidity());
    }
}
