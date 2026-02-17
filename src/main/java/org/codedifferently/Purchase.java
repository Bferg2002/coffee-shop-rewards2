package org.codedifferently;

import java.util.Scanner;

public class Purchase {
    public static void displayMenu(Customer customer, Item item1, Item item2, Item item3, Item item4, Item item5,  Item item6){
        boolean checkout = false;
      //  do {
            System.out.println("Welcome, " + customer.getName() + " to Coreye’s Coffee Cafe (Triple C’s)!");
            System.out.println("Here is our menu: ");
            System.out.println("*****************************");
            System.out.printf("1) %s %.2f%n", item1.getItemName(), item1.getPrice());
            System.out.printf("2) %s %.2f%n", item2.getItemName(), item2.getPrice());
            System.out.printf("3) %s %.2f%n", item3.getItemName(), item3.getPrice());
            System.out.printf("4) %s %.2f%n", item4.getItemName(), item4.getPrice());
            System.out.printf("5) %s %.2f%n", item5.getItemName(), item5.getPrice());
            System.out.printf("6) %s %.2f%n", item6.getItemName(), item6.getPrice());
            System.out.println("*****************************");

        // } while(!checkout);
        }
    public static String createCustomerOrder(){
        System.out.println("Type out the number of ");
        return "";
    }


}//ends Purchase class
