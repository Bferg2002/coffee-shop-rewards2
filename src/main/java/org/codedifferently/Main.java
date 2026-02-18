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
       // do {

            System.out.println("Welcome to Triple Cs!");
            System.out.println("Please enter the number(s) of the drink(s) you would like to order.");
            System.out.println("Separate multiple items with a comma (e.g., 1,3,5).");
            customerOrder = input.nextLine();
            System.out.println("*************************************");
            System.out.println(createCustomerOrder(customer1, customerOrder));
            System.out.println("*************************************");

            System.out.println("Are you ready to checkout? (y/n)");
     //   } while(!checkout);


//use contains method

    }

    public static StringBuilder createCustomerOrder(Customer customer, String customerOrder){
       StringBuilder orderSummary = new StringBuilder("You ordered:\n");
       int drinkCounter = 0;
       double total = 0.0;
       for (int i=0; i< customerOrder.length(); i++) {
           switch (Character.getNumericValue(customerOrder.charAt(i))) {

               case 1:
                   CoffeeItem item1 = new CoffeeItem("Coffee", 10.00);
                   orderSummary.append(
                           String.format("%s $%.2f%n", item1.getItemName(), item1.getPrice())
                   );
                   drinkCounter++;
                   total += item1.getPrice();
                   break;

               case 2:
                   CoffeeItem item2 = new CoffeeItem("Tea", 5.50);
                   orderSummary.append(
                           String.format("%s $%.2f%n", item2.getItemName(), item2.getPrice())
                   );
                   drinkCounter++;
                   total += item2.getPrice();
                   break;

               case 3:
                   CoffeeItem item3 = new CoffeeItem("Lemonade", 12.00);
                   orderSummary.append(
                           String.format("%s $%.2f%n", item3.getItemName(), item3.getPrice())
                   );
                   drinkCounter++;
                   total += item3.getPrice();
                   break;

               case 4:
                   CoffeeItem item4 = new CoffeeItem("Water", 17.50);
                   orderSummary.append(
                           String.format("%s $%.2f%n", item4.getItemName(), item4.getPrice())
                   );
                   drinkCounter++;
                   total += item4.getPrice();
                   break;

               case 5:
                   CoffeeItem item5 = new CoffeeItem("Soda", 10.50);
                   orderSummary.append(
                           String.format("%s $%.2f%n", item5.getItemName(), item5.getPrice())
                   );
                   drinkCounter++;
                   total += item5.getPrice();
                   break;

               case 6:
                   CoffeeItem item6 = new CoffeeItem("Milkshake", 8.00);
                   orderSummary.append(
                           String.format("%s $%.2f%n", item6.getItemName(), item6.getPrice())
                   );
                   drinkCounter++;
                   total += item6.getPrice();
                   break;
           }
       }
        orderSummary.append(
                String.format("%nYour total is $%.2f", total)
        );
        return orderSummary;
    }

    public void checkRewards(Customer customer, double total){
        if (customer.isEligibleForReward()) {
            System.out.println("You are eligible for a reward!\n Your next drink is free.");
        }
       // if (customer)

    }



}