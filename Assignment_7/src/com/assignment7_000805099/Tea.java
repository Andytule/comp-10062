package com.assignment7_000805099;

import java.util.Scanner;

/**
 * Implementation of Tea class which extends Tims product abstract class and implements Consumable Interface
 * @author Andy Le
 */
public class Tea extends TimsProduct implements Consumable{
    /** Type **/
    private String type;
    /** Calorie Count **/
    private int calorieCount;

    /**
     * No argument constructor for Tea class
     */
    private Tea() {
        System.out.println("Tea no-arg constructor.");
    }

    /**
     * Tea class constructor
     * @param name
     * @param cost
     * @param price
     * @param type
     */
    private Tea(String name, double cost, double price, String type) {
        super.setName(name);
        super.setCost(cost);
        super.setPrice(price);
        this.setType(type);
    }

    /**
     * Create method for Tea class
     * @return
     */
    public static Tea create() {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the following pieces of information for Tea.");
        System.out.print("Name: ");
        String name = i.next();
        System.out.print("Enter the cost: ");
        double cost = i.nextDouble();
        System.out.print("Enter the price: ");
        double price = i.nextDouble();
        System.out.print("Enter the type of tea: ");
        String type = i.next();
        Tea temp = new Tea(name, cost, price, type);
        return temp;
    }

    /**
     * Method to get Type
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * Method to set Type
     * @param type
     */
    public void setType(String type) {
        this.type = type;
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
        return "Drink it";
    }

    /**
     * Method for String output
     * @return
     */
    public String toString() {
        return super.toString() + "\nType: " + getType() + "\nCalories: " + getCalorieCount();
    }
}
