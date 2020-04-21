package week2solutions;


import java.util.Scanner;

/**
 * Solution to Week 2 Exercise 1e.
 *
 * @author Sam Scott
 */
public class Exercise1e {

    /**
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What's your name? (enter 'quit' to stop)");
        String name = sc.nextLine();

        while (!name.equals("quit")) { // "quit" is the sentinel value
            System.out.println("Hi " + name);
            System.out.println("What's your name? (enter 'quit' to stop)");
            name = sc.nextLine();
        }

        System.out.println("Bye!");
    }

}
