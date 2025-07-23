package com.network_programming;

import java.net.*;
import java.io.*;

public class client {

    public static void main(String[] args) throws Exception {
        Socket stk = new Socket("192.168.137.1", 2000);
        System.out.println("Connected to the server.");
        
        BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());
        
        String msg;

        do {
            System.out.print("Enter a message to send to the server: ");
            msg = keyb.readLine();
            
            ps.println(msg);
            msg = br.readLine();
            System.out.println("From Server --> " + msg);
        } while (!msg.equals("dne"));

        keyb.close();
        br.close();
        ps.close();
        stk.close();
        System.out.println("Client terminated.");
    }
}
