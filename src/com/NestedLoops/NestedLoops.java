/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.NestedLoops;

/**
 *
 * @author User
 */
public class NestedLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i=1;i<=5;i++)
        {
            for(int j =1;j<=5;j++)
            {
                System.out.print("(" +i+","+j+")");
            }
            System.out.println("");
        }
    }
    
}
