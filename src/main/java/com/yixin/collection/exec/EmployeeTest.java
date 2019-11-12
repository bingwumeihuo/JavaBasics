package com.yixin.collection.exec;

import org.junit.Test;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 自然排序
 */
public class EmployeeTest {
    @Test
    public void test1(){
        TreeSet treeSet = new TreeSet();
        Employee employee = new Employee("liudehua", new MyDate(1968,1,23), 55);
        Employee employee1 = new Employee("gujuji", new MyDate(1828,1,23), 55);
        Employee employee2 = new Employee("zhanggengshuo", new MyDate(2348,1,23), 55);
        Employee employee3 = new Employee("liangchaowei", new MyDate(3258,1,23), 55);
        Employee employee4 = new Employee("guofucheng", new MyDate(1218,1,23), 55);
        treeSet.add(employee);
        treeSet.add(employee1);
        treeSet.add(employee2);
        treeSet.add(employee3);
        treeSet.add(employee4);
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
