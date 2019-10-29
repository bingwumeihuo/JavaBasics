package com.yixin.overwrite;

/**
 * @Package: com.yixin.overwrite
 * @ClassName: PersonTest
 * @Description: Java类作用
 * @Author: 式神
 * @CreateDate: 2019/10/21 10:29
 */
public class PersonTest {
    public static void main(String[] args) {
        
        Person person = new Women();
        person.eat();
        System.gc();

    }
}
