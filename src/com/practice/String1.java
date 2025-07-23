package com.practice;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.endsWith("n"));
        System.out.println(str.charAt(3));
        System.out.println(str.contains("a"));
        //System.out.println(Arrays.toString().str.getBytes());
        System.out.println(str.substring(2));

    }
}
