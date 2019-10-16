package com.yixin.method;

/**
 * @Package: com.yixin.method
 * @ClassName: Account
 * @Description: Java类作用
 * @Author: 式神
 * @CreateDate: 2019/10/15 15:29
 */
public class Account {
    private int id;
    private double balance;
    private double annualinterestrate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualinterestrate() {
        return annualinterestrate;
    }

    public void setAnnualinterestrate(double annualinterestrate) {
        annualinterestrate = annualinterestrate;
    }

    public Account(int id, double balance, double annualinterestrate) {
        this.id = id;
        this.balance = balance;
        annualinterestrate = annualinterestrate;
    }
    public void withdraw(double amount){
        if (balance<amount){
            System.out.println("余额不足");
            return;
        }
         balance -=amount;
        System.out.println("取出"+amount);
    }
    public void deposit(double amount){
         if (amount>0){
             balance+=amount;
             System.out.println("存入"+amount);
         }
    }
}
