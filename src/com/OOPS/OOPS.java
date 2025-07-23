/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.OOPS;

public class OOPS {
    public double length, breadth;

    double area()
    {
        return length * breadth;
    }
    double perimeter()
    {
        return 2 * (length + breadth);
    }
    boolean rec()
    {
        return length == breadth;
    }
            
            
    public static void main(String[] args) {
        // TODO code application logic here
        
        OOPS obj = new OOPS();
        obj.length = 16;
        obj.breadth = 16;
        System.out.println(obj.area());
        System.out.println(obj.perimeter());
        System.out.println(obj.rec());
        
    }
    
}
