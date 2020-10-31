package com.peng.designpattern.responsibilitychain;

public class Client {
    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 50000);
        Approver departmentApprover = new DepartmentApprover("何主任");
        Approver collegeApprover = new CollegeApprover("何院长");
        Approver viceSchoolMasterApprover = new ViceSchoolMasterApprover("何副校长");
        Approver schoolMasterApprover = new SchoolMasterApprover("何校长");

        //设置下一个处理者
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);
//        viceSchoolMasterApprover.setApprover(departmentApprover); // 可以设置成一个环，这样就可以一开始不管将请求交给谁处理都可以

        //将请求进行处理
        departmentApprover.processRequest(purchaseRequest);
        //处理第二个请求
        PurchaseRequest purchaseRequest1 = new PurchaseRequest(1, 6000);
        departmentApprover.processRequest(purchaseRequest1);
    }
}
