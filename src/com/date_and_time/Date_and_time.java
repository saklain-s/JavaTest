/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.date_and_time;
import java.util.*;
/**
 *
 * @author User
 */
public class Date_and_time {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
        
        Date d = new Date();
        System.err.println(d);
    }
    
}
