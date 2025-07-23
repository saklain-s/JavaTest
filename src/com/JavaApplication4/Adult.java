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
public class Adult {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >=14 && age<=55)
        {
            System.out.println("Young");
        }
        else{
            System.out.println("Not young");
        }
    }
    
}
