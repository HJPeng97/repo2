package com.peng.designpattern.command;

/**
 * 遥控器类，遥控各个家电的开关
 */
public class RemoteController {
    //开按钮的命令
    private Command[] onCommands;
    //关按钮的命令
    private Command[] offCommands;
    //执行撤销的命令 (记录最近一次执行的命令)
    private Command undoCommand;

    /**
     * 初始化各个按钮
     */
    public RemoteController() {
        onCommands = new Command[3];
        offCommands = new Command[3];
        for (int i = 0; i < 3; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
        undoCommand = new NoCommand();
    }

    /**
     * 给按钮设置需要的命令
     */
    public void setCommand(int num, Command onCommand, Command offCommand) {
        onCommands[num] = onCommand;
        offCommands[num] = offCommand;
    }

    /**
     * 开按钮被按下时执行该方法
     * @param num : 第几个开按钮
     */
    public void onButtonWasPushed(int num) {
        onCommands[num].execute();

        //记录当前的命令
        undoCommand = onCommands[num];
    }

    /**
     * 关按钮被按下时执行该方法
     * @param num : 第几个开按钮
     */
    public void offButtonWasPushed(int num) {
        offCommands[num].execute();

        //记录当前的命令
        undoCommand = offCommands[num];
    }

    /**
     * 撤销按钮被按下时,执行撤销操作
     */
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
}
