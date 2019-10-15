package com.yixin.method;

/**
 * @Package: com.yixin.method
 * @ClassName: overLoad
 * @question   定义一个方法max实现：
 *              1.实现2个int数中最大值 2.2个double数中最大值 3.3个double数中最大值
 * @Description: 重载方法：同一类并且同一个方法名，不同的参数个数，参数类型的叫做重载
 * @Author: 式神
 * @CreateDate: 2019/10/12 13:44
 */
public class overLoad {
    public int  max(int a,int b){
        return (a>b)? a:b;
    }
    public  double   max(double a,double b){
        return (a>b)? a:b;
        }
    public  double  max(double a,double b,double f){
     double max =(a>b)? a:b;
     return  (max>f)? max:f;
    }

    public static void main(String[] args) {
        overLoad over=new overLoad();
        System.out.println(over.max(2,1));
        over.max(2.2,1.3);
        over.max(2.2,1.4,3.2);
    }
}
