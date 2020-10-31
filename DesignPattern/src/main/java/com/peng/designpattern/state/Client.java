package com.peng.designpattern.state;

public class Client {
    public static void main(String[] args) {
        Activity activity = new Activity(3);
        System.out.println("活动开始，奖品池的奖品数量为3个");
        for (int i = 0; i < 30; i++) {
            System.out.println("------第" + (i + 1) + "次抽奖------");
            raffle(activity);
        }
        System.out.println("活动即将结束，剩余奖品数量：" + activity.getCount());
    }

    private static void raffle(Activity activity) {
        activity.deduceMoney();
        activity.raffle();
    }
}
