package com.yixin.thread;

/**
 * @author 2mawenxin
 */
public class ThreadTest1 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.setName("线程1");
        t1.start();
        Thread2 t2 = new Thread2();
        t2.start();

        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }.start();
    }
}

class Thread1 extends Thread {
}

class Thread2 extends Thread {

}
