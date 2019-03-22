package com.sunxiang.headfirst.example.flybehavior;

public class PuciFly {
    private static PuciFly ourInstance = new PuciFly();

    public static PuciFly getInstance() {
        return ourInstance;
    }

    private PuciFly() {
    }
}
