///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
// */
//package com.IOstream;
//
//
//import java.io.*;
//
//class Student
//{
//    int rollno;
//    String name;
//    String dept;
//}
//
//public class prin
//{
//    public static void main(String[] args) throws Exception
//    {
//
//        FileOutputStream fos=new FileOutputStream("printstream.txt");
//        PrintStream ps=new PrintStream(fos);
//
//
//        Student s=new Student();
//        s.rollno=10;
//        s.name="John";
//        s.dept="CSE";
//
//        ps.println(s.rollno);
//        ps.println(s.name);
//        ps.println(s.dept);
//
//        ps.close();
//        fos.close();
//
//        FileInputStream fis = new FileInputStream("printstream.txt");
//        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
//
//        s.rollno = Integer.parseInt(br.readLine());
//        s.name = br.readLine();
//        s.dept = br.readLine();
//        System.err.println(s.rollno);
//        System.err.println(s.dept);
//        System.err.println(s.name);
//
//
//
//    }
//}
