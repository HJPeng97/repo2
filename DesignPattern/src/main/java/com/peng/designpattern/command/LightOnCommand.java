package com.peng.designpattern.command;

public class LightOnCommand implements Command {
    //聚合一个电灯，来完成命令与接收者之间的绑定
    private LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    /**
     * 执行电灯打开的操作
     */
    @Override
    public void execute() {
        light.on();
    }

    /**
     * 撤销电灯打开的操作
     */
    @Override
    public void undo() {
        light.off();
    }
}
