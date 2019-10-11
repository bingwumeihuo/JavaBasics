package com.yixin.person;

/**
 * @Package: com.yixin.person
 * @ClassName: Test1
 * @Description: Java类作用
 * @Author: 式神
 * @CreateDate: 2019/10/11 15:54
 */
public class Test1 {

    public static void main(String[] args) {
        Test1 test1=new Test1();
        System.out.println("面积为"+test1.method(5,2));
    }

    public int  method(int a,int b ){
        for (int i=0;i<a;i++){
            for (int j=0;j<b;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        return a*b;
    }
}
