package com.sunxiang.headfirst.example.allseasonings;

import com.sunxiang.headfirst.example.baseclass.Drink;

public class Milk extends Seasoning {
    public Milk(Drink drink) {
        super(drink);
        setDescribtion("milk 3");
        setPrice(3);
    }
}
