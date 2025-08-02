/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.network_programming;
import java.net.*;
/**
 *
 * @author User
 */
public class datagram_SErver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
        DatagramSocket ds = new DatagramSocket(2000);
        byte b[]=new byte[1024];
        DatagramPacket dp = new DatagramPacket(b, 1024);
        ds.receive(dp);
        String msg = new String(dp.getData()).trim();
        System.out.println("From server: "+msg);
        StringBuilder sb = new StringBuilder(msg);
        msg=sb.toString();
        dp = new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getByName("192.168.137.1"),2001);
        ds.send(dp);
        ds.close();
    }
    
}
