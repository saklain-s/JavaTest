
package com.OOPS;
import java.util.Scanner;
class cylinderA{
     public double radius;
    public double height;
    double lidArea()
    {
        return Math.PI * radius * radius;
        
    }
    double totalArea()
    {
        return 2*lidArea()+circumference()*height;
    }
    double circumference()
    {
        return 2*Math.PI*radius;
    }

}

public class cylinder {
   
    public static void main(String[] args) {
        // TODO code application logic here
        cylinderA obj = new cylinderA();
        Scanner sc = new Scanner (System.in);
        obj.height = sc.nextDouble();
        obj.radius = sc.nextDouble();
        System.out.println("Area is: "+obj.lidArea());
        System.out.println("Circumference is: "+obj.circumference());
        System.out.println("Total area is: "+obj.totalArea());
        
    }
    
}
