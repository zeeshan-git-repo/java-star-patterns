package org.zeeshan.patterns;

public class HollowSquare {
//        *****
//        *   *
//        *   *
//        *   *
//        *****
        public static void main(String[] args) {
            int size = 5; // Size of the square

            // Outer loop for rows
            for (int i = 1; i <= size; i++) {
                // Inner loop for columns
                for (int j = 1; j <= size; j++) {
                    // Print '*' for the boundary
                    if (i == 1 || i == size || j == 1 || j == size) {
                        System.out.print("*");
                    } else {
                        // Print space for hollow part
                        System.out.print(" ");
                    }
                }
                System.out.println(); // Move to the next line
            }
        }

}
