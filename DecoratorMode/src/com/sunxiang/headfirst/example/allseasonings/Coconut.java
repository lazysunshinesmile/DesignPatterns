package com.sunxiang.headfirst.example.allseasonings;

import com.sunxiang.headfirst.example.allitems.Coffee;
import com.sunxiang.headfirst.example.baseclass.Drink;

public class Coconut extends Seasoning {

    //椰果

    public Coconut(Drink drink) {
        super(drink);
        setDescribtion("Coconut 2");
        setPrice(2);
    }
}
