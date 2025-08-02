/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.OOPS;
import java.util.*;
class details{
    int rno;
    String name,course;
    int m1,m2,m3;
    public int Total()
    {
        return m1+m2+m3;
    }
    public int average()
    {
        return Total()/3;
    }
    public char grade()
    {
        if(average() >= 60)
            return 'A';
        else
            return 'B';
    }
    public String detail()
    {
        return "Name: "+name+"\n"+"Roll No:"+rno+"\n"+"Course: "+course+"\n"+"Total is: "+Total()+"\nAverage is: "+ average()+"Grade is: "+grade();
    }
    
}
public class student {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        details obj = new details();
        System.out.println("Enter your name: ");
        obj.name = sc.next();
        System.out.println("Enter your ID no: ");
        obj.rno = sc.nextInt();
        System.out.println("Enter your Course: ");
        obj.course = sc.next();
        System.out.println("Enter your marks of three subjects: ");
        obj.m1 = sc.nextInt();
        obj.m2 = sc.nextInt();
        obj.m3 = sc.nextInt();
        
        System.out.println(obj.detail());
       
    }
    
}
