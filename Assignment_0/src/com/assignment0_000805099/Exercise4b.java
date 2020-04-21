package week2solutions;


import java.util.Scanner;

/**
 * Solution to Week 2, Exercise 4b
 *
 * @author Sam Scott
 */
public class Exercise4b {

    /**
     * @param args unused
     *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random() * 10) + 1;

        System.out.println("I'm thinking of a number from 1 to 10. Can you guess it?");
        int guess;
        do {
            do {
                guess = sc.nextInt();
                if (guess < 1 || guess > 10) {
                    System.out.println("Number of of range. Try again.");
                }
            } while (guess < 1 || guess > 10);
            if (guess < myNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > myNumber) {
                System.out.println("Too high! Try again.");
            }
        } while (guess != myNumber);

        System.out.println("You got it!");
    }

}
