package com.peng.designpattern.state;

/**
 * 不能抽奖的状态,当前状态可以扣除积分
 */
public class NoRaffleState implements State {
    //需要聚合一个活动类，来完成状态的改变
    private Activity activity;

    public NoRaffleState(Activity activity) {
        this.activity = activity;
    }

    /**
     * 扣除积分,扣除积分后将状态变为'可以抽奖'
     */
    @Override
    public void deduceMoney() {
        System.out.println("扣除50积分成功，可以抽奖了!");
        activity.setState(activity.getCanRaffleState()); // 将状态设置为'可以抽奖'
    }

    @Override
    public boolean raffle() {
        System.out.println("没扣积分，不能进行抽奖!");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("没有中奖，不能发放奖品!");
    }
}
