package com.assignment6_000805099;

/**
 * Implementation of Human class
 * @author Andy Le
 */
public class Human extends Humanoid{
    /** Enemy **/
    private Elf enemy;

    /**
     * No argument constructor
     */
    public Human() {
        System.out.println("Human no-arg constructor");
    }

    /**
     * Human constructor with only name
     * @param name
     */
    public Human(String name) {
        super.setName(name);
        super.setStrength(0);
        super.setDexterity(0);
        super.setArmor(0);
        super.setMoxie(0);
        super.setCoins(0);
        super.setHealth(0.0);
    }

    /**
     * Human Constructor
     * @param name
     * @param strength
     * @param dexterity
     * @param armor
     * @param moxie
     * @param coins
     * @param health
     * @param enemy
     */
    public Human(String name, int strength, int dexterity, int armor, int moxie, int coins, int health, Elf enemy) {
        super.setName(name);
        super.setStrength(strength);
        super.setDexterity(dexterity);
        super.setArmor(armor);
        super.setMoxie(moxie);
        super.setCoins(coins);
        super.setHealth(health);
        this.enemy = enemy;
    }

    /**
     * Method to get enemy
     * @return
     */
    public Elf getEnemy() {
        return this.enemy;
    }

    /**
     * Method to set Enemy
     * @param enemy
     */
    public void setEnemy(Elf enemy) {
        this.enemy = enemy;
    }

    /**
     * Method for String output
     * @return
     */
    public String toString() {
        return super.toString() + "\nEnemy: " + this.enemy.getName();
    }
}
