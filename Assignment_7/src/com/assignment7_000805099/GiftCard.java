package com.assignment7_000805099;

import java.util.Scanner;

/**
 * Implementation of GiftCard class that extends the tims product abstract class
 * @author Andy Le
 */
public class GiftCard extends TimsProduct{
    /** Amount **/
    private double amount;

    /**
     * No argument constructor for GiftCard
     */
    private GiftCard() {
        System.out.println("GiftCard no-arg constructor.");
    }

    /**
     * GiftCard class constructor
     * @param name
     * @param cost
     * @param price
     * @param amount
     */
    private GiftCard(String name, double cost, double price, double amount) {
        super.setName(name);
        super.setCost(cost);
        super.setPrice(price);
        this.setAmount(amount);
    }

    /**
     * Create method for Giftcard class
     * @return
     */
    public static GiftCard create() {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the following pieces of information for a GiftCard.");
        System.out.print("Name: ");
        String name = i.next();
        System.out.print("Enter the price (the amount of money on the card): ");
        double price = i.nextDouble();
        GiftCard temp = new GiftCard(name, 0.0, price, price);
        return temp;
    }

    /**
     * Method to get Amount
     * @return
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Method to set Amount
     * @param amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Method for String output
     * @return
     */
    public String toString() {
        return super.toString() + "\n Amount: " + getAmount();
    }
}
