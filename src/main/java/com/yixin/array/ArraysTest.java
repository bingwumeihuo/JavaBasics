package com.yixin.array;

import java.util.Arrays;

/**
 * @Package: com.yixin.array
 * @ClassName: Arrays操作数据的工具类
 * @Description: Java类作用
 * @Author: 式神
 * @CreateDate: 2019/9/23 13:54
 */
public class ArraysTest {
    public static void main(String[] args) {
        //Arrays比较数组大小方法
        int [] arr=new int[]{1,2,3,5};
        int [] arr1=new int[]{1,4,3,5};
       boolean isEquals= Arrays.equals(arr,arr1);
        System.out.println(isEquals);
        //Arrays二分法查找
        int [] arr2=new int[]{1,2,3,5};
        int dex=Arrays.binarySearch(arr,52);
        if (dex>=0){
            System.out.println(dex);
        }else {
            System.out.println("未找到");
        }
        //Arrays toString
        int [] arr3=new int []{11,232,123,53};
        System.out.println(Arrays.toString(arr3));
        //Arrays fill 方法
        Arrays.fill(arr1,1);
        System.out.println(Arrays.toString(arr1));
        //Arrays sort 排序方法
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }

}

