package com.arrays;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author User
 */
public class Array5
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int A[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        for(int x:A)
            System.out.print(x+",");
        System.out.println("");
        int temp = A[0];
        for(int i =1; i<A.length;i++){
            A[i-1]=A[i];

        }
        A[A.length-1]= temp;
        for (int x :A)
            System.out.println(x+",");
        System.out.println("");
    }

}
