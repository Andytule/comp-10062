package com.assignment2_000805099;

/** Imported scanner **/
import java.util.Scanner;

/**
 * This program is the interaction between a user and a ticket machine at a train station.
 * Feb 2, 2020
 * Andy Le
 * 000805099
 * @author Andyt Le
 */
public class Main {
    /**
     * @param args unused
     */
    public static void main(String[] args) {
        TicketMachine machineOne = new TicketMachine();
        TicketMachine machineTwo = new TicketMachine();

        Scanner input = new Scanner(System.in);
        int user_in = 0;
        while (user_in != 7) {
            // *** output
            machineOne.showScreen();
            System.out.println("---------------------------");
            System.out.println("1: Select Route " + machineOne.routeOne);
            System.out.println("2: Select Route " + machineOne.routeTwo);
            System.out.println("3: Add Child Ticket");
            System.out.println("4: Remove Child Ticket");
            System.out.println("5: Add Adult Ticket");
            System.out.println("6: Remove Adult Ticket");
            System.out.println("7: Print Ticket");
            System.out.println("8: Insert Coin");
            System.out.print("Select An Option: ");

            // *** input
            user_in = input.nextInt();
            System.out.println("---------------------------");

            // *** processing
            if (user_in == 1) {
                machineOne.selectRouteOne();
            }
            else if (user_in == 2) {
                machineOne.selectRouteTwo();
            }
            else if (user_in == 3) {
                machineOne.addChildTicket();
            }
            else if (user_in == 4) {
                machineOne.subChildTicket();
            }
            else if (user_in == 5) {
                machineOne.addAdultTicket();
            }
            else if (user_in == 6) {
                machineOne.subAdultTicket();
            }
            else if (user_in == 7) {
                machineOne.print();
            }
            else if (user_in == 8) {
                System.out.print("Choose A Coin (1: Quarter, 2: Loonie, 3: Toonie): ");
                user_in = input.nextInt();
                if (user_in == 1) {
                    machineOne.insertCoin(0.25);
                }
                else if (user_in == 2) {
                    machineOne.insertCoin(1.00);
                }
                else if (user_in == 3) {
                    machineOne.insertCoin(2.00);
                } else {
                    System.out.println("Invalid Input!");
                }
            }
            else {
                System.out.println("Enter a valid input1");
            }
        }
        while (user_in != 7) {
            // *** output
            machineTwo.showScreen();
            System.out.println("---------------------------");
            System.out.println("1: Select Route " + machineTwo.routeOne);
            System.out.println("2: Select Route " + machineTwo.routeTwo);
            System.out.println("3: Add Child Ticket");
            System.out.println("4: Remove Child Ticket");
            System.out.println("5: Add Adult Ticket");
            System.out.println("6: Remove Adult Ticket");
            System.out.println("7: Print Ticket");
            System.out.println("8: Insert Coin");
            System.out.print("Select An Option: ");

            // *** input
            user_in = input.nextInt();
            System.out.println("---------------------------");

            // *** processing
            if (user_in == 1) {
                machineTwo.selectRouteOne();
            }
            else if (user_in == 2) {
                machineTwo.selectRouteTwo();
            }
            else if (user_in == 3) {
                machineTwo.addChildTicket();
            }
            else if (user_in == 4) {
                machineTwo.subChildTicket();
            }
            else if (user_in == 5) {
                machineTwo.addAdultTicket();
            }
            else if (user_in == 6) {
                machineTwo.subAdultTicket();
            }
            else if (user_in == 7) {
                machineTwo.print();
            }
            else if (user_in == 8) {
                System.out.print("Choose A Coin (1: Quarter, 2: Loonie, 3: Toonie): ");
                user_in = input.nextInt();
                if (user_in == 1) {
                    machineTwo.insertCoin(0.25);
                }
                else if (user_in == 2) {
                    machineTwo.insertCoin(1.00);
                }
                else if (user_in == 3) {
                    machineTwo.insertCoin(2.00);
                } else {
                    System.out.println("Invalid Input!");
                }
            }
            else {
                System.out.println("Enter a valid input1");
            }
        }
    }
}
