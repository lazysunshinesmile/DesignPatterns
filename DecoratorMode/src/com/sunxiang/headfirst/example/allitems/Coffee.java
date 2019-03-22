package com.sunxiang.headfirst.example.allitems;

import com.sunxiang.headfirst.example.baseclass.Drink;

public class Coffee extends Drink {

    public Coffee() {
        setDescribtion("pure coffee 10");
        setPrice(10f);
    }

    @Override
    public String describe() {
        return getmDescribtion();
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
