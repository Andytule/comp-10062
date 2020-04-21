package com.assignment6_000805099;

/**
 * Implementation of Hobbit Class
 * @author Andy Le
 */
public class Hobbit extends Humanoid{

    /**
     * No arugument constructor
     */
    public Hobbit() {
        System.out.println("Hobbit no-arg constructor");
    }

    /**
     * Hobbit constructor for only the name
     * @param name
     */
    public Hobbit(String name) {
        super.setName(name);
        super.setStrength(0);
        super.setDexterity(0);
        super.setArmor(0);
        super.setMoxie(0);
        super.setCoins(0);
        super.setHealth(0.0);
    }

    /**
     * Hobbit constructor
     * @param name
     * @param strength
     * @param dexterity
     * @param armor
     * @param moxie
     * @param coins
     * @param health
     */
    public Hobbit(String name, int strength, int dexterity, int armor, int moxie, int coins, int health) {
        super.setName(name);
        super.setStrength(strength);
        super.setDexterity(dexterity);
        super.setArmor(armor);
        super.setMoxie(moxie);
        super.setCoins(coins);
        super.setHealth(health);
    }

    /**
     * Method to steal
     * @return
     */
    public double steal() {
        if (super.getHealth() <= 0) {
            return 0.0;
        }
        return getDexterity() / 2;
    }

    /**
     * Method for String output
     * @return
     */
    public String toString() {
        return super.toString();
    }
}
