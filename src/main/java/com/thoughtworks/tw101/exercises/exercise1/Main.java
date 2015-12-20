package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {
    public static void main(String[] args) {
        int startValue = 1;
        int maximumValue = 100;

        for (int i = startValue; i <= maximumValue; i++ ) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
