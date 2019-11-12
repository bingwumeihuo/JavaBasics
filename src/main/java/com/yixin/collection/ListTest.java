package com.yixin.collection;

import org.junit.Test;

import java.util.*;

/**
 *
 * @author Administrator
 * /----Collection
 *      /----List
 *        /--ArrayList:线程不安全，效率高，底层为Object[]数组
 *        /--LinkedList:线程不安全，底层为双向链表，频繁插入删除比ArrayList效率高
 *        /--vector:线程安全，效率低，底层为Object[]数组
 *
 */
public class ListTest {
    @Test
    public void Test1(){
        ArrayList objects = new ArrayList();
        objects.add("23");
        objects.add("46");
        System.out.println(objects.size());
        System.out.println("*********************");
        ArrayList s1 = new ArrayList();
        s1.add("23");
        s1.add("78");
        s1.add("46");
        s1.addAll(objects);
        System.out.println(s1.containsAll(objects));
        System.out.println(s1.size());
        System.out.println(objects);

        s1.clear();
        System.out.println("*********************");
        System.out.println(s1.isEmpty());

    }
    @Test
    public void Test2(){
        Collection c1=new ArrayList();
        c1.add(123);
        c1.add(456);
        c1.add(new Person(12,"Tom") );
        c1.add(new String("hello"));
        c1.add(false);
        Collection c2= Arrays.asList(123,222,333);
        c1.retainAll(c2);
        System.out.println(c1);
        Object[] a1 = c1.toArray();
        for (int i=0;i< a1.length;i++){
            Object o=a1[i];
            System.out.println(o);
        }


    }
    @Test
    public void Test3(){
        Collection c1=new ArrayList();
        c1.add(123);
        c1.add(456);
        c1.add(new Person(12,"Tom") );
        c1.add(new String("hello"));
        c1.add(false);
        Collection c2= Arrays.asList(123,222,333);
        Iterator iterator = c1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("**********************");

    }
}
