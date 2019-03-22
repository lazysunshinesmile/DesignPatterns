package com.sunxiang.headfirst.example.quackbehavior;

public class MiaoQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("This duck miaomiao quack");
    }
}
