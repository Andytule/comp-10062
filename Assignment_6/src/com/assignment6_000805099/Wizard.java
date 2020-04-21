package com.assignment6_000805099;

/**
 * Implementation of Wizard class
 * @author Andy Le
 */
public class Wizard extends Human {
    /** Magic **/
    private int magic;

    /**
     * No Argument constructor
     */
    public Wizard() {
        System.out.println("Fighter no-arg constructor");
    }

    /**
     * Wizard constructor with only name
     * @param name
     */
    public Wizard(String name) {
        super.setName(name);
        super.setStrength(0);
        super.setDexterity(0);
        super.setArmor(0);
        super.setMoxie(0);
        super.setCoins(0);
        super.setHealth(0.0);
        this.magic = 0;
    }

    /**
     * Wizard constructor
     * @param name
     * @param strength
     * @param dexterity
     * @param armor
     * @param moxie
     * @param coins
     * @param health
     * @param enemy
     * @param magic
     */
    public Wizard(String name, int strength, int dexterity, int armor, int moxie, int coins, int health, Elf enemy,
                  int magic) {
        super.setName(name);
        super.setStrength(strength);
        super.setDexterity(dexterity);
        super.setArmor(armor);
        super.setMoxie(moxie);
        super.setCoins(coins);
        super.setHealth(health);
        super.setEnemy(enemy);
        this.magic = magic;
    }

    /**
     * Method to get Magic
     * @return
     */
    public int getMagic() {
        return magic;
    }

    /**
     * Method to set Magic
     * @param magic
     */
    public void setMagic(int magic) {
        this.magic = magic;
    }

    /**
     * Method to output Heal power
     * @return
     */
    public double heal() {
        if (this.magic <= 0) {
            System.out.println("Not enough magic to heal");
            return 0.0;
        } else if (super.getHealth() <= 0) {
            System.out.println("Dead Wizards cannot heal");
            return 0.0;
        } else {
            double healing = this.magic / 2;
            setMagic(this.magic - 3);
            return healing;
        }
    }

    /**
     * Method for String output
     * @return
     */
    public String toString() {
        return super.toString();
    }
}
