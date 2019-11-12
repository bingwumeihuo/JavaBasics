package com.yixin.collection;

import org.junit.Test;

import java.util.*;

/**
 * /----Collection
 *  /--Set
 *    /--HashSet:线程不安全，可存储NUll
 *      /--LinkedHashSet:作为HashSet的子类，遍历其内部结构，可以按照添加顺序
 *      频繁的遍历操作效率高
 *    /--TreeSet:可以按照添加对象的指定属性，进行排序
 *
 */
public class SetListTest {
    @Test
    public void SetTest(){
        Set set = new HashSet();
        set.add(123);
        set.add(456);
        set.add(789);
        set.add(new Person(12,"小米"));
        set.add(new Person(13,"华为"));

    }

    /**
     *
     */
    @Test
    public void SetTest1(){
        Set set = new TreeSet();
        set.add(new Person(12,"Tom"));
        set.add(new Person(13,"jono"));
        set.add(new Person(14,"ttom"));
        set.add(new Person(15,"jom"));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }



}
