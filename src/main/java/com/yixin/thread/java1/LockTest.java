package com.yixin.thread.java1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 线程安全问题的解决方法
 * synchronized :执行完相应的代码后自动释放锁
 * ReentrantLock : lock  需要手动的上锁和解锁
 */

class Windows implements Runnable{
private int tricket=100;
private  ReentrantLock reentrantLock=new ReentrantLock(true);
    @Override
    public void run() {
        while (true){
            try {
                reentrantLock.lock();
                if (tricket>0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"票号为"+tricket);
                    tricket--;
                }else {
                    break;
                }
            } finally {
                reentrantLock.unlock();
            }
        }

    }
}
public class LockTest {
    public static void main(String[] args) {
        Windows windows = new Windows();
        Thread t1 = new Thread(windows);
        Thread t3 = new Thread(windows);
        Thread t2 = new Thread(windows);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3 .start();
    }
}
