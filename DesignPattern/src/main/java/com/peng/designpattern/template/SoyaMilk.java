package com.peng.designpattern.template;

/**
 * 模板抽象类，定义了一个模板方法，完成豆浆的制作
 */
public abstract class SoyaMilk {
    /**
     * 制作豆浆（模板方法）
     * 模板方法一般写成final，不让子类去覆盖
     */
    public final void make() {
        System.out.println("豆浆制作开始....");
        select();
        if (isAdd()) {
            add();
        }
        soak();
        beat();
        System.out.println("豆浆制作结束....");
    }

    /**
     * 选材
     */
    private void select() {
        System.out.println("选择新鲜的上好黄豆....");
    }

    /**
     * 添加原材料（豆浆的原材料会根据子类的不同而添加不同的原材料，如红豆、绿豆等）
     */
    public abstract void add();

    private void soak() {
        System.out.println("浸泡中....");
        System.out.println("浸泡完成....");
    }

    private void beat() {
        System.out.println("放到豆浆机打碎....");
    }

    /**
     * 钩子方法，决定是否要添加配料
     */
    public boolean isAdd() {
        return true;
    }
}
