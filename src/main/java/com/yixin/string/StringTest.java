package com.yixin.string;

/**
 * @author Administrator
 */
public class StringTest {
    public static   void str(){
        //定义在字符常量池
        String s1="javaee";
        String s2="javaee";
        // 定义在堆空间
        String s3=new String("javaee");
        String s4=new String("javaee");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s3 == s4);


    }
    public static void main(String[] args) {
        str();
    }



}
