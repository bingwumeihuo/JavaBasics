package com.yixin.thread.java1;

public class BankTest  {
}
class Bank {
    private Bank() {
    }

    private static Bank instance = null;

    public static synchronized Bank getInstance() {
        //方式一：效率低
//        synchronized (Bank.class) {
//            if (instance==null){
//                instance=new Bank();
//            }
//            return  instance;
//        }
        //方式二 效率更高
        if (instance == null) {
            synchronized (Bank.class) {
                if (instance == null) {
                    instance = new Bank();
                }
            }
        }
        return instance;
    }
}