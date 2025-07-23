/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.date_and_time;
import java.util.*;
import java.time.temporal.*;
import java.time.*;
import java.time.format.*;

/**
 *
 * @author User
 */
public class datetimeformatter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yy");
        System.out.println(df.format(dt));
        ZonedDateTime zdt = ZonedDateTime.now();
        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd/MM/yy hh:mm:ss z Z");
        System.out.println(df1.format(zdt));
        System.out.println(dt.get(ChronoField.DAY_OF_MONTH));
        
    }
    
}
