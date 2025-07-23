/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.Lamda;


@FunctionalInterface
interface MyLambda
{
    public void display();
}

/*class My implements MyLambda
{
    public void display()
    {
        System.out.println("Hello World");
    }
}*/
public class Lamda4 {

    public static void main(String[] args) {
        
        MyLambda m=()->{System.out.println("Hello world");};
        
        /*//MyLambda m=new My();
        MyLambda m=//new MyLambda()
                ()->
        
            //public void display()
            {
                System.out.println("Hello World");
        
        };*/
        m.display();
        
    }
    
}