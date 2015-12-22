package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by adobley on 12/22/15.
 */
public class Troll implements Monster {

    private String name;
    private int hitPoints;

    public Troll() {
        name = "Troll";
        hitPoints = 40;
    }

    public void takeDamage(int amount) {
        hitPoints -= (amount / 2);
    }

    public void reportStatus() {
        System.out.printf("%s: %d hit points remaining%n", name, hitPoints);
    }
}
