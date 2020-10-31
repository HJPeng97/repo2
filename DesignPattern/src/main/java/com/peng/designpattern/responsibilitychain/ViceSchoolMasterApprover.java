package com.peng.designpattern.responsibilitychain;

public class ViceSchoolMasterApprover extends Approver {
    public ViceSchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() > 10000 && purchaseRequest.getPrice() <= 30000) {
            System.out.println("第" + PurchaseRequest.id + "个请求被处理，处理者为：" + this.getName());
        } else {
            //setApprover(new SchoolMasterApprover("校长"));
            approver.processRequest(purchaseRequest);
        }
    }
}
