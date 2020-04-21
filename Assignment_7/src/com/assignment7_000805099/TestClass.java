package com.assignment7_000805099;

/**
 * Implementation on Tims Hortons class
 * @author Andy Le
 */
public class TestClass {
    public static void main(String[] args) {
        TimsOrder t = TimsOrder.create();
        System.out.println(t + "\n");
        System.out.printf("Total Price: $%.2f\n", t.getAmountDue());
    }
}
