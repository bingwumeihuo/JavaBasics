package com.yixin.person;

import java.util.Scanner;
import java.util.Vector;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector vector=new Vector();
        int maxSouce=0;
        for (;;){
            System.out.println("请输入成绩：");
            int souce=sc.nextInt();
            if (0>souce){
                break;
            }
             if (100<souce){
                System.out.println("重新输入");
                continue;
            }
            vector.addElement(souce);
            if (souce>maxSouce){
                maxSouce=souce;
            }
        }
        char level ;
        for (int i=0;i<vector.size();i++){
            Object ob=vector.elementAt(i);
            int souce= (int) ob;
            if (maxSouce-souce<=10){
                level='A';
            }else if (maxSouce-souce<=20){
                level='B';
            }else if (maxSouce-souce<=30){
                level='C';
            }else {
                level='菜';
            }
            System.out.println("student"+i+"成绩："+souce+"等级"+level);
        }
    }
}
