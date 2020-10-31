package com.peng.designpattern.state;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 可以抽奖的状态
 */
public class CanRaffleState implements State {
    private Activity activity; // 聚合一个活动类

    public CanRaffleState(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("已经可以抽奖，不需要继续扣除积分!");
    }

    @Override
    public boolean raffle() {
        System.out.println("正在抽奖....");
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int num = random.nextInt(10); // 生成一个0到9的随机数
        //10%的几率中奖
        if (num == 0) {
            //中奖
            System.out.println("恭喜您，中奖了!");
            activity.setState(activity.getDispenseState()); // 将状态改变为'发放奖品'
            return true;
        } else {
            //没有中奖
            System.out.println("很遗憾，您没有中奖!");
            activity.setState(activity.getNoRaffleState()); // 将状态改变为'不能抽奖'
            return false;
        }
    }

    @Override
    public void dispensePrize() {
        System.out.println("还未抽奖，不能发放奖品!");
    }
}
