package com.Inheritance;


class Car
{
    public void start(){System.out.println("Car Started");}
    public void accelerate(){System.out.println("Car is Accelerated");}
    public void changeGear(){System.out.println("Car Gear Changed");}
    
}

class LuxaryCar extends Car
{
    
    @Override
    public void changeGear(){System.out.println("Automatic Gear");}
    public void openRoof(){System.out.println("Sun Roof is Opened");}
    
}

public class cars
{

    public static void main(String[] args) 
    {
        LuxaryCar c=new LuxaryCar();
        c.start();
        c.accelerate();
        c.changeGear();
        c.openRoof();
    }
    
}