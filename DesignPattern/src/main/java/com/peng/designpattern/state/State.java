package com.peng.designpattern.state;

/**
 * 状态的接口，其子类为具体的状态
 * 该接口定义了三个方法，表示可以发生的三个行为（扣除积分、抽奖、发放奖品）
 * 具体的状态会被这三个行为所改变
 */
public interface State {
    /**
     * 扣除积分，调用该方法后状态会从'不能抽奖'变成'可以抽奖'
     */
    void deduceMoney();

    /**
     * 抽奖，调用该方法后状态会从'可以抽奖'变成'不能抽奖'(不中奖)或'发放奖品'(中奖)
     * @return : 是否中奖
     */
    boolean raffle();

    /**
     * 发放奖品,调用该方法后状态会从'发放奖品'变成'不能抽奖'(剩余奖品数大于0)或'奖品领完'(剩余奖品数等于0)
     */
    void dispensePrize();
}
