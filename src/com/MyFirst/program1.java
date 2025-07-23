package com.MyFirst;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class program1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();  
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(i<k){
                if(Character.isUpperCase(ch))
                {
                    result.append(Character.toLowerCase(ch));
                }
                else{
                    result.append(Character.toUpperCase(ch));
                }                  
            }
            else{
                        result.append(ch);
                        }
        }
        System.out.println(result.toString());  
    }
}
