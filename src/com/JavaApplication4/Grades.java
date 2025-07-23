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
public class Grades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter your score of three sublects");
        Scanner sc = new Scanner(System.in);
        int x,y,z;
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        
        float Avg = (float) (x + y + z) / 3;
        
        if (Avg >=70){
            System.out.println("A Grade");
        }
        else if(Avg >=60 && Avg <70)
        {
            System.out.println("B Grade");
        }
         else if(Avg >=50& Avg <60)
        {
            System.out.println("C Grade");
        }
         else if(Avg >=40 && Avg <40)
        {
            System.out.println("D Grade");
        }
         else{
             System.out.println("E");
         }
    }
    
}
