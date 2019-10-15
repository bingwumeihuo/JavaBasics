package com.yixin.encapsulation;


/**
 * @Package: com.yixin.encapsulation
 * @ClassName: Test1
 * @Description: Java类作用
 * @Author: 式神
 * @CreateDate: 2019/10/14 10:12
 */
public class Test1 {
    public static void main(String[] args) {
        Animals a = new Animals();
        a.setleg(3);
        a.show();
    }

    }
     class Animals{
       private int leg;
        int age;
        String name ;
         public int getLeg() {
             return leg;
         }
         public int getAge() {
             return age;
         }

         public void setAge(int age) {
             this.age = age;
         }

         public String getName() {
             return name;
         }

         public void setName(String name) {
             this.name = name;
         }

         public void setleg(int l){
            if (l>=0&&l%2==0){
                leg=l;
            }else  {
                leg=0;
            }
        }
    public void show(){
        System.out.println("name ="+name+"  age ="+age+"  leg ="+leg);
    }
}
