package com.assignment7_000805099;

import java.util.Scanner;

/**
 * Implementation of Donut class which extends Tims product abstract class and implements consumable interface
 * @author Andy Le
 */
public class Donut extends TimsProduct implements Consumable {
    /** Description **/
    private String description;
    /** Calorie Count **/
    private int calorieCount;

    /**
     * No argument constructor for Donut class
     */
    private Donut() {
        System.out.println("Donut no-arg constructor.");
    }

    /**
     * Constructor for Donut class
     * @param name
     * @param cost
     * @param price
     * @param description
     * @param calories
     */
    private Donut (String name, double cost, double price, String description, int calories) {
        super.setName(name);
        super.setCost(cost);
        super.setPrice(price);
        this.setDescription(description);
        this.setCalorieCount(calories);
    }

    /**
     * Create method for Donut class
     * @return
     */
    public static Donut create() {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the following pieces of information for a Donut.");
        System.out.print("Name: ");
        String name = i.next();
        System.out.print("Enter the cost: ");
        double cost = i.nextDouble();
        System.out.print("Enter the price: ");
        double price = i.nextDouble();
        System.out.print("Enter the description: ");
        String description = i.next();
        System.out.print("Enter the amount of calories: ");
        int calories = i.nextInt();
        Donut temp = new Donut(name, cost, price, description, calories);
        return temp;
    }

    /**
     * Method to get description
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * Method to set description
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Method to get Calorie Count
     * @return
     */
    public int getCalorieCount() {
        return this.calorieCount;
    }

    /**
     * Method to set Calorie Count
     * @param calorieCount
     */
    public void setCalorieCount(int calorieCount) {
        this.calorieCount = calorieCount;
    }

    /**
     * Method to get Consumption Method
     * @return
     */
    public String getConsumptionMethod() {
        return "Eat it";
    }

    /**
     * Method for String output
     * @return
     */
    public String toString() {
        return super.toString() + "\nDescription: " + getDescription() + "\nCalories: " + getCalorieCount();
    }
}
