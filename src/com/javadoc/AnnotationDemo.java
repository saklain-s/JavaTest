/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.javadoc;

class A
{
    public void display()
    {
        
    }
}

class B extends A
{
    @Override
    public void display()
    {
        
    }
    @Deprecated
    public void show()
    {
        
    }
    
}

public class AnnotationDemo 
{
    
    public static void main(String[] args) 
    {
        int i;
        @SuppressWarnings("deprecation")

        B b=new B();
  
        b.show();
    }
    
}