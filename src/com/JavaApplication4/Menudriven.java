/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.JavaApplication4;
import java.util.*;
/**
 *
 * @author User
 */
public class Menudriven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\\
        System.out.println("OPTIONS\nADD\nSUB\nMUL\nDIV");
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter any two numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.nextLine();
        System.out.println("Select the option in words");
        String option = sc.nextLine();
        switch (option)
        {
            case "ADD":
                int ADD = x + y;
                System.out.println("Sum is "+ADD);
                break;
                
            case "SUB":
                int SUB = x - y;
                System.out.println("Sum is "+SUB);
                break;
            case "MUL":
                int MUL = x * y;
                System.out.println("Sum is "+MUL);
                break;
            case "DIV":
                int DIV = x + y;
                System.out.println("Sum is "+DIV);
                break;
            
        }
        
        
    }
    
}
