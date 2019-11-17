package web;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author 式神
 * @date 2019年11月17日 18:00
 */
public class TCPTest {
    public static void main(String[] args) throws IOException {
        InetAddress localHost = InetAddress.getLocalHost();
        Socket socket = new Socket(localHost,37100);
        OutputStream outputStream = socket.getOutputStream();
        Scanner scanner = new Scanner(System.in);
        outputStream.write(scanner.next().getBytes());
        outputStream.close();
        socket.close();
    }
    @Test
    public void server() throws IOException {
        //创建服务器端ServerSocket,指明端口
        ServerSocket ss = new ServerSocket(37100);
        //调用accent方法表示接受来自于的客户端
        Socket accept = ss.accept();
        //获取输入流
        InputStream is = accept.getInputStream();
        //读取输入流
        ByteArrayOutputStream bs = new ByteArrayOutputStream();
        byte[] bytes = new byte[5];
        int len;
        while ((len= is.read(bytes))!=-1){
            bs.write(bytes,0,len);
        }
        System.out.println(bs.toString());
        System.out.println("收到来自于:"+accept.getInetAddress().getHostAddress());
        bs.close();
        is.close();
        ss.close();
        accept.close();


    }
}
