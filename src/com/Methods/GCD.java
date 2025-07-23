/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.Methods;

/**
 *
 * @author User
 */
public class GCD {
    int GCD(int m, int n)
    {
      while(m!=n)
      {
          if(m>n)m=m-n;
          else n=n-m;
      }
      return m;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GCD GCD = new GCD();
        System.out.print(GCD.GCD(35, 56));
    }
    
}
