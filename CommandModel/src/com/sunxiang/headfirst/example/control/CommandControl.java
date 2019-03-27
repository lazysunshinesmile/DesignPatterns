package com.sunxiang.headfirst.example.control;

import com.sunxiang.headfirst.example.command.Command;
import com.sunxiang.headfirst.example.command.NoCommand;

import java.util.Stack;

public class CommandControl {
    private Command[] onCommands;
    private Command[] offCommands;

    private Stack<Command> commandStack;

    public CommandControl(int num) {
        onCommands = new Command[num];
        commandStack = new Stack<>();

        for(int i = 0; i< num ;i ++) {
            onCommands[i] = new NoCommand();
        }

        offCommands = new Command[num];
        for(int i = 0; i< num ;i ++) {
            offCommands[i] = new NoCommand();
        }

    }

    public void setCommand(int num, Command onCommand, Command offCommand) {
        onCommands[num -1] = onCommand;
        offCommands[num -1] = offCommand;
    }

    public void pressOnButton(int num) {
        onCommands[num -1].excute();
        commandStack.push(onCommands[num -1]);
    }

    public void pressOffButton(int num) {
        offCommands[num -1].excute();
        commandStack.push(offCommands[num -1]);
    }

    public void pressUndoButton() {
        commandStack.pop().undo();
    }
}
