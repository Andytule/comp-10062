package com.assignment6_000805099;

/**
 * Implementation of Fighter Class
 * @author Andy Le
 */
public class Fighter extends Human {

    /**
     * No argument constructor
     */
    public Fighter() {
        System.out.println("Fighter no-arg constructor");
    }

    /**
     * Fighter Constructor with only name
     * @param name
     */
    public Fighter(String name) {
        super.setName(name);
        super.setStrength(0);
        super.setDexterity(0);
        super.setArmor(0);
        super.setMoxie(0);
        super.setCoins(0);
        super.setHealth(0.0);
    }

    /**
     * Fighter Constructor
     * @param name
     * @param strength
     * @param dexterity
     * @param armor
     * @param moxie
     * @param coins
     * @param health
     * @param enemy
     */
    public Fighter(String name, int strength, int dexterity, int armor, int moxie, int coins, int health, Elf enemy) {
        super.setName(name);
        super.setStrength(strength);
        super.setDexterity(dexterity);
        super.setArmor(armor);
        super.setMoxie(moxie);
        super.setCoins(coins);
        super.setHealth(health);
        super.setEnemy(enemy);
    }

    /**
     * Method to String Output
     * @return
     */
    public String toString() {
        return super.toString();
    }
}
