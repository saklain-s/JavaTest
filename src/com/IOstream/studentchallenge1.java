package com.IOstream;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
import java.io.*;
public class studentchallenge1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            FileInputStream fis = new FileInputStream("C:/Users/User/OneDrive/Desktop/Java/IOstream/resource1.txt");
            FileOutputStream fos = new FileOutputStream("resource2.txt");
            int b;
            while((b=fis.read())!=-1)
            {

               if (b >= 65 && b <= 90) // Uppercase ASCII A-Z
                    fos.write(b + 32);
                else
                    fos.write(b);
            }
            fis.close();
            fos.close();
            
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
        
    }
    
}
