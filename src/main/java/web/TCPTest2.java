package web;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 式神
 * @date 2019年11月17日 18:27
 */
public class TCPTest2 {
    @Test
    public void client() throws IOException {
        //创建socket
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),37100);
        //创建流
        OutputStream os = socket.getOutputStream();
        FileInputStream fi = new FileInputStream(new File("a.jpg"));
        byte[] bytes = new byte[1024];
        int len;
        while ((len=fi.read(bytes))!=-1){
            os.write(bytes,0,len);
        }
        fi.close();
        os.close();
        socket.close();

    }
    @Test
    public void server() throws IOException {
        ServerSocket serverSocket = new ServerSocket(37100);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        FileOutputStream fileOutputStream = new FileOutputStream(new File("b.jpg"));
        byte[] bytes = new byte[1024];
        int len;
        while ((len=inputStream.read(bytes))!=-1){
            fileOutputStream.write(bytes,0,len);
        }
        fileOutputStream.close();
        inputStream.close();
        serverSocket.close();
    }
}
