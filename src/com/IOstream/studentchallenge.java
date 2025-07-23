package com.IOstream;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
import java.io.*;
public class studentchallenge 
{
    public static void main(String[] args) throws Exception
    {
        
        FileInputStream fis1=new FileInputStream("Source1.txt");
        FileInputStream fis2=new FileInputStream("Source2.txt");
        
        FileOutputStream fos=new FileOutputStream("Destination.txt");
                
        SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
        
        
        int b;
        while((b=sis.read())!=-1)
        {
            
            fos.write(b);
        }
        
        sis.close();
        fis1.close();
        fis2.close();
        fos.close();
        
    }   
}