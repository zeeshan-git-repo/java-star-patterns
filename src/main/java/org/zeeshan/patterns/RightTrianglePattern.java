package org.zeeshan.patterns;

public class RightTrianglePattern {


//        *
//        **
//        ***
//        ****
//        *****
//        ****
//        ***
//        **
//        *

    public static void main(String[] args) {
        int rows = 5;
        printTrianglePattern(rows);
    }

    public static void printTrianglePattern(int rows) {
        for (int a = 0; a < rows; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int a = 0; a < rows; a++) {
            for (int b = rows; b > a; b--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
