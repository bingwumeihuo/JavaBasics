package com.yixin.method;

/**
 * @Package: com.yixin.method
 * @ClassName: MethodArgs
 * @Description: Java可变个数形参  格式为 参数类型...参数名  调用是可传入0,2....n个参数 .
 * 方法的参数部分有可变形参，需要放在形参声明的最后，可变个数形参与相同方法名，
 * 相同形参类型的数组不构成重载，二者不能共存
 * 可变个数形参在方法形参中只能声明一个
 * @Author: 式神
 * @CreateDate: 2019/10/12 14:20
 */
public class methodArgs {
    public void  show (String ... stu){
        for(int i=0;i<stu.length;i++){
        System.out.println(stu[i]);
    }
    }

    public static void main(String[] args) {
        methodArgs me =new methodArgs();
        me.show("2323","1232");
    }
}
