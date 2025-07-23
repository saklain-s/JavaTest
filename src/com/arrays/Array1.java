/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.arrays;
import java.util.*;
/**
 *
 * @author User
 */
public class Array1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][2];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
