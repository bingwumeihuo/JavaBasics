package com.yixin.person;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.function.Consumer;

public class People   {
     String a="123";



    public People(String a) {


        this.a = a;
    }

    public static void main(String[] args) {
People people=new People("2323");
        Date date=new Date(323232321L);
        float a=12.1f;
        int a2=3;
        int a3=4;
        String a1="223";
        LinkedList linkedList=new LinkedList();
        ArrayList list=new ArrayList();
        list.add(a);
        list.add(a3);
        list.add(a3);
        list.add(a2);
        list.add(0,a2);
        list.forEach(new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        });


    }
}
