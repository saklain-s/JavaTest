package com.IOstream;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
import java.io.*;

public class bufferreader
{
    public static void main(String[] args)throws Exception 
    {
        FileReader fis=new FileReader("Test.txt");
        BufferedReader bis=new BufferedReader(fis);
        
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.mark(10);
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.reset();
        
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        
        System.out.println("String "+bis.readLine());
        
        
    }    
}