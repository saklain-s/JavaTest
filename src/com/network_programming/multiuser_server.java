
package com.network_programming;
import java.net.*;
import java.io.*;

public class multiuser_server extends Thread {
    Socket stk;
    public multiuser_server(Socket st)
    {
        stk=st;
    }
    public void run()
    {
        try{
        
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
        stk.close();
        }catch (Exception E){System.out.println(E);}
    }
    public static void main(String[] args) throws Exception {
        
        System.out.println("Server has been established");
        ServerSocket ss = new ServerSocket(2000);
        Socket stk ;
        multiuser_server ms;
        int count=1;
        do{
            stk=ss.accept();
            ms = new multiuser_server(stk);
            System.out.println("Client "+count+++" is connected");
            ms.start();
            
        }while(true);
        
        
    }
    
}


