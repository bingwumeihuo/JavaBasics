package com.yixin.collection;

/**
 * @Package: com.yixin.collection
 * @ClassName: Person
 * @Description: Java类作用
 * @Author: 式神
 * @CreateDate: 2019/11/8 15:16
 */
public class Person {
    private int age;

    @Override
    public String toString() {
        return "Person{" + "age=" + age + ", name='" + name + '\'' + '}';
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

}
