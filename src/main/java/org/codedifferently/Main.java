package org.codedifferently;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Customer customer1 = new Customer("Bryant", "bob@gmail.com",0);
        boolean checkout = false;
        String customerOrder;
       do {

            System.out.println("Welcome to Triple Cs!");
            System.out.println("Please enter the number(s) of the drink(s) you would like to order.");
            System.out.println("Separate multiple items with a comma (e.g., 1,3,5).");
            customerOrder = input.nextLine();
            System.out.println("*************************************");
            Receipt receipt = new Receipt();
            System.out.println(receipt.createCustomerOrder(customer1, customerOrder));
            System.out.println("*************************************");
            receipt.checkRewards(customer1, receipt.totalAmt);
            System.out.println("*************************************");

            System.out.println("Are you ready to checkout? (y/n)");
            String choice = input.nextLine().toLowerCase();
            if(choice.equals("y")){
                System.out.println("Goodbye, have a great day!");
                checkout = true;
            }
       } while(!checkout);


//use contains method

    }


}