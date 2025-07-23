/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.NestedLoops;

/**
 *
 * @author User
 */
public class patter13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count=0;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                count++;
                System.out.format("%02d ",count);
            }
            System.out.println();
        }
    }
    
}
