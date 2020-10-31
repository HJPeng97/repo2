package com.peng.designpattern.responsibilitychain;

/**
 * 处理者的抽象类，使用责任链模式，提供一个处理请求的方法，并将自己聚合到自己，
 * 使得子类可以在自己处理完成后交给下一个处理者进行处理
 */
public abstract class Approver {
    Approver approver;
    private String name; // 处理者的名字

    public Approver(String name) {
        this.name = name;
    }

    public abstract void processRequest(PurchaseRequest purchaseRequest);

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    public String getName() {
        return name;
    }
}
