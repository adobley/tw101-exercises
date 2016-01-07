package com.thoughtworks.tw101.exercises.exercise7;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by adobley on 12/27/15.
 */
public class RandomNumber {

    private final int SECRET_NUMBER;
    private boolean gameWon = false;
    private int maximum;
    private int minimum;

    public RandomNumber(int minimum, int maximum) {
        this.maximum = maximum;
        this.minimum = minimum;
        Random random = new Random();
        SECRET_NUMBER = random.nextInt(maximum - minimum + 1) + minimum;
    }

    public void playGuessingGame() {
        while (!gameWon) {
            int guess = getGuess();
            if (isGuessValid(guess)) {
                checkGuess(guess);
            }
        }
    }

    public int getGuess() {
        System.out.printf("Guess a number between %d and %d:%n", minimum, maximum);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return Integer.parseInt(input);
    }

    public boolean isGuessValid(int guess) {
        if (guess <= maximum && guess >= minimum) {
            return true;
        }
        System.out.printf("Guess not between %d and %d.%n", minimum, maximum);
        return false;
    }



    private void checkGuess(int guess) {
        switch (Integer.compare(SECRET_NUMBER, guess)) {
            case 1:
                lowGuess(guess);
                break;
            case 0:
                winGame();
                break;
            case -1:
                highGuess(guess);
                break;
        }
    }

    private void highGuess(int guess) {
        System.out.println("Your guess is higher than the secret number.");
        maximum = guess - 1;
    }

    private void winGame() {
        System.out.println("Correct! You win!");
        gameWon = true;
    }

    private void lowGuess(int guess) {
        System.out.println("Your guess is lower than the secret number.");
        minimum = guess + 1;
    }
}
