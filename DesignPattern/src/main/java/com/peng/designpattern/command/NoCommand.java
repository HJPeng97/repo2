package com.peng.designpattern.command;

/**
 * 空命令，用来简化客户端的操作，省去对空的判断,以及初始化各个按钮
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
    }

    @Override
    public void undo() {
    }
}
