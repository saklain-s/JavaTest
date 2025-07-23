package com.MyFirst;

import java.util.Scanner;

public class cuboid {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the length of the cuboid:");
            double length = scanner.nextDouble();
            
            System.out.println("Enter the width of the cuboid:");
            double width = scanner.nextDouble();
            
            System.out.println("Enter the height of the cuboid:");
            double height = scanner.nextDouble();
            
            // Calculate total surface area
            double totalArea = 2 * (length * width + width * height + height * length);
            
            // Calculate volume
            double volume = length * width * height;
            
            System.out.println("Total Surface Area of the Cuboid: " + totalArea);
            System.out.println("Volume of the Cuboid: " + volume);
        }
    }
}
