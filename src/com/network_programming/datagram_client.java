/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.network_programming;
import java.net.*;

public class datagram_client {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(2001);
        String msg = "Hello world";
        DatagramPacket dp = new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getByName("192.168.137.1"),2000);
        ds.send(dp);
        byte b[] = new byte[1024];
        ds.receive(dp);
        msg = new String(dp.getData()).trim();
        System.out.println("From client: "+msg);
        ds.close();

        
    }
    
}
