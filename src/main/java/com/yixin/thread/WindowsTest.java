package com.yixin.thread;

/**
 * @Package: com.yixin.thread
 * @ClassName: WindowsTest
 * @Description: Java类作用
 * @Author: 式神
 * @CreateDate: 2019/10/29 10:22
 */
public class WindowsTest {
    public static void main(String[] args) {
        Windows w = new Windows();
        Windows w1 = new Windows();
        Windows w2 = new Windows();
        w.setName("线程1");
        w.start();
        w1.setName("线程2");
        w1.start();
        w2.setName("线程3");
        w2.start();

    }
}
class Windows extends Thread{
    private static int t=100;
    private static Object obj=new Object();
    @Override
    public void run() {
        synchronized (obj){
        while (true){
            if (t>0){
                System.out.println(Thread.currentThread().getName()+":"+t);
                t--;
            }else {
              break;
            }
        }
        }
    }
}
