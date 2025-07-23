package com.collections;

import java.util.*;
/**
 *
 * @author User
 */
class linkedlistexample{  // Renamed class to avoid conflict

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a LinkedList object using java.util.LinkedList
        LinkedList<Integer> li = new LinkedList<>();

        // Add elements to the linked list
        li.add(10);
        li.add(20);
        li.add(30);

        // Print elements in the linked list
        li.forEach((n) -> System.out.println(n));
    }
}

