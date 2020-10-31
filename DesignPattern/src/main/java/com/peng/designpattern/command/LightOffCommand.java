package com.peng.designpattern.command;

public class LightOffCommand implements Command {
    //聚合一个电灯，来完成命令与接收者之间的绑定
    private LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    /**
     * 执行电灯关闭的操作
     */
    @Override
    public void execute() {
        light.off();
    }

    /**
     * 撤销电灯关闭的操作
     */
    @Override
    public void undo() {
        light.on();
    }
}
