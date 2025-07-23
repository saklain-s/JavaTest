package com.practice;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        int arr[] = new int[z];
        for(int i = 1; i < z; i++){
            arr[i]  = sc.nextInt();
        }
        for(int x: arr){
            System.out.println(x);
        }
        System.out.println(arr.length);

    }
}
