package com.sunxiang.headfirst.example.command;

import com.sunxiang.headfirst.example.electricappliance.Stero;

public class SteroOffCommand implements Command {
    private Stero stero;

    public SteroOffCommand(Stero stero) {
        this.stero = stero;
    }

    @Override
    public void excute() {
        stero.off();
    }

    @Override
    public void undo() {
        stero.on();
    }
}
