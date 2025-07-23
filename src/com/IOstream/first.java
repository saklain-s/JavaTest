package com.IOstream;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
import java.io.*;
public class first {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
                    FileOutputStream fos = new FileOutputStream("Test.txt");
                    
                    String str = "This is my first IO stream program";
                    byte b[] = str.getBytes();
                    
                    //fos.write(b, 8, str.length()-8);
                    fos.write(b);

        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e) ;
        }
        
    }
    
}
