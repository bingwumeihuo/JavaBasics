package com.yixin.IOStream;

import org.junit.Test;

import java.io.*;

/**
 * @author 式神
 * @date 2019年11月15日 23:23
 * 流的分类
 * 1.操作数据单位：字符流，字节流
 * 2.数据流向：输入流，输出流
 * 3.流的角色：节点流，处理流
 * 流的抽象基类                 节点流（文件流）           缓冲流（处理流的一种）
 * InputStream                  FileInputStream          BufferedInputStream
 * OutputStream                 FileOutputStream         BufferedOutputStream
 * Reader                       FileReader               BufferedReader
 * Writer                       FileWriter               BufferedWriter
 */
public class IOTest {
    @Test
    public void test()  {
        //流对象实例化
        FileReader file1 = null;
        try {
            File file = new File("a.txt");
            //提供具体的流
            file1 = new FileReader(file);
            //数据读入，返回文件读入字符，如果达到文件末尾，返回-1
            int data ;
            while ((data=file1.read())!=-1){
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            assert file1 != null;
            try {
                file1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //流关闭


    }
    //对read方法升级
    @Test
    public void test1()  {
      //1.File实例化
        FileReader f1 = null;
        try {
            File file = new File("a.txt");
            //2.FileReader实例化
            f1 = new FileReader(file);
            //3.读入操作 返回每次读入数组中字符个数
            char[] chars = new char[5];
            int len;
            while ((len=f1.read(chars))!=-1){
           for (int i=0;i<chars.length;i++){
        System.out.print(chars[i]);
    }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert f1!=null;
            try {
                f1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //4.资源关闭
    }
    /**
     写入操作：file可以不存在，如果不存在将自动创建文件
     如果存在，将原文件覆盖
     如果流使用的构造器是FileWriter（file），将原文件覆盖
     如果流使用的构造器是FileWriter（file，true），将原文件增加

     *
     */
    @Test
    public void testOutWriter() throws IOException {
        //1.实例化File类
        File file = new File("a1.txt");
        //2.提供写出类对象
        FileWriter fileWriter = new FileWriter(file,true);
        //3.写出操作
        fileWriter.write("Can I help you \n");

        //4.资源关闭
            fileWriter.close();
    }

    /**
     * 将文件写出后读出来
     */
    @Test
    public void testFileReaderFileWriter()  {
        //实例化流对象
        FileWriter fw = null;
        FileReader fr = null;
        try {

            File file = new File("a.txt");
            File file1 = new File("hello.txt");
                //字符流无法实现图片复制
//            File file = new File("a.jpg");
//            File file1 = new File("hello.jpg");
            //提供写入,读入对象
            fw = new FileWriter(file1);
            fr = new FileReader(file);
            //数据的读入和写出操作
            char[] chars = new char[5];
            int len;
            while ((len=fr.read(chars))!=-1){
                fw.write(chars,0,len);
                }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        }
        @Test
    public void testByteFile()  {
            long start = System.currentTimeMillis();
            String s1="E:\\尚硅谷Java核心基础_2019年版\\day03_Java基本语法\\01-尚硅谷-Java语言基础-每天一考.avi";
            String s2="E:\\尚硅谷Java核心基础_2019年版\\day03_Java基本语法\\1.avi";
            copyFile(s1,s2);
            long end = System.currentTimeMillis();
            float s=(end-start)/1000f;
            System.out.println("复制完成所花费时间为"+s);
            }
        public void copyFile(String st1,String st2){
            FileInputStream fs = null;
            FileOutputStream fo = null;
            try {
                File f1 = new File(st1);
                File f2 = new File(st2);
                //提供写出，读入对象
                fs = new FileInputStream(f1);
                fo = new FileOutputStream(f2);
                int len;
                byte[] bytes = new byte[1024];
                while ((len=fs.read(bytes))!=-1){
                    fo.write(bytes,0,len);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    assert fs != null;
                    fs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    assert fo != null;
                    fo.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

