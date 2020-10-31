package com.peng.designpattern.bridge;

public class Client {
    public static void main(String[] args) {
        Phone phone = new FoldedPhone(new Vivo());
        phone.open();
        phone.close();
    }
}
