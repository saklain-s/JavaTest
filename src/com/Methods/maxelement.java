/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.Methods;

/**
 *
 * @author User
 */
public class maxelement {
    int max(int A[])
    {
        int temp=0;
        for(int i=0;i<A.length;i++)
            
        {
            if(A[i]>temp)
                temp=A[i];
        }
        return temp;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A[]={8,3,15,9};
        maxelement obj = new maxelement();
        
        System.out.print(obj.max(A));
    }
    
}
