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
public class Week {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if(num == 1)
        {
            System.out.println("Monday");
        }
        
        else if(num == 2)
        {
            System.out.println("Tuesday");
        }
        else if(num == 3)
        {
            System.out.println("Wednesday");
        }
        else if(num == 4)
        {
            System.out.println("Thrusday");
        }
        else if(num == 5)
        {
            System.out.println("Friday");
        }
        else if(num == 6)
        {
            System.out.println("Saturday");
        }
        else if(num == 7)
        {
            System.out.println("Sunday");
        }
        else
        {
            
        
            System.out.println("Invalid Number");
        
        }
    }
    
}
