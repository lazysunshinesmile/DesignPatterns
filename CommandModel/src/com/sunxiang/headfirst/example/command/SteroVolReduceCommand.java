package com.sunxiang.headfirst.example.command;

import com.sunxiang.headfirst.example.electricappliance.Stero;

public class SteroVolReduceCommand implements Command {
    private Stero stero;

    public SteroVolReduceCommand(Stero stero) {
        this.stero = stero;
    }

    @Override
    public void excute() {
        stero.volReduce();
    }

    @Override
    public void undo() {
        stero.volAdd();
    }
}
