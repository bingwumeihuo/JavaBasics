package com.yixin.overwrite;

/**
 * @Package: com.yixin.overwrite
 * @ClassName: Person
 * @Description: Java类作用
 * @Author: 式神
 * @CreateDate: 2019/10/17 10:35
 */
public class Person {
   private String name;

    public static void main(String[] args) {
    }

    public Person() {

    }

    private int age;
    public void eat(){
        System.out.println("人吃饭");
    }
    public void number(){
        eat();
        System.out.println("你输入的手机号为"+name);
    }
    public String ha(){
        return "ha";
    }
}
