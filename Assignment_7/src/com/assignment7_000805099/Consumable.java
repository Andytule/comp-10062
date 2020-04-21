package com.assignment7_000805099;

/**
 * Implementation of Consumable interface.
 * @author Andy Le
 */
public interface Consumable {
    /**
     * Abstract method to return calorie count
     * @return
     */
    public abstract int getCalorieCount();

    /**
     * Abstract method to return consumption method
     * @return
     */
    public abstract String getConsumptionMethod();
}
