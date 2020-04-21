package com.assignment4_000805099;

/**
 * Implementation of two classes - one to represent a playing card with a rank and suit, and one to represent a deck of
 * cards. The program can repeatedly shuffle and deal hands, and create a histogram of the results.
 * @author  Andy Le
 */

import java.util.Scanner;

public class Main {

    /**
     *
     * @param args unused
     */
    public static void main(String[] args) {
        // *** Number of Suits
        int suits;
        // *** Number of Ranks
        int ranks;
        // *** User input for move choices
        int user_in = 0;
        // *** User input for number of cards to deal
        int dealt = 0;
        // *** Temporary hand of drawn cards
        Card[] temp;
        // *** input
        Scanner input = new Scanner(System.in);
        System.out.print("How many suits? ");
        suits = input.nextInt();
        System.out.print("How many ranks? ");
        ranks = input.nextInt();
        DeckOfCards deck = new DeckOfCards(ranks, suits);
        // *** processing
        while (user_in != 4) {
            // *** output
            System.out.println("");
            System.out.println(deck);
            System.out.print("1=shuffle, 2=deal 1 hand, 3=deal 100000 times, 4=quit: ");
            user_in = input.nextInt();
            if (user_in == 1){
                deck.shuffle();
            } else if (user_in == 2) {
                System.out.print("How many cards? ");
                dealt = input.nextInt();
                temp = deck.deal(dealt);
                System.out.println("");
                for (int i = 0; i < dealt; i++) {
                    System.out.print("Card " + temp[i] + " ");
                }
                System.out.println("");
            } else if (user_in == 3) {
                System.out.print("How many cards? ");
                dealt = input.nextInt();
                System.out.println("");
                deck.histogram(dealt);
            } else if (user_in == 4) {
                System.out.println("BYE!");
            }
        }
    }
}
