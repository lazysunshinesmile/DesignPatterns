package com.sunxiang.headfirst.example.command;

import com.sunxiang.headfirst.example.electricappliance.Light;

public class LightOffCommand implements Command {
    private Light mLight;

    public LightOffCommand(Light light) {
        mLight = light;
    }

    @Override
    public void excute() {
        mLight.off();
    }

    @Override
    public void undo() {
        mLight.on();
    }
}
