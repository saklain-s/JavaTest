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
public class palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev=0,r;
        int temp = num;
        while(num>0)
        {
            r = num % 10;
            rev = rev*10+r;
            num/=10;
            
        }
        if(temp==rev){
        System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
        
    }
    
}
