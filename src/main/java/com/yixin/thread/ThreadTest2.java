package com.yixin.thread;

/**
 * 线程常用方法
 * 1. start() 启动当前线程，调用run方法
 * 2. run(): 通常需要重新Thread中的该方法，将创建的线程声明在此方法中
 * 3. currentThread() : 静态方法，返回当前执行的线程
 * 4. getName() :获取当前线程名
 * 5. setName（） : 设置当前线程名
 * 6. yieid() : 释放当前cpu的操作权
 * 7. join() : 在线程a中调用线程b的join（），此时a线程进入阻塞状态，知道b线程执行完，线程a
 * 才开始执行
 */
public class ThreadTest2 {

}
