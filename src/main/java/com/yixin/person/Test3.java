package com.yixin.person;

import javax.naming.Name;
import java.security.spec.NamedParameterSpec;
import java.util.HashSet;
import java.util.Set;

/**
 * @Package: com.yixin.person
 * @ClassName: Test3
 * @Description: Java类作用
 * @Author: 式神
 * @CreateDate: 2019/10/11 18:39
 */
public class Test3 {
   public  static  void  test(Object obj){
       System.out.println("12313");
   }
    public  static  void  test(String obj){
        System.out.println("12313");
    }


    public static void main(String[] args) {
       test(null);
        System.out.println("2222"+(10%2==0));
        test(10%2 == 0?null:new Object());
        test(10%2 == 0?null:null);


    }
}
