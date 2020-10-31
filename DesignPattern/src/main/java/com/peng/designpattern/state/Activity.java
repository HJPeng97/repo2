package com.peng.designpattern.state;

/**
 * 活动类，可以抽奖
 */
public class Activity {
    private State state;
    private int count; // 奖品数量
    private NoRaffleState noRaffleState = new NoRaffleState(this);
    private CanRaffleState canRaffleState = new CanRaffleState(this);
    private DispenseState dispenseState = new DispenseState(this);
    private DispenseOutState dispenseOutState = new DispenseOutState(this);

    public Activity(int count) {
        this.state = getNoRaffleState();
        this.count = count;
    }

    /**
     * 调用当前状态的扣除积分的方法
     */
    public void deduceMoney() {
        state.deduceMoney();
    }

    public void raffle() {
        if (state.raffle()) {
            //中奖
            state.dispensePrize(); // 发放奖品
        }
    }

    public NoRaffleState getNoRaffleState() {
        return this.noRaffleState;
    }

    public CanRaffleState getCanRaffleState() {
        return this.canRaffleState;
    }

    public DispenseState getDispenseState() {
        return this.dispenseState;
    }

    public DispenseOutState getDispenseOutState() {
        return this.dispenseOutState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}
