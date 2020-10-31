package com.peng.designpattern.command;

public class Client {
    public static void main(String[] args) {
        //创建一个遥控器，控制各个家电
        RemoteController remoteController = new RemoteController();
        //设置num为0的按钮为电灯的开和关
        remoteController.setCommand(0,new LightOnCommand(new LightReceiver()),
                new LightOffCommand(new LightReceiver()));
        //按下电灯开按钮
        remoteController.onButtonWasPushed(0);
        //按下电灯关按钮
        remoteController.offButtonWasPushed(0);
        //按下撤销按钮
        remoteController.undoButtonWasPushed();
    }
}
