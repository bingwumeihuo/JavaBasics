package com.yixin.collection;

import org.junit.Test;

import java.util.HashMap;

/**
 * /---Map:双列数据，存储Key,Value
 *    /--HashMap:作为Map的主要实现类，线程不安全，效率高，底层是byte[],数组+链表+红黑树，可存储Null
 *
 *      /--LinkedHashMap
 *    /--TreeMap
 *    /--Hashtable:线程安全，效率低，不能存储Null
 *      /--Properties
 */
public class MapTest {
    @Test
    public void HashMap(){
        HashMap hashMap = new HashMap();
        hashMap.put(null,null);

    }

}
