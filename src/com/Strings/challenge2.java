/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.Strings;
import java.util.*;
/**
 *
 * @author User
 */
public class challenge2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*System.out.println("Enter a binary number");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        String str = b + "";
        System.out.println(str.matches("[01]+"));*/
        /*
        
        
        
        System.out.println("Enter a hexa decimal number");
        Scanner sc = new Scanner(System.in);
        String str  = sc.next();
        
        System.out.println(str.matches("[0-9A-F]+"));
        
        
        */
        String str = "S##$A!*&K*L&A^I##N";
        System.out.println(str.replaceAll("[^a-bA-Z0-9]",""));
        
        String str1 = "      S A K L A I N      ";
        
        
        System.out.println(str1.replaceAll("\\s+"," ").trim());
        
        String str2 = "abc def ghi jkln";
        str2=str2.replaceAll("\\s", " ").trim();
        String words[]=str2.split("\\s");
        System.out.println(words.length);
        
    }
    
}
