/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.innerclasses;
package localinner;

class Outer
{
    int x=10;
    static int y=20;
    
    static class My
    {
        public void show()
        {
            System.out.println(y);
        }
    }
    
    
}

public class staticinnerclass
{
    public static void main(String[] args) 
    {
        Outer.My m=new Outer.My();
        m.show();

    }
    
}
