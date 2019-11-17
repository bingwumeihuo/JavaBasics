package com.yixin.reflection;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 式神
 * @date 2019年11月18日 0:43
 */
public class ReflectionTest {
         @Test
    public void Test1(){
             //创建person类对象
             Person person = new Person("Tom",2);
             //通过对象调用类属性和方法
             person.setAge(122);
             System.out.println(person.toString());
             person.show();
             //private修饰的属性，方法，构造器无法直接调用

         }
         @Test
    public void Test2() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
             //反射创建对象
             Class clazz = Person.class;
             Constructor constructor = clazz.getConstructor(String.class, int.class);
             Object tom = constructor.newInstance("Tom", 12);
             Person p=(Person) tom;
             System.out.println(p.toString());
             //通过反射调用属性
             Field age = clazz.getDeclaredField("age");
             age.set(p,10);
             //调方法
             Method show = clazz.getMethod("show");
             show.invoke(p);
             //通过反射可以调用私有方法
             Constructor c1 = clazz.getDeclaredConstructor(String.class);
             c1.setAccessible(true);
             Person p1=(Person) c1.newInstance("hello");
             System.out.println(p1);
             //调用私有属性
             Field name = clazz.getDeclaredField("name");
             name.setAccessible(true);
             name.set(p1,"mawenxin");
             System.out.println(p1);
             Method showtime = clazz.getDeclaredMethod("showtime");
             showtime.setAccessible(true);
             showtime.invoke(p1);


         }
}
