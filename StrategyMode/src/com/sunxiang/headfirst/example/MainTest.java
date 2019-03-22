package com.sunxiang.headfirst.example;

public class MainTest {
    private static MainTest ourInstance = new MainTest();

    public static MainTest getInstance() {
        return ourInstance;
    }

    private MainTest() {
    }
}
