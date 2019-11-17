package com.yixin.IOStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 式神
 * 打印流
 * @date 2019年11月17日 15:12
 */
public class OtherStream {
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        while (true) {
            System.out.println("请输入:");
            String data = br.readLine();
            if ("e".equalsIgnoreCase(data) || "exit".equalsIgnoreCase(data)) {
                System.out.println("输入结束");
                break;
            }
            String s = data.toUpperCase();
            System.out.println(s);
        }
        br.close();


    }
}

