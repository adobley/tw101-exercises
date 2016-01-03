package com.thoughtworks.tw101.exercises.exercise8;
import java.util.Random;

/**
 * Created by adobley on 12/27/15.
 */
public class RandomNumber {

    private final int SECRET_NUMBER;

    public RandomNumber(int minimum, int maximum) {
        Random random = new Random();
        SECRET_NUMBER = random.nextInt(maximum - minimum + 1) + minimum;
    }

    // Returns -1 if guess is less than secret number
    // Returns 0 if number is equal to secret number
    // Returns 1 if number is greater than secret number
    public int isSecretNumber(int guess) {
        if (guess < SECRET_NUMBER) {
            return -1;
        } else if (guess == SECRET_NUMBER) {
            return 0;
        } else {
            return 1;
        }
    }
}
