package com.yixin.collection.exec;

public class Employee implements Comparable{
    private String name;
    private  MyDate brithday;

    public Employee(String name, MyDate brithday, int age) {
        this.name = name;
        this.brithday = brithday;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", brithday=" + brithday +
                ", age=" + age +
                '}';
    }

    private  int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyDate getBrithday() {
        return brithday;
    }

    public void setBrithday(MyDate brithday) {
        this.brithday = brithday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee() {
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Employee){
            Employee employee= (Employee)o;
            return this.name.compareTo(employee.name);
        }
    throw new RuntimeException("传入数据类型不一致");
    }

}
