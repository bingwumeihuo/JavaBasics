package com.yixin.thread;
class  Math implements Runnable{
    private  int number=1;

    @Override
    public void run() {
            while (true){
                synchronized (this) {
                    notify();
                    if (number<100){
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName()+":数字为"+number);
                        number++;
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else {
                        break;
                    }
                }


            }
    }
}

public class waitTest {
    public static void main(String[] args) {
        Math math=new Math();
        Thread t1 = new Thread(math);
        Thread t2 = new Thread(math);
        t1.setName("A");
        t2.setName("B");
        t1.start();
        t2.start();

    }
}
