package com.assignment4_000805099;

/**
 * Implementation of the DeckOfCards object which has a rank and a suit as its constructor parameters. Both the rank
 * and suit are positive, non-zero integers
 * @author Andy Le
 */
public class DeckOfCards {
    /** Deck of cards which is a list of card objects **/
    private Card[] deck;

    /**
     * Constructor for the DeckofCards class
     * @param ranks The number of Ranks
     * @param suits The number of Suits
     */
    public DeckOfCards(int ranks, int suits) {
        this.deck = new Card[ranks * suits];
        int j = 0;
        int k = 1;
        for (int i = 0; i < (ranks * suits); i++) {
            if (j == ranks) {
                j = 1;
                k += 1;
            }
            else {
                j += 1;
            }
            this.deck[i] = new Card(j, k);
        }
    }

    /**
     * A method that shuffles the deck of cards
     */
    public void shuffle() {
        for (int i = 1; i <= getSize(); i++) {
            int one = ((int)(Math.random() * getSize()));
            int two = ((int)(Math.random() * getSize()));
            Card temp = deck[one];
            deck[one] = deck[two];
            deck[two] = temp;
        }
    }

    /**
     * @return The size of the decl
     */
    public int getSize() {
        return this.deck.length;
    }

    /**
     * @return the lowest value card in the deck
     */
    public int minCard() {
        return 1;
    }

    /**
     * @return the highest value card in the deck
     */
    public int maxCard() {
        int max = 0;
        for (Card item: this.deck) {
            if (item.getValue() > max) {
                max = item.getValue();
            }
        }
        return max;
    }

    /**
     * A method for drawing a number of cards
     * @param n The number of cards to be drawn
     * @return a list of card objects
     */
    public Card[] deal(int n) {
        Card[] temp = new Card[n];
        for (int i = 0; i < n; i++) {
            temp[i] = this.deck[i];
        }
        return temp;
    }

    /**
     * A method to return a representation of the object
     * @return a string to represent the object
     */
    public String toString() {
        return "Deck of " + getSize() + " cards: low = " + minCard() + " high = " + maxCard() + " top = Card " +
                this.deck[0];
    }

    /**
     * A method to display a histogram of 100000 draws
     * @param n the number of cards to be drawn
     * @return a list of integers
     */
    public int[] histogram(int n) {
        int[] temp = new int[maxCard() * n];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = 0;
        }
        for (int i = 1; i <= 100000; i++) {
            Card[] temp2 = deal(n);
            int sum = 0;
            for(Card item: temp2) {
                sum += item.getValue();
            }
            temp[sum] += 1;
            shuffle();
        }
        for (int i = (minCard() * n); i < (maxCard() * n); i++) {
            if (temp[i] != 0) {
                System.out.println(i + ": " + temp[i]);
            }
        }
        return temp;
    }
}
