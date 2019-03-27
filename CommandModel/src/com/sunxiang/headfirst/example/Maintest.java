package com.sunxiang.headfirst.example;

import com.sunxiang.headfirst.example.command.*;
import com.sunxiang.headfirst.example.control.CommandControl;
import com.sunxiang.headfirst.example.electricappliance.Light;
import com.sunxiang.headfirst.example.electricappliance.Stero;

public class Maintest {

    public static void main(String[] args) {
        Light bedroomLight = new Light("bedroom");
        Light kitchenLight = new Light("kitchen");

        LightOnCommand lightOnCommand1 = new LightOnCommand(bedroomLight);
        LightOffCommand lightOffCommand1 = new LightOffCommand(bedroomLight);
        LightOnCommand lightOnCommand2 = new LightOnCommand(kitchenLight);
        LightOffCommand lightOffCommand2 = new LightOffCommand(kitchenLight);

        CommandControl commandControl = new CommandControl(5);
        commandControl.setCommand(1, lightOnCommand1, lightOffCommand1);
        commandControl.setCommand(2, lightOnCommand2, lightOffCommand2);

        commandControl.pressOnButton(1);
        commandControl.pressOffButton(1);
        commandControl.pressOnButton(2);
        commandControl.pressOffButton(2);

        commandControl.pressUndoButton();
        commandControl.pressUndoButton();


        //新增的东西
        Stero stero = new Stero("bedroom");
        SteroOnCommand steroOnCommand = new SteroOnCommand(stero);
        SteroOffCommand sterooffCommand = new SteroOffCommand(stero);
        SteroVolAddCommand steroVolAddCommand = new SteroVolAddCommand(stero);
        SteroVolReduceCommand steroVolReduceCommand = new SteroVolReduceCommand(stero);

        commandControl.setCommand(3, steroOnCommand, sterooffCommand);
        commandControl.setCommand(4, steroVolAddCommand, steroVolReduceCommand);

        commandControl.pressOnButton(3);
        commandControl.pressOffButton(3);
        commandControl.pressOnButton(4);
        commandControl.pressOffButton(4);

        commandControl.pressUndoButton();
        commandControl.pressUndoButton();
    }
}
