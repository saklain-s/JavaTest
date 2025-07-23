
package com.network_programming;
import java.net.*;
import java.io.*;

public class server {

    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(2000);
        System.out.println("Server has been established");

        Socket stk = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());
        String msg;
        StringBuilder sb;
        do
        {
            msg= br.readLine();
            sb= new StringBuilder(msg);
            sb.reverse();
            msg = sb.toString();
            ps.println(msg);
        }while(!msg.equals("dne"));
        System.out.println("Server is teminated");
    }
    
}


