package com.yixin.person;


import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Package: com.yixin.person
 * @ClassName: Test3
 * @Description: Java类作用
 * @Author: 式神
 * @CreateDate: 2019/10/11 18:39
 */
public class Test3 {
    public Test3(String a) {
    }

    public static void main(String[] args) {

//       Test3 aa=new Test3("1929600551");
//       int aaa=1929600551;
//       Test3 bb=new Test3("222");
//       String a=new String("aa");
//       String b=new String("aa");
//       //ture
//        System.out.println(a.equals(b));
//        //false
//        System.out.println(aa.equals(bb));
//        System.out.println(aa.hashCode()==aaa);
//        ArrayList list=new ArrayList();
//        String s=new String("233");
//        System.out.println(s.length());
//        LinkedList linkedList=new LinkedList();
//        linkedList.add(2);
//        linkedList.add(1);
//        linkedList.add(3);
//        for (int i=0;i<linkedList.size();i++){
//            System.out.println(linkedList.get(i));
//        }
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        int a=2;
        int b=1;
        hashSet.add(a);
        hashSet.add(b);
        hashMap.put(2, 3);
        hashMap.put(0, 3);
        ConcurrentHashMap concurrentHashMap=new ConcurrentHashMap();

        System.out.println(hashMap.get(1).equals(hashMap.get(2)));
        System.out.println(hashSet.contains(hashMap));
    }
}
