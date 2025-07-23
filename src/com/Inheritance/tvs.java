package com.Inheritance;


class TV
{
    public void switchON(){ System.out.println("TV is Switched ON"); }
    
    public void changeChannel() { System.out.println("TV Channel is Changed "); }
    
}

class SmartTV extends TV
{
    
    
    
  
    public void changeChannel() { System.out.println("SmartTV Channel is Changed "); }
    
    public void browse(){ System.out.println("Smart Tv Browsing"); }
    
}

public class tvs 
{

    public static void main(String[] args) 
    {
        SmartTV t=new SmartTV();
        
        t.switchON();
        t.changeChannel();
        t.browse();
        
    }
    
}