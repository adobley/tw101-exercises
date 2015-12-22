package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by adobley on 12/22/15.
 */
public class Orc implements Monster {

    private String name;
    private int hitPoints;

    public Orc() {
        name = "Orc";
        hitPoints = 20;
    }

    public void takeDamage(int amount) {
        hitPoints -= amount;
    }

    public void reportStatus() {
        System.out.printf("%s: %d hit points remaining%n", name, hitPoints);
    }
}
