package com.sunxiang.headfirst.example.command;

import com.sunxiang.headfirst.example.electricappliance.Light;

public class LightOnCommand implements Command {
    private Light mLight;

    public LightOnCommand(Light light) {
        mLight = light;
    }
    @Override
    public void excute() {
        mLight.on();
    }

    @Override
    public void undo() {
        mLight.off();
    }
}
