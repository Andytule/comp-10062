package com.assignment7_000805099;

/**
 * Implementation of Commodity Interface
 * @author Andy Le
 */
public interface Commodity {
    /**
     * Abstract method headers for production cost
     * @return
     */
    public abstract double getProductionCost();

    /**
     * Abstract method headers for retail price
     * @return
     */
    public abstract double getRetailPrice();
}
