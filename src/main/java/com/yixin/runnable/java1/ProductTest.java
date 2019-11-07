package com.yixin.runnable.java1;

/**
 * @Package: com.yixin.runnable.java1
 * @ClassName: ProductTest
 * @Description: Java类作用
 * @Author: 式神
 * @CreateDate: 2019/10/30 14:04
 */

class Clerk {
    private int n = 0;

    public synchronized void producerProduct() {
        if (n < 20) {
            n++;
            notify();
            System.out.println(Thread.currentThread().getName() + "开始生产第" + n + "个产品");
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized void consumerProduct () {
        if (n>0){
            System.out.println(Thread.currentThread().getName() + "开始消费第" + n + "个产品");
            n--;
            notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Producer extends Thread{
    private Clerk clerk;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"开始生产产品");
        while (true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.producerProduct();
        }
    }

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }
}
class Consumer extends Thread {
    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    private Clerk clerk;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "开始消费产品");
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.consumerProduct();
        }
    }
}
public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk=new Clerk();
        Producer p1=new Producer(clerk);
        p1.setName("生产者1");
        p1.start();
        Consumer c1=new Consumer(clerk);
        c1.setName("消费者1");
        c1.start();

    }




}
