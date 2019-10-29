package com.yixin.runnable;

/**
 * @Package: com.yixin.runnable
 * @ClassName: Test1
 * @Description: 多线程创建：实现Runnable接口
 * 1. 创建Runnable接口的实现类
 * 2. 创建类去实现Runnble中的抽象方法
 * 3. 创建实现类对象
 * 4. 将此对象当做参数传递到Thread类的构造器中，创建Thread类的对象
 * 5. 通过Thread类对象调用start（）方法
 * * @Author: 式神
 * @CreateDate: 2019/10/29 10:37
 */
public class Test1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {

                System.out.println(Thread.currentThread().getName() + "  " + i);
            }
        }
    }
}
class ThreadTest{
    public static void main(String[] args) {
        // 3. 创建实现类对象
        Test1 test1 = new Test1();
        //4. 将此对象当做参数传递到Thread类的构造器中，创建Thread类的对象
        Thread thread = new Thread(test1);
        //5. 通过Thread类对象调用start（）方法
        thread.setName("线程");
        thread.start();

    }
}
