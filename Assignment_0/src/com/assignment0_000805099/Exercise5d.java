package week2solutions;

import java.util.Scanner;

/**
 * Determines whether or not an integer is a prime number.
 * 
 * An integer is a prime number iff it is greater than 1 AND
 * its only factors are 1 and itself.
 * 
 * Question: Do we really need to check all factors up to
 * and including number-1? Could we stop earlier? If so, how
 * much earlier and how much time would this save?
 * 
 * BUGS: There is a bug in this program. Can you find it?
 * 
 * @author Sam Scott
 */
public class Exercise5d {
  
  /**
   * @param args unused
   **/
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a positive integer.");
    int number = sc.nextInt();
    
    if (number == 1) {
      System.out.println("1 is NOT a prime number");
    } else {
      // initialize
      int factor = 2; 
      
      // test
      while (number % factor != 0 && factor < number)
        factor++; // act, change
      // loop
      
      if (factor < number)
        System.out.println(number + " is NOT a prime number.");
      else
        System.out.println(number + " is a prime number.");
    }
    System.out.println("Goodbye!");
  }
}