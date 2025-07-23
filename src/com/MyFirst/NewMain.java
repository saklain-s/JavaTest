/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.MyFirst;

 

public class NewMain {
    public static void main(String[] args) {
        // TODO code application logic here
    int arr[] = {0,0,1,1,1,2,2,3,3,4};
    System.out.println(removeDuplicates(arr));
    }
    public static  int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}