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
public class Gpseries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a, d and n:");
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        int term = a;
        for(int i=0; i< n; i++)
        {
            System.out.print(term+",");
            term=term*d;
        }
        
        
    }
    
}
