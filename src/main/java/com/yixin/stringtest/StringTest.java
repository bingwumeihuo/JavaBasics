package com.yixin.stringtest;

import org.junit.Test;

/**
 * @Package: com.yixin.stringtest
 * @ClassName: StringTest
 * @Description: Java类作用
 * @Author: 式神
 * @CreateDate: 2019/11/7 9:35
 */
public class StringTest {

    @Test
    public  void StringTest1(){
        long starttime=System.currentTimeMillis();
        String s="";
        for (int i=0;i<100000;i++){
            s +="1231";
        }
        long endtime=System.currentTimeMillis();
        System.out.println("string+++++++++++");
        System.out.println(endtime - starttime);
    }
    @Test
    public  void StringTest2(){
        StringBuffer s2 = new StringBuffer();
        long starttime=System.currentTimeMillis();
        for (int i=0;i<100000;i++){
            s2.append(i);

        }
        long endtime=System.currentTimeMillis();
        System.out.println("StringBuffer+++");
        System.out.println(endtime - starttime);
    }
    @Test
    public  void StringTest3(){
        StringBuilder s3 = new StringBuilder();
        long starttime=System.currentTimeMillis();
        for (int i=0;i<100000;i++){
            s3.append(i);
        }
        long endtime=System.currentTimeMillis();
        System.out.println("StringBuilder+++");
        System.out.println(endtime - starttime);
    }
}

