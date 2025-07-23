/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.pattern2;

/**
 *
 * @author User
 */
public class patter21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count=0;
           for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                count++;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
    
}
