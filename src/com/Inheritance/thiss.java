/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.Inheritance;

/**
 *
 * @author User
 */
class Rectangle{
    int length, breadth;
    Rectangle(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    void display()
    {
        System.out.println("Lenght is:"+this.length);
        System.out.println("Breadth is:"+this.breadth);
    }
}
public class thiss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle r1 = new Rectangle(10,20);
        r1.display();
        
        
    }
    
}
