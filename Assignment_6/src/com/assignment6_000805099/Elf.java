package com.assignment6_000805099;

/**
 * Implementation of the Elf class
 * @author Andy Le
 */
public class Elf extends Humanoid {
    /** Clan **/
    private String clan;
    /** Hobbit **/
    private Hobbit bf;

    /**
     * No argument constructor for Elf class
     */
    public Elf() {
        System.out.println("Elf no-arg constructor");
    }

    /**
     * Elf constructor with only name
     * @param name
     */
    public Elf(String name) {
        super.setName(name);
        super.setStrength(0);
        super.setDexterity(0);
        super.setArmor(0);
        super.setMoxie(0);
        super.setCoins(0);
        super.setHealth(0.0);
        this.clan = "n/a";
    }

    /**
     * Elf constructor
     * @param name
     * @param strength
     * @param dexterity
     * @param armor
     * @param moxie
     * @param coins
     * @param health
     * @param clan
     * @param bf
     */
    public Elf(String name, int strength, int dexterity, int armor, int moxie, int coins, int health, String clan,
               Hobbit bf) {
        super.setName(name);
        super.setStrength(strength);
        super.setDexterity(dexterity);
        super.setArmor(armor);
        super.setMoxie(moxie);
        super.setCoins(coins);
        super.setHealth(health);
        this.clan = clan;
        this.bf = bf;
    }

    /**
     * Method to get Clan
     * @return
     */
    public String getClan() {
        return clan;
    }

    /**
     * Method to get Best Friend
     * @return
     */
    public Hobbit getBF() {
        return bf;
    }

    /**
     * Method to set Best Friend
     * @param bf
     */
    public void setBF(Hobbit bf) {
        this.bf = bf;
    }

    /**
     * Method for String Output
     * @return
     */
    public String toString() {
        return super.toString() + "\nClan: " + getClan() + "\nBest Friend: " + getBF().getName();
    }
}
