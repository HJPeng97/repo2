package com.peng.designpattern.state;

/**
 * 奖品领完的状态
 */
public class DispenseOutState implements State {
    private Activity activity;

    public DispenseOutState(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("奖品已被发完，不能扣除积分!");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品已被发完，不能抽奖!");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品已被发完，不能发放奖品!");
    }
}
