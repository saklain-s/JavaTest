/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.JavaApplication32;
import java.util.*;
/**
 *
 * @author User
 */
public class Website {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter your website URL");
        Scanner sc = new Scanner(System.in);
        String url = sc.nextLine();
        String protocol = url.substring(0, url.indexOf(":"));
        if(protocol.equals("http")){
            System.out.println("Hyper Text Tranfer Protocol");
        }
        else if(protocol.equals("ftp")){
            System.out.println("File Transfer Protocol");
        }
        String ext = url.substring(url.lastIndexOf(".")+1);
        if(ext.equals("com"))
        {
            System.out.println("Commercial");
        }
        else if(ext.matches("org"))
        {
            System.out.println("Organisation");
        }
        else if(ext.matches("in"))
        {
            System.out.println("Indian");
        }
        else if(ext.matches("net"))
        {
            System.out.println("Network");
        }
    }
    
}
