package com.sunxiang.headfirst.example.allseasonings;

import com.sunxiang.headfirst.example.baseclass.Drink;

public class Seasoning extends Drink {
    protected Drink mDrink;

    public Seasoning(Drink drink) {
        this.mDrink = drink;
    }


    @Override
    public String describe() {
        return super.getmDescribtion() + " && " + mDrink.describe();
    }

    @Override
    public float cost() {
        return super.getPrice() + mDrink.cost();
    }
}
