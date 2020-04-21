package week2solutions;

import java.util.Scanner;

/**
 * Solution to Week 2 Exercise 1d (third part)
 *
 * @author Sam Scott
 */
public class Exercise1d_3 {

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
        int biggest = alice;
        if (harman > biggest)
            biggest = harman;
        if (abdul > biggest)
            biggest = abdul;
        System.out.print("Winner(s): ");
        if (alice == biggest)
            System.out.print("Alice! ");
        if (harman == biggest)
            System.out.print("Harman! ");
        if (abdul == biggest)
            System.out.print("Abdul! ");
        System.out.println();
    }
}
