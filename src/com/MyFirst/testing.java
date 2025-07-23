/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.MyFirst;
import java.util.*;
/**
 *
 * @author User
 */
public class testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[] = {3,2,4,1,5};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
     static void cyclic(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else i++;
        }
        
    }
    static void swap(int[] arr, int fir, int sec){
        int temp = arr[fir];
        arr[fir] = arr[sec];
        arr[sec]= temp;
    }
    
}
