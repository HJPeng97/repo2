package com.peng.designpattern.responsibilitychain;

public class DepartmentApprover extends Approver {
    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() <= 5000) {
            System.out.println("第" + PurchaseRequest.id + "个请求被处理，处理者为：" + this.getName());
        } else {
            //setApprover(new CollegeApprover("院长"));
            approver.processRequest(purchaseRequest);
        }
    }
}
