package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }


    private static void drawTriangleLine(int height, int lineNumber) {
        int offset;
        int charCount;

        if (lineNumber < height) {
            offset = height - lineNumber - 1;
            charCount = (2 * lineNumber) + 1;
        } else {
            offset = lineNumber - height;
            charCount = (2 * (height - (lineNumber - height + 1))) + 1;
        }

        while (offset > 0) {
            System.out.print(" ");
            offset--;
        }
        while (charCount > 0) {
            System.out.print("*");
            charCount--;
        }
        System.out.println();
    }
//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        drawTriangleTop(n);
        drawTriangleLine(n,n);
    }

    private static void drawTriangleTop(int n) {
        for (int lineNumber = 0; lineNumber < n - 1; lineNumber++) {
            drawTriangleLine(n, lineNumber);
        }
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        drawAnIsoscelesTriangle(n);
        drawDiamondBottom(n);
    }

    private static void drawDiamondBottom(int n) {
        for (int lineNumber = n + 1; lineNumber < n * 2; lineNumber++) {
            drawTriangleLine(n, lineNumber);
        }
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        drawTriangleTop(n);
        System.out.println("Aidan");
        drawDiamondBottom(n);
    }
}
