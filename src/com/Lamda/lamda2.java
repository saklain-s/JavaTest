/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.Lamda;



@FunctionalInterface
interface MyLambda
{
    //public void display(String str);
    public int add(int x,int y);
}

public class lamda2 {

    public static void main(String[] args) {
      
        /*MyLambda m=(s)->{System.out.println(s);};
        m.display("Hello World");*/
        
        /*MyLambda m=(a,b)->{return a+b;};
        System.out.println(m.add(20,30));*/
        
        MyLambda m=(a,b)->a+b;
        int r=m.add(20, 30);
        System.out.println(r);
    }
    
}
