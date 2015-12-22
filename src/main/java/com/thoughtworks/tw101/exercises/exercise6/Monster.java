package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by adobley on 12/22/15.
 */
// virtual superclass would have been preferable so some code could be reused
public interface Monster {

    void takeDamage(int amount);
    void reportStatus();
}
