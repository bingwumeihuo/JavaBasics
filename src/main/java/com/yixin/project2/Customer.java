package com.yixin.project2;

/**
 * @Package: com.yixin.project2
 * @ClassName: Customer
 * @Description: Java类作用
 * @Author: 式神
 * @CreateDate: 2019/10/15 16:26
 */
public class Customer {
    private int id;
    private String name;

    public Customer(int id, String name, String sex, int age, int phone, String email) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    private String sex;

    public Customer(int id) {
        this.id = id;
    }

    private int age;
    private int phone;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
