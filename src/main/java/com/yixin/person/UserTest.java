package com.yixin.person;

/**
 * @Package: com.yixin.person
 * @ClassName: UserTest
 * @Description: Java类作用
 * @Author: 式神
 * @CreateDate: 2019/10/10 15:52
 */
public class UserTest {
    String name;
    int age;
    boolean sex;

    public void study(){
        System.out.println("studying");
        System.out.println(sex);
    }
    public void showAge(){
        System.out.println(age);
    }
    public int addAge(int i){
        age+=i;
        return age;
    }



}
