package com.yixin.collection;

import org.junit.Test;

import java.util.*;

/**
 * /---Map:双列数据，存储Key,Value
 *    /--HashMap:作为Map的主要实现类，线程不安全，效率高，底层是byte[],数组+链表+红黑树，可存储Null
 *      /--LinkedHashMap
 *    /--TreeMap
 *    /--Hashtable:线程安全，效率低，不能存储Null
 *      /--Properties
 * @author 2mawenxin
 */
public class MapTest {
    @Test
    public void HashMap(){
        HashMap hashMap = new HashMap();
        hashMap.put(1,"a");
        hashMap.put(2,"b");
        hashMap.put(3,"c");
        hashMap.put(4,"d");
        hashMap.put(5,"e");
        hashMap.put(6,"f");
        hashMap.put(6,"r");
        System.out.println(hashMap);

        Object value=hashMap.remove("1");
        System.out.println(value);
        System.out.println(hashMap.get(2));
          boolean isExist= hashMap.containsKey(1);
        System.out.println(isExist);
    }
    /**
     *  HashMap遍历元素需要把key和value分别用迭代器遍历
     */
    @Test
    public void MapTest(){
        HashMap hashMap = new HashMap();
        hashMap.put(1,"a");
        hashMap.put(2,"b");
        hashMap.put(3,"c");
        hashMap.put(4,"d");
        hashMap.put(5,"e");
        hashMap.put(6,"f");
        Set set = hashMap.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next+"****"+hashMap.get(next));
        }

//        Set set1 = hashMap.entrySet();
//        Iterator iterator1 = set1.iterator();
//        while (iterator1.hasNext()){
//            Object next = iterator1.next();
//            Map.Entry entry=(Map.Entry) next;
//            System.out.println(entry.getKey()+">>>>>>"+entry.getValue());
//        }
    }

}
