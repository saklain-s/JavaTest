/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.javadoc;


//import java.lang.annotation.Annotation;

@interface MyAnno
{
    String name();
    String project() default "hello world";
    String date() default "today";
    String version() default "13";
            }

@MyAnno(name="Ajay")
public class userdefinedano
{
    //@MyAnno(name="Ajay")
    int data;
    
    //@MyAnno(name="Ajay")
    public static void main(String[] args) 
    {
        //@MyAnno(name="Ajay")
        int x;
    }
    
}