package com.yixin.method;
/**
 * @Package: com.yixin.method
 * @ClassName: AccountTest
 * @Description: Java类作用
 * @Author: 式神
 * @CreateDate: 2019/10/15 15:34
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account=new Account(1,80,0.4);
        account.deposit(100);
        account.withdraw(180);
        account.withdraw(180);
    }
}
