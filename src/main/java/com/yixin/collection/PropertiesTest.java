package com.yixin.collection;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @Package: com.yixin.collection
 * @ClassName: PropertiesTest
 * @Description: Java类作用
 * @Author: 式神
 * @CreateDate: 2019/11/13 14:52
 */
public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        try {
            Properties pro=new Properties();
            FileInputStream fileInputStream = new FileInputStream("jdbc.properties");
            pro.load(fileInputStream);
            Object name = pro.get("name");
            Object password = pro.get("Password");
            System.out.println("name"+name+", password"+password);
        } catch (IOException e) {
            e.printStackTrace();

        }


    }
}
