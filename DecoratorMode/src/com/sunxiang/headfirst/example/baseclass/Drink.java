package com.sunxiang.headfirst.example.baseclass;

public abstract class Drink {
    private String mDescribtion;
    private float mPrice;

    public void setDescribtion(String mDescribtion) {
        this.mDescribtion = mDescribtion;
    }

    public void setPrice(float price) {
        this.mPrice = price;
    }

    public float getPrice() {
        return mPrice;
    }

    public String getmDescribtion() {
        return mDescribtion;
    }

    public abstract String describe();

    public abstract float cost();
}
