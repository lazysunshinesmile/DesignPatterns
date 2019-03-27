package com.sunxiang.headfirst.example.electricappliance;

public class Stero {
    private String loc;

    public Stero(String loc) {
        this.loc = loc;
    }

    public void on() {
        System.out.println(loc + "stero on");
    }

    public void off() {
        System.out.println(loc + "stero off");
    }

    public void volAdd() {
        System.out.println(loc + "stero vol add");
    }

    public void volReduce() {
        System.out.println(loc + "stero vol reduce");
    }

}
