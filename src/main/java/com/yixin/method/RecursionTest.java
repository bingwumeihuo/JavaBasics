package com.yixin.method;

import com.yixin.person.test;

import java.util.Arrays;

/**
 * @Package: com.yixin.method
 * @ClassName: RecursionTest
 * @Description: 递归方法
 * @Author: 式神
 * @CreateDate: 2019/10/12 16:44
 */
public class RecursionTest {
    public static void main(String[] args) {
//        int sum=0;
//        for (int i=0;i<=100;i++){
//             sum+=i;
//            System.out.println();
//        }
        int [] a=new int [] {1,232,123,12,4,1};
        RecursionTest test=new RecursionTest();
        System.out.println(test.getsum(3));
        Arrays.sort(a);

    }
    public int getsum(int n){
        if (n==1){
            return 1;
        }else {
            return n*getsum(n-1);
        }
    }
}
