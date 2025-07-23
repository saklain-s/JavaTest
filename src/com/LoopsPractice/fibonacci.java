/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.LoopsPractice;
import java.util.*;
/**
 *
 * @author User
 */
public class fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0,b=1,c;
        System.out.print(a+","+b+",");
        for(int i =0;i<=n;i++)
        {
            c = a + b ;
            System.out.print(c+",");
            a= b;
            b=c;
            
            
        }
    }
    
}
