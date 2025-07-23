/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MyFirst;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class NewClass {
    



public class MyFirst {

    
    public static void main(String[] args) 
    {
        int a,b,c;
        float s;
        double area;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 3 sides of a Triangle ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        s = (float)(a + b + c) / 2f;
        
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area is " + area );
    }
    
}

    
}
