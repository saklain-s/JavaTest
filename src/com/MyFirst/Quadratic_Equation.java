
package com.MyFirst;
import java.util.*;
public class Quadratic_Equation
{
    public static void main(String args[])
    {
        double disc,r1,r2;
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        disc = b * b -4 * a * c;
        r1 = (-b+Math.sqrt(disc))/(2 * a);
        r2 = (-b-Math.sqrt(disc))/(2 * a);
        
        
        
        System.out.println("Root are " +r1+"  " +r2);
    }
}
