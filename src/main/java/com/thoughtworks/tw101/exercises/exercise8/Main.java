package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;
import java.util.Scanner;
// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

public class Main {

    public static void main(String[] args) {
        boolean done = false;
        int maximum = 100;
        int minimum = 1;
        String input;
        int guess;
        ArrayList<Integer> guesses = new ArrayList<Integer>();

        RandomNumber randomNumber = new RandomNumber(minimum, maximum);
        Scanner scanner = new Scanner(System.in);

        while (done != true) {
            System.out.printf("Guess a number between %d and %d:%n", minimum, maximum);
            input = scanner.nextLine();

            try {
                guess = Integer.parseInt(input);
            } catch (NumberFormatException exception) {
                System.out.println("Not a number! Please enter a number.");
                continue;
            }

            if (guess > maximum || guess < minimum) {
                System.out.printf("Guess not between %d and %d.%n", minimum, maximum);
                continue;
            }

            // After checks for guess validity to ignore invalid guesses
            guesses.add(guess);

            switch (randomNumber.isSecretNumber(guess)) {
                case -1:
                    System.out.println("Your guess is lower than the secret number.");
                    minimum = guess + 1;
                    break;
                case 0:
                    System.out.println("Correct! You win!");
                    done = true;
                    break;
                case 1:
                    System.out.println("Your guess is higher than the secret number.");
                    maximum = guess - 1;
                    break;
            }
        }

        System.out.print("Your guesses: ");
        for (int item:guesses) {
            System.out.printf("%d ", item);
        }
    }
}
