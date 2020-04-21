package week2solutions;

import java.util.Scanner;

/**
 * Solution to Week 2 Exercise 1d (first part)
 *
 * @author Sam Scott
 */
public class Exercise1d {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variables
        int alice, harman, abdul;

        // input
        System.out.print("Enter Alice's Darts score: ");
        alice = sc.nextInt();

        System.out.print("Enter Harman's Darts score: ");
        harman = sc.nextInt();

        System.out.print("Enter Abdul's Darts score: ");
        abdul = sc.nextInt();

        // processing and output
        if (alice > harman) {
            if (alice > abdul) {
                System.out.println("Alice wins!");
            } else {
                System.out.println("Abdul wins!");
            }
        } else if (harman > abdul) {
            System.out.println("Harman wins!");
        } else {
            System.out.println("Abdul wins!");
        }
    }

}
