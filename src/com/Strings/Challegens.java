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
public class Challegens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str = sc.next();
       
       int i = str.indexOf("@");
       String uname = str.substring(0,i);
       String domain = str.substring(i+1, str.length());
       
       System.out.println("Username :"+uname);
       System.out.println("Domain :"+domain);
       
       int j = domain.indexOf(".");
       String name = domain.substring(0,j);
       System.out.println(name.equals("gmail"));
    }
    
}
