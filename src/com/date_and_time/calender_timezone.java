/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.date_and_time;
import java.time.*;
import java.util.*;
import java.time.temporal.*;
/**
 *
 * @author User
 */
public class calender_timezone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2020));
        System.out.println(gc.get(Calendar.DATE));
        System.out.println(gc.get(Calendar.MONTH));
        System.out.println(gc.get(Calendar.DAY_OF_YEAR));
        System.out.println(gc.get(Calendar.HOUR_OF_DAY)+":"+(gc.get(Calendar.MINUTE)));
        
        
        TimeZone tz = gc.getTimeZone();
        System.out.println(tz);
        System.out.println(tz.getDisplayName());
        System.out.println(tz.getID());
        gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        TimeZone tz1 = gc.getTimeZone();

        System.out.println(tz1);
        System.out.println(tz1.getDisplayName());
        System.out.println(tz1.getID());
        
    }
    
}
