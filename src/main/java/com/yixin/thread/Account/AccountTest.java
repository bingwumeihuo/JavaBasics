package com.yixin.thread.Account;

/**
 * 银行有一个账户
 * 有2个储户向同一个账户存3000，每次存1000，存3次，每次打印当前余额
 *
 */
class Account{
    /**
     余额
     *
     */
private double  balnce;
/**
 存钱方法
 *
 */
public synchronized void deposit(double amt){
    if (amt>0){
        balnce+=amt;
        System.out.println(Thread.currentThread().getName()+":存钱成功，余额为"+balnce);
    }
}

}
class Customer extends Thread{
    private Account account;

    @Override
    public  void run() {
          for (int i=0;i<3;i++){
              account.deposit(1000);
              try {
                  Thread.sleep(1000);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }
    }

    public Customer(Account account) {
        this.account = account;
    }
}


 public class AccountTest {
     public static void main(String[] args) {

         Account account=new Account();
         Customer c1=new Customer(account);
         Customer c2=new Customer(account);
         c1.setName("甲");
         c2.setName("乙");
         c1.start();
         c2.start();

     }
}
