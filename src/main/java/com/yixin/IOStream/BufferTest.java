package com.yixin.IOStream;

import org.junit.Test;

import java.io.*;

/**
 * @author 式神
 * @date 2019年11月16日 13:32
 *  * 流的抽象基类                 节点流（文件流）           缓冲流（处理流的一种）
 *  * InputStream                  FileInputStream          BufferedInputStream
 *  * OutputStream                 FileOutputStream         BufferedOutputStream
 *  * Reader                       FileReader               BufferedReader
 *  * Writer                       FileWriter               BufferedWriter
 */
public class BufferTest {
    @Test
    public void test() {
        long start = System.currentTimeMillis();
        String a1="E:\\尚硅谷Java核心基础_2019年版\\day03_Java基本语法\\1.avi";
        String a2="E:\\尚硅谷Java核心基础_2019年版\\day03_Java基本语法\\2.avi";
        bufferTest(a1,a2);
        long end = System.currentTimeMillis();
        System.out.println((end - start));
    }
    public void bufferTest(String s1,String s2)  {
        BufferedInputStream bi = null;
        BufferedOutputStream bo = null;
        try {
            File f1 = new File(s1);
            File f2 = new File(s2);
            //提供流操作类对象
            FileInputStream fi = new FileInputStream(f1);
            FileOutputStream fo = new FileOutputStream(f2);
            bi = new BufferedInputStream(fi);
            bo = new BufferedOutputStream(fo);
            //操作流
            int len;
            byte[] bytes = new byte[1024];
            while ((len=bi.read(bytes))!=-1){
                bo.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭流 要求：先关闭外层再关内层
            try {
                assert bi != null;
                bi.close();
                assert bo != null;
                bo.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
