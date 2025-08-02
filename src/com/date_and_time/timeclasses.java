/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.date_and_time;
import java.time.*;
/**
 *
 * @author User
 */
public class timeclasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(zdt);
        Period p = Period.of(2, 5, 4);
        System.out.println(p.addTo(LocalDateTime.now()));
        Instant i = Instant.now();
        System.out.println(i);
        
    }
    
}
