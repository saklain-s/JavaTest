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
public class Loopspractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            
            System.out.println(n+" X "+i+" = "+n*i );
        }
        
    }
    
}
