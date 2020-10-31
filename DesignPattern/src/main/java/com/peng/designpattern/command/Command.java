package com.peng.designpattern.command;

/**
 * 命令接口 （命令模式）
 */
public interface Command {
    /**
     * 调用该方法执行某个命令
     */
    void execute();

    /**
     * 调用该方法撤销某个命令
     */
    void undo();
}
