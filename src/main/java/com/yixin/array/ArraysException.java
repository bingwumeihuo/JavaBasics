package com.yixin.array;

/**
 * @Package: com.yixin.array
 * @ClassName: ArraysException 常见异常
 * 1. 下标越界 ArrayIndexOutOfBoundsException
 * 2. 空指针异常  NullPointerException
 * @Description: Java类作用
 * @Author: 式神
 * @CreateDate: 2019/9/23 14:20
 */
public class ArraysException {
    public static void main(String[] args) {
        //下标越界
        int [] arr=new int[]{1,2,3};
        System.out.println(arr[3]);
        // 空
        int [] arr1=new int[1];
        arr1=null;
        System.out.println(arr1);
    }
}
