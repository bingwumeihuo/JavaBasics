package com.yixin.string;

import org.junit.Test;

public class StringMethodTest {
    @Test
    public void test1(){
        String s1="HelloWorld";
        String s2="  2321";
        System.out.println(s1.length());
        System.out.println(s1.charAt(1));
        System.out.println(s2.isEmpty());
        String s3=s1.toLowerCase();
        System.out.println(s1.toUpperCase());
        System.out.println(s2.trim());
    }
}
