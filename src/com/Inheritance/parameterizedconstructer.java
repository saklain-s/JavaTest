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
    public parent(int x)
    {
        System.out.println("Parent param constructer"+x);
                
    }
    public parent()
    {
        System.out.println("Non-Parameterized constructer");
                
    }
}
class child extends parent{
    public child()
    {
        System.out.println("Non-Parameterized constructer");
                
    }
    public child(int y)
    {
        System.out.println("param of child"+y);
    }
    public child(int x,int y)
    {
        super(x);
        System.out.println("Two Parameterized constructer"+y);
                
    }
    
}
        public class parameterizedconstructer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        child c = new child(10,20);
    }
    
}
