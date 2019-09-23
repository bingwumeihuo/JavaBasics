package com.yixin.array;
/**
 * @Package: com.yixin.array
 * @ClassName: BubbleSort
 * @Description: 冒泡排序
 * @Author: 式神
 * @CreateDate: 2019/9/19 16:12
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, -1, 123, 1, 223, 33, 4343, 2256, 999};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j=0;j< arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            System.out.println(arr[i] + "\t");
        }
    }
}
