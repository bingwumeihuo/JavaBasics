package com.yixin.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Package: com.yixin.collection
 * @ClassName: CollectionsTest
 * @Description: Java类作用
 * @Author: 式神
 * @CreateDate: 2019/11/13 16:49
 */
public class CollectionsTest {
    @Test
    public void Test1(){
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(33);
        list.add(-42);
        list.add(22);
        System.out.println(list);
        Collections.reverse(list);
        Collections.shuffle(list);
        Collections.swap(list,2,0);
            Collections.frequency(list, 12);
        System.out.println();


    }
}
