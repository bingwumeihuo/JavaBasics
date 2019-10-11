package com.yixin.person;

/**
 * @Package: com.yixin.person
 * @ClassName: test
 * @Description: Java类作用
 * @Author: 式神
 * @CreateDate: 2019/10/11 10:43
 */
public class test {
    public static void main(String[] args) {
        UserTest userTest=new UserTest();
        UserTest t=new UserTest();
        userTest.age=12;
        userTest.name="tom";
        userTest.addAge(2);
        userTest.study();
        userTest.showAge();
        t.showAge();
    }
}
