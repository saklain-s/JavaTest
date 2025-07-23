/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.Methods;
import java.util.*;
/**
 *
 * @author User
 */
public class Methods {
    static boolean Prime(int n)
    {
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(Prime(n))
        System.out.println("Its a prime number");
        else
            System.out.println("Not a prime number");
        
    }
    
}
