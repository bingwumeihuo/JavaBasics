package com.yixin.extend;

/**
 * @Package: com.yixin.extend
 * @ClassName: person
 * @Description: 继承作用
 *               ①代码复用
 *               ②便于功能扩展
 *               ③减少代码冗余
 *
 * @Author: 式神
 * @CreateDate: 2019/10/16 16:21
 */
public class person {
    private String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("吃饭");
    }
//
//    public person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
}
