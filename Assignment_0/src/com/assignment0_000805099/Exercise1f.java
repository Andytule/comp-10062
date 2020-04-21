package week2solutions;


import java.util.Scanner;

/**
 * Solution to Week 2, Exercise 1f
 *
 * @author Sam Scott
 */
public class Exercise1f {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter 10 numbers");

        double biggestSoFar = -Double.MAX_VALUE;
        double leastSoFar = Double.MAX_VALUE;
        double total = 0;
        int i = 0;
        while (i < 10) {
            double nextNum = sc.nextDouble();
            if (nextNum > biggestSoFar) {
                biggestSoFar = nextNum;
            }
            if (nextNum < leastSoFar) {
                leastSoFar = nextNum;
            }
            total = total + nextNum;
            i++;
        }

        System.out.println("Range of numbers entered: " + (biggestSoFar - leastSoFar));
        System.out.println("Average of numbers entered: " + total / 10.0);
    }

}
