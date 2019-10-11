package com.yixin.person;

/**
 * @Package: com.yixin.person
 * @ClassName: Circlet
 * @Description: Java类作用
 * @Author: 式神
 * @CreateDate: 2019/10/11 14:56
 */
public class Circlet {


    public static void main(String[] args) {
        Circlet circlet = new Circlet();
        System.out.println(circlet.findArea(1));
    }

    public double findArea(double redius) {
        double area = redius * redius * Math.PI;
        return area;
    }
}
