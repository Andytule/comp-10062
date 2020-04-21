package week2solutions;

import java.util.Scanner;

/**
 * Solution to Week 2, Exercise 1c
 * 
 * @author Sam Scott
 */
public class Exercise1c {
  
  /**
   * @param args unused
   **/
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    
    // input
    System.out.println("Enter a number: ");
    int number = sc.nextInt();
    
    // processing and output
    if (number % 13 == 0 || number % 2 == 0 && number > 10)
      System.out.println("That number is groovy!");
    else
      System.out.println("That number is not groovy. :-(");
  }
  
}
