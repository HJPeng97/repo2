package com.peng.designpattern.state;

public class DispenseState implements State {
    private Activity activity;

    public DispenseState(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("请先领取奖品!");
    }

    @Override
    public boolean raffle() {
        System.out.println("您已中奖，请尽快领取奖品!");
        return false;
    }

    @Override
    public void dispensePrize() {
        if (activity.getCount() > 1) {
            activity.setCount(activity.getCount() - 1);
            activity.setState(activity.getNoRaffleState()); // 奖品库存数量不为0，将状态设置为'不能抽奖'
        } else {
            activity.setCount(activity.getCount() - 1);
            activity.setState(activity.getDispenseOutState()); // 奖品库存数量为0，将状态设置为'奖品领完'
        }
        System.out.println("奖品领取成功!");
    }
}
