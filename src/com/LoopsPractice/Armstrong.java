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
public class Armstrong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=n;
        int r,sum=0;
        while(n>0){
            r = n % 10;
            n/=10;
            sum = sum + r*r*r;
        }
        if(sum==m)
        {
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
    
}
