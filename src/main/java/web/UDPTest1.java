package web;

import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author 式神
 * @date 2019年11月17日 23:48
 */
public class UDPTest1 {
    @Test
    public void sander() throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        String s = "我是一个导弹";
        byte[] data = s.getBytes();
        InetAddress byName = InetAddress.getByName("127.0.0.1");
        DatagramPacket datagramPacket = new DatagramPacket(data, 0, data.length, byName, 9090);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();

    }

    @Test
    public void receiver() throws IOException {
        DatagramSocket socket = new DatagramSocket(9090);
        byte[] bytes = new byte[20];
        DatagramPacket packet = new DatagramPacket(bytes, 0, bytes.length);
        socket.receive(packet);
        System.out.println(new String(packet.getData(),0,packet.getLength()));
        socket.close();
    }
}
