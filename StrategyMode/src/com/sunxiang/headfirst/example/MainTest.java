package com.sunxiang.headfirst.example;

import com.sunxiang.headfirst.example.duck.GreenHeadDuck;
import com.sunxiang.headfirst.example.duck.NewDuck;
import com.sunxiang.headfirst.example.duck.RedHeadDuck;
import com.sunxiang.headfirst.example.flybehavior.KuchiFly;
import com.sunxiang.headfirst.example.flybehavior.PuciFly;
import com.sunxiang.headfirst.example.flybehavior.NewFly;
import com.sunxiang.headfirst.example.quackbehavior.GuaGuaQuack;
import com.sunxiang.headfirst.example.quackbehavior.MiaoQuack;
import com.sunxiang.headfirst.example.quackbehavior.NewQuack;

public class MainTest {
    public static void main(String[] args) {
        GreenHeadDuck greenHeadDuck = new GreenHeadDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();

        greenHeadDuck.setFlyBehavior(new KuchiFly());
        greenHeadDuck.setQuackBehavior(new GuaGuaQuack());

        redHeadDuck.setFlyBehavior(new PuciFly());
        redHeadDuck.setQuackBehavior(new MiaoQuack());

        greenHeadDuck.describtion();
        greenHeadDuck.fly();
        greenHeadDuck.quack();

        redHeadDuck.describtion();
        redHeadDuck.fly();
        redHeadDuck.quack();

        //--------------new add---------------------
        //完全是增加代码，并未对已经完成的代码做任何修改
        System.out.println("---------------------");
        NewDuck newDuck = new NewDuck();
        newDuck.setFlyBehavior(new NewFly());
        newDuck.setQuackBehavior(new NewQuack());
        newDuck.describtion();
        newDuck.fly();
        newDuck.quack();


    }
}
