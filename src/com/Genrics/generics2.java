/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.Genrics;
class Data<T>
{
    private T obj;
    
    public void setData(T v)
    {
        obj = v;
    }
    public T getData()
    {
        return obj;
    }
}

public class generics2 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Data<Integer> d = new Data<>();
        d.setData(10);
        System.out.println(d.getData());
        /*
         Data<String> d = new Data<>();
        d.setData("Ho"f);
        System.out.println(d.getData());
        */
    }
    
}
