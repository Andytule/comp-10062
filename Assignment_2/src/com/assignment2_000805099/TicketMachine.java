package com.assignment2_000805099;

/**
 * Implementation of the class for the ticket machine and all of its methods
 * The ticket machine has 7 different methods as buttons allowing the user to customize their ticket
 * The machine also takes in coins to pay for the ticket
 * @author Andy Le
 */
public class TicketMachine {
    /** Route One Name **/
    public String routeOne = "West";
    /** Route Two Name **/
    public String routeTwo = "East";
    /** Child Ticket Price **/
    private double childFare = 1.5;
    /** Adult Ticket Price **/
    private double adultFare = 2.5;
    /** Number of Child Tickets **/
    private int childTickets = 0;
    /** Number of Adult Tickets **/
    private int adultTickets = 0;
    /** Total Price of Selected Tickets **/
    private double sum = ((childFare * childTickets) + (adultFare * adultTickets));
    /** User routeChoice **/
    private String routeChoice = "";
    /** User Coin Inputs **/
    private double coins = 0.0;

    /**
     * Changes selected route to route one
     * @param args unused
     */
    public void selectRouteOne() {
        routeChoice = "West";
    }

    /**
     * Changes selected route to route two
     * @param args unused
     */
    public void selectRouteTwo() {
        routeChoice = "East";
    }

    /**
     * Add a child ticket
     * @param args unused
     */
    public void addChildTicket() {
        childTickets += 1;
    }

    /**
     * Remove a child ticket
     * @param args unused
     */
    public void subChildTicket() {
        if (childTickets > 0) {
            childTickets = childTickets - 1;
        }
    }

    /**
     * Add a adult ticket
     * @param args unused
     */
    public void addAdultTicket() {
        adultTickets += 1;
    }

    /**
     * Remove a adult ticket
     * @param args unused
     */
    public void subAdultTicket() {
        if (adultTickets > 0) {
            adultTickets = adultTickets - 1;
        }
    }

    /**
     * Allows user to input a coin
     * @param coin The value of the coin
     */
    public void insertCoin(double coin) {
        coins += coin;
    }

    /**
     * Displays current screen
     * @param args unused
     */
    public void showScreen() {
        System.out.println("Route Choice: " + routeChoice);
        System.out.println("Child Tickets: " + childTickets);
        System.out.println("Adult Tickets: " + adultTickets);
        System.out.println("Money In Machine: $" + coins);
    }

    /**
     * Prints if user got a ticket
     * @param args unused
     */
    public void print() {
        if ((childTickets > 0) || (adultTickets > 0)) {
            if (!(routeChoice.equals(""))) {
                if (coins >= sum) {
                    System.out.println("You Got The Ticket!");
                } else {
                    System.out.println("You Did Not Get The Ticket");
                }
            } else {
                System.out.println("You Did Not Get The Ticket");
            }
        } else {
            System.out.println("You Did Not Get The Ticket");
        }
    }
}
