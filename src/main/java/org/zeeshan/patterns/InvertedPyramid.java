package org.zeeshan.patterns;

public class InvertedPyramid {
//    *********
//     *******
//      *****
//       ***
//        *

        public static void main(String[] args) {
            int rows = 5; // Number of rows

            // Outer loop for rows
            for (int i = rows; i >= 1; i--) {
                // Print leading spaces
                for (int j = i; j < rows; j++) {
                    System.out.print(" ");
                }

                // Print stars for each row
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("*");
                }

                System.out.println(); // Move to the next line
            }
        }

}
