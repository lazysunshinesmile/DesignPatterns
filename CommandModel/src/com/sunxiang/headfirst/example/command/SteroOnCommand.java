package com.sunxiang.headfirst.example.command;

import com.sunxiang.headfirst.example.electricappliance.Stero;

public class SteroOnCommand implements Command {
    private Stero stero;

    public SteroOnCommand(Stero stero) {
        this.stero = stero;
    }

    @Override
    public void excute() {
        stero.on();
    }

    @Override
    public void undo() {
        stero.off();
    }
}
