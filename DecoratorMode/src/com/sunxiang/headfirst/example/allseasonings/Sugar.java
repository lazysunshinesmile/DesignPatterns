package com.sunxiang.headfirst.example.allseasonings;

import com.sunxiang.headfirst.example.baseclass.Drink;

public class Sugar extends Seasoning {

    public Sugar(Drink drink) {
        super(drink);
        setDescribtion("sugar 1");
        setPrice(1f);
    }
}
