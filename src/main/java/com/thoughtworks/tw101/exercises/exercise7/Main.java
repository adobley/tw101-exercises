package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;
// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.

public class Main {

    public static void main(String[] args) {
        boolean done = false;
        int maximum = 100;
        int minimum = 1;
        String input;
        int guess;

        RandomNumber randomNumber = new RandomNumber(minimum, maximum);
        Scanner scanner = new Scanner(System.in);

        while (done != true) {
            // Prompt for input, max/min
            System.out.printf("Guess a number between %d and %d:%n", minimum, maximum);
            input = scanner.nextLine();
            guess = Integer.parseInt(input);
            if (guess > maximum || guess < minimum) {
                System.out.printf("Guess not between %d and %d.%n", minimum, maximum);
                continue;
            }
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
    }
}
