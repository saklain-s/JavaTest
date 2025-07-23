package com.collections;

import java.util.HashMap;

public class LinkedHashMap {

    public static void main(String[] args)
    {
        // Create a HashMap and LinkedHashMap object
        HashMap<Integer, String> hm = new HashMap<>();
        java.util.LinkedHashMap<Integer, String> lhm = new java.util.LinkedHashMap<>();

        // Adding elements to HashMap
        hm.put(5, "E");
        hm.put(1, "A");
        hm.put(4, "D");
        hm.put(2, "B");
        hm.put(3, "C");
        hm.put(6, "A");

        // Adding elements to LinkedHashMap
        lhm.put(5, "E");
        lhm.put(1, "A");
        lhm.put(4, "D");
        lhm.put(2, "B");
        lhm.put(3, "C");
        lhm.put(6, "A");

        // Printing the HashMap and LinkedHashMap
        System.out.println("HashMap: " + hm);
        String s = lhm.get(5);  // Retrieve the value for key 5
        lhm.put(4, "K");        // Update the value for key 4
        lhm.get(1);             // Retrieve the value for key 1
        System.out.println("LinkedHashMap: " + lhm);
    }
}
