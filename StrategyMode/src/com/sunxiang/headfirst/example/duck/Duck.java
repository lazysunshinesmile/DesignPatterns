package com.sunxiang.headfirst.example.duck;

import com.sunxiang.headfirst.example.flybehavior.FlyBehavior;
import com.sunxiang.headfirst.example.quackbehavior.QuackBehavior;

public abstract class Duck {

    private FlyBehavior mFlyBehavior;
    private QuackBehavior mQuackBehavior;

    public Duck() {

    }

    public abstract void describtion();

    public void setFlyBehavior(FlyBehavior mFlyBehavior) {
        this.mFlyBehavior = mFlyBehavior;
    }

    public void setQuackBehavior(QuackBehavior mQuackBehavior) {
        this.mQuackBehavior = mQuackBehavior;
    }

    public void fly() {
        mFlyBehavior.fly();
    }

    public void quack() {
        mQuackBehavior.quack();
    }
}
