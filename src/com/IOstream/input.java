package com.IOstream;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
import java.io.*;
public class input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
                    FileInputStream fis = new FileInputStream("Test.txt");
                    byte b[] = new byte[fis.available()];
                    fis.read(b);
                    String str = new String(b);
                    System.out.println(str);
                    
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e) ;
        }
    
}}
/*
try (FileReader

fr = new FileReader("C:/MyJava/Test.txt"))

T

int x;

while((x=fr.read()) !=- 1)
{

System.out.print((char)x);
*/