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
public class displaydigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        while(num >0)
        {
            int rem = num % 10;
            num = num/10;
            System.out.println(rem);
            
            
        }
    }
    
}
