package com.assignment6_000805099;

/**
 * Implementation of Humanoid Class
 * @author Andy Le
 */
public class Humanoid {
    /** Name **/
    private String name;
    /** Strength **/
    private int strength;
    /** Dexterity **/
    private int dexterity;
    /** Armor **/
    private int armor;
    /** Moxie **/
    private int moxie;
    /** Coins **/
    private int coins;
    /** Health **/
    private double health;

    /**
     * No arguments constructor for Humanoid
     */
    public Humanoid() {
        System.out.println("Humanoid no-arg constructor");
    }

    /**
     * Humanoid constructor with only name
     * @param name
     */
    public Humanoid(String name) {
        this.setName(name);
        this.setStrength(0);
        this.setDexterity(0);
        this.setArmor(0);
        this.setMoxie(0);
        this.setCoins(0);
        this.setHealth(0.0);
    }

    /**
     * Humanoid class constructor
     * @param name
     * @param strength
     * @param dexterity
     * @param armor
     * @param moxie
     * @param coins
     * @param health
     */
    public Humanoid(String name, int strength, int dexterity, int armor, int moxie, int coins, int health) {
        this.setName(name);
        this.setStrength(strength);
        this.setDexterity(dexterity);
        this.setArmor(armor);
        this.setMoxie(moxie);
        this.setCoins(coins);
        this.setHealth(health);
    }

    /**
     * Method to get Name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Method to set name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method to get Strength
     * @return
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Method to set Strength
     * @param strength
     */
    public void setStrength(int strength) {
        this.strength = strength;
    }

    /**
     * Method to increase Strength
     */
    public void upStrength() {
        this.strength += 1;
    }

    /**
     * Method to decrease Strength
     */
    public void downStrength() {
        this.strength -= 1;
    }

    /**
     * Method to get Dextertiy
     * @return
     */
    public int getDexterity() {
        return dexterity;
    }

    /**
     * Method to set Dexterity
     * @param dexterity
     */
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    /**
     * Method to increase dexterity
     */
    public void upDexterity() {
        this.dexterity += 1;
    }

    /**
     * Method to decrease dexterity
     */
    public void downDexterity() {
        this.dexterity -= 1;
    }

    /**
     * Method to get Armor
     * @return
     */
    public int getArmor() {
        return armor;
    }

    /**
     * Method to set Armor
     * @param armor
     */
    public void setArmor(int armor) {
        this.armor = armor;
    }

    /**
     * Method to increase Armor
     */
    public void upArmor() {
        this.armor += 1;
    }

    /**
     * Method to decrease Armor
     */
    public void downArmor() {
        this.armor -= 1;
    }

    /**
     * Method to get Moxie
     * @return
     */
    public int getMoxie() {
        return moxie;
    }

    /**
     * Method to set Moxie
     * @param moxie
     */
    public void setMoxie(int moxie) {
        this.moxie = moxie;
    }

    /**
     * Method to increase Moxie
     */
    public void upMoxie() {
        this.moxie += 1;
    }

    /**
     * Method to decrease Moxie
     */
    public void downMoxie() {
        this.moxie -= 1;
    }

    /**
     * Method to get Coins
     * @return
     */
    public int getCoins() {
        return coins;
    }

    /**
     * Method to set Coins
     * @param coins
     */
    public void setCoins(int coins) {
        this.coins = coins;
    }

    /**
     * Method to get Health
     * @return
     */
    public double getHealth() {
        return health;
    }

    /**
     * Method to set Health
     * @param health
     */
    public void setHealth(double health) {
        this.health = health;
    }

    /**
     * Method to attack a defender
     * @param defender
     */
    public void attack(Humanoid defender) {
        double damage = ((this.strength + this.dexterity + this.health) / 3);
        defender.defend(damage);
    }

    /**
     * Method in defending an attack
     * @param damage
     */
    public void defend(double damage) {
        if (this.armor > 1) {
            setHealth(this.health - (damage / this.armor));
        } else {
            setHealth(this.health - damage);
        }
    }

    /**
     * Method for String output
     * @return
     */
    public String toString() {
        return "Name: " + this.name + "\nStrength: " + this.strength + "\nDexterity: " + this.dexterity + "\nArmor: "
                + this.armor + "\nMoxie: " + this.moxie + "\nCoins: " + this.coins + "\nHealth: " + this.health;
    }
}
