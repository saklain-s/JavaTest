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
public class Website2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your URL");
        String url = sc.nextLine();
        String ext = url.substring(url.lastIndexOf(".")+1);
        switch(ext)
        {
            case "com":
                System.out.println("Commercial");
                break;
            case "org":
                System.out.println("Organisation");
                break;
            case "gov":
                System.out.println("Government");
                break;
            case "in":
                System.out.println("Indian Website");
                break;
            default :
                System.out.println("Ivalid URl :(");
                break;
        }
        
    }
    
}
