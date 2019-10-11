package com.yixin.person;

/**
 * @Package: com.yixin.person
 * @ClassName: Test2
 * @Description: Java类作用
 * @Author: 式神
 * @CreateDate: 2019/10/11 16:13
 */
public class Test2 {
    public static void main(String[] args) {
        Student student=new Student();
        student.pint();
    }
    static class Student{
        int number;
        int state;
        int soce;
    public void pint(){
        Student [] stus =new Student[20];
        for (int i=0;i<stus.length;i++){
            //给数组赋值
            stus[i]=new Student();
            //给student对象赋值
            stus[i].number=i+1;
            stus[i].state= (int) (Math.random()*6+1);
            stus[i].soce= (int) (Math.random()*100+1);
        }
        for (int i=0;i<stus.length;i++){
            System.out.println(stus[i].soce);
        }
    }
    }
}
