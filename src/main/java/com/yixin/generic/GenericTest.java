package com.yixin.generic;

import org.junit.Test;

import java.util.*;

/**
 * @Package: com.yixin.generic
 * @ClassName: GenericTest
 * @Description: Java类作用
 * @Author: 式神
 * @CreateDate: 2019/11/14 14:18
 */
public class GenericTest {
    @Test
    public void Test(){
        ArrayList list = new ArrayList();
        list.add(11);
        list.add(121);
        list.add(141);
        list.add(111);
        list.add(116);
        list.add("Tom");
        for (Object souce:list){
            int stuSouce=(int) souce;
            System.out.println(stuSouce);
        }

    }
    @Test
    public void Test2(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(121);
        list.add(141);
        list.add(111);
        list.add(116);
        //添加泛型后，编译时保证数据安全
//        for (Object souce:list){
//            System.out.println(souce);
//        }
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }

    }
    @Test
    public void Test3(){
        HashMap<String, Integer> map = new HashMap<>(16);
        map.put("tom",12);
        map.put("jack",122);
        map.put("linda",112);
        Set<Map.Entry<String, Integer>> entry = map.entrySet();



    }
}
