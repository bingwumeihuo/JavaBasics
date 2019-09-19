package com.yixin.array;


/**
 * @Package: com.yixin.array
 * @ClassName: demo1
 * @Description: 二分法查找
 * @Author: 式神
 * @CreateDate: 2019/9/18 9:52
 */
public class demo1 {
    public static void main(String[] args) {
        int[] arr3 = new int[]{-99,-54,-2,0,2,33,43,256,999};
        boolean isFlag = true;
        int number=2563;
        int head = 0;
        int end = arr3.length - 1;
        boolean flag=true;
        while (head<=end){
            int middle =(head+end)/2;
            if (number==arr3[middle]){
                flag=false;
                System.out.println("找到数据位置为"+middle);
                break;
            }else  if (number<arr3[middle]){
                end =middle-1;
            }else {
                head=middle+1;
            }
        }
        if (flag){
            System.out.println("未找到");
        }
    }
}
