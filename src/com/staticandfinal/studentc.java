/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.staticandfinal;

import java.util.Date;

class Student
{
    private String rollNo;
    
    private static int count=1;
    
    private String assignRollNo()
    {
        Date d=new Date();
        
        String rno="Univ-"+(d.getYear()+1900)+"-"+count;
        count++;
        return rno;
    }
    Student()
    {
        rollNo=assignRollNo();
    }
    public String getRollNo()
    {
        return rollNo;
    }
    
}

public class studentc 
{
    public static void main(String[] args) 
    {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        
        System.out.println(s1.getRollNo());
        System.out.println(s2.getRollNo());
        System.out.println(s3.getRollNo());
        
    }   
}