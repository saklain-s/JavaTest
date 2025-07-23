/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.date_and_time;
import java.util.*;
import java.time.*;
import java.time.temporal.*;
/**
 *
 * @author User
 */
public class joda_time_api {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date dt = new Date();
        
        System.out.println(dt);
        dt.setHours(01);
        System.out.println(dt);
        
        LocalDate dt1 = LocalDate.now();
        System.out.println(dt1);
        LocalDate dt2 = LocalDate.now(Clock.systemDefaultZone());
        System.out.println(dt2);
        LocalDate dt3 = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(dt3);
        LocalDate dt4  = LocalDate.of(2020, Month.MARCH, 30);
        System.out.println(dt4);
        LocalDate dt5 = LocalDate.ofEpochDay(365);
        System.out.println(dt5);
        LocalDate dt6 = LocalDate.parse("2020-01-30");
        System.out.println(dt6);
        dt6.plusMonths(6);
        System.out.println(dt6);
        LocalDate dt7 = dt6.plusMonths(5);
        System.out.println(dt7);
        
        
        LocalTime ltt = LocalTime.now();
        System.out.println(ltt);
        LocalTime ltt1 = ltt.minusHours(2);
        System.out.println(ltt1);
        
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        
    }
    
}
