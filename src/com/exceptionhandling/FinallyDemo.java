/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.exceptionhandling;

public class FinallyDemo 
{
    static void meth1()throws Exception
    {
        try
        {
            
        throw new Exception();
        }
        finally
        {
           //this message will definitely execute 
        System.out.println("Final Message");
        }
        
    }
    
    public static void main(String[] args) throws Exception
    {
        meth1();
    }   
}