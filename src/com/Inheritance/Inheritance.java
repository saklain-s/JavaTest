/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.Inheritance;

/**
 *
 * @author User
 */
 class parent{
     public parent()
     {
         System.out.println("Parent class");
     }
 }
class child extends parent{
    public child()
    {
        System.out.println("Child");
    }
}
class Grandchild extends child{
    public Grandchild()
    {
        System.out.println("GrandChild");
    }
}
  
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Grandchild p = new Grandchild();
    }
    
}
