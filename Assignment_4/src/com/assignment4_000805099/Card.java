package com.assignment4_000805099;

/**
 * Implementation of the card class. A card has a rank and a suit
 * @author Andy Le
 */
public class Card {
    /** The rank of the card **/
    private int rank;
    /** The suit of the card **/
    private int suit;

    /**
     * Constructor for the Card class which takes in a rank and a suit
     * @param rank the rank of the card
     * @param suit the suit of the card
     */
    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * A method to return the rank of a card
     * @return The rank of the card
     */
    public int getRank() {
        return this.rank;
    }

    /**
     * A method to return the suit of the card
     * @return The suit of the card
     */
    public int getSuit() {
        return this.suit;
    }

    /**
     * A method to return the value of the card
     * @return the rank times the suit
     */
    public int getValue() {
        return this.rank * this.suit;
    }

    /**
     * A method to return the representation of the card object
     * @return a string that represents the card and its values
     */
    public String toString() {
        return "S" + getSuit() + "R" + getRank();
    }
}
