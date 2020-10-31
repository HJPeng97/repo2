package com.peng.designpattern.responsibilitychain;

public class CollegeApprover extends Approver {
    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() > 5000 && purchaseRequest.getPrice() <= 10000) {
            System.out.println("第" + PurchaseRequest.id + "个请求被处理，处理者为：" + this.getName());
        } else {
            //setApprover(new ViceSchoolMasterApprover("副校长"));
            approver.processRequest(purchaseRequest);
        }
    }
}
