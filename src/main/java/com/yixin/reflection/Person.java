package com.yixin.reflection;

/**
 * @author 式神
 * @date 2019年11月18日 0:41
 */
public class Person {
    private String name;
     int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    private Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Test1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person() {
    }
    public void show(){
        System.out.println("hello");
    }
    private void showtime(){
        System.out.println("你看不到我");
    }
}
