package org.codedifferently;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //scanner object

        //vars for the customer, the customer's order, boolean var for the menu checkout, and the receipt object
        Customer customer1 = new Customer("Bryant", "bob@gmail.com",0);
        boolean checkout = false;
        String customerOrder ="";
        Receipt receipt = new Receipt();

        //Prompts the user for their order, displays the menu, and displays their receipt
        do {
            System.out.println("Welcome " + customer1.getName() + " to Triple Cs!");
            System.out.println("*************************************");
            System.out.println("Our Menu:");
            System.out.println("1) Coffee $10.00");
            System.out.println("2) Tea $5.50");
            System.out.println("3) Lemonade $12.00");
            System.out.println("4) Water $17.50");
            System.out.println("5) Soda $10.50");
            System.out.println("6) Milkshake $8.00");
            System.out.println();
            System.out.println("Please enter the number(s) of the drink(s) you would like to order.");
            System.out.println("Separate multiple items with a comma (e.g., 1,3,5).");

            boolean validOrder = false;

            while (!validOrder) {

                customerOrder = input.nextLine();

                // checks if input contains ONLY digits 1-6 and commas
                if (customerOrder.matches("[1-6,]+")) {
                    validOrder = true;
                } else {
                    System.out.println("Invalid selection. Please enter numbers 1-6 only.");
                    System.out.println("Try again:");
                }
            }

            System.out.println("*************************************");
            receipt.createCustomerOrder(customer1, customerOrder);
            System.out.println(receipt.getFullReceipt());
            System.out.println("*************************************");
            receipt.checkRewards(customer1, receipt.getTotalAmt());
            System.out.println("*************************************");

            //prompts the user to check out
            System.out.println("Are you ready to checkout? (y/n)");

            boolean validAnswer = false;
            String choice = "";

            while (!validAnswer) {

                choice = input.nextLine().toLowerCase();

                /*this chunk of code checks to see if the user's choice is a valid input
                 and if they want to continue shopping or not*/
                if (choice.matches("[yn]")) {
                    validAnswer = true;

                    if (choice.equals("y")) {
                        System.out.println("Goodbye, have a great day!");
                        checkout = true;
                    }

                } else {
                    System.out.println("Invalid selection. Please enter y or n.");
                    System.out.println("Try again:");
                }
            }

        } while(!checkout);
    }


}