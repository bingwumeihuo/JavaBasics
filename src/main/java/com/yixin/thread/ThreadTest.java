package com.yixin.thread;

/**
 * 多线程创建
 * 1.创建继承Thread类的子类
 *2.重写Thread类的run方法
 * 3. 创建Thread类的对象
 * 4. 通过该对象调用start方法
 * 2.
 * @author 2mawenxin
 */
public class ThreadTest extends Thread {
    private  static int a=100;
   private static Object obj=new Object();
    @Override
    public  void  run() {
        //如下操作仍然在主线程执行
        synchronized (obj) {
            for (int i = 0; i < a; i++) {
                System.out.println(Thread.currentThread().getName() + "  " + i);
            }
        }
    }
    public static void main(String[] args) {
        ThreadTest t1 = new ThreadTest();
        ThreadTest t2 = new ThreadTest();
        t1.setName("线程1");
        t1.start();//1.启动当前线程 2. 调用当前线程的run()
        //t1.run();//不能直接使用run方法启动线程
        t2.setName("线程2");
         t2.start();
    }

}
