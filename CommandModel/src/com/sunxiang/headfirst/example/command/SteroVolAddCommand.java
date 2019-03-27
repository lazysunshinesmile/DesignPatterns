package com.sunxiang.headfirst.example.command;

import com.sunxiang.headfirst.example.electricappliance.Stero;

public class SteroVolAddCommand implements Command {
    private Stero stero;

    public SteroVolAddCommand(Stero stero) {
        this.stero = stero;
    }
    @Override
    public void excute() {
        stero.volAdd();
    }

    @Override
    public void undo() {
        stero.volReduce();
    }
}
