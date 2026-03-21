package org.zeeshan.patterns;

public class DiamondStarPattern {
//               *
//              ***
//             *****
//            *******
//            *********
//            *******
//             *****
//             ***
//              *
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the upper half of the diamond

        // Upper half of the diamond
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }

        // Lower half of the diamond
        for (int i = rows - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }
}
