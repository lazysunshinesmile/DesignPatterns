package com.sunxiang.headfirst.example.quackbehavior;

public class NewQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("This duck new new quack");
    }
}
