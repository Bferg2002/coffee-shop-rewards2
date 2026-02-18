package org.codedifferently;

public class Receipt
{
    double totalAmt;

    public  StringBuilder createCustomerOrder(Customer customer, String customerOrder){
        StringBuilder orderSummary = new StringBuilder("You ordered:\n");
        int drinkCounter = 0;
        for (int i=0; i< customerOrder.length(); i++) {
            switch (Character.getNumericValue(customerOrder.charAt(i))) {

                case 1:
                    CoffeeItem item1 = new CoffeeItem("Coffee", 10.00);
                    orderSummary.append(
                            String.format("%s $%.2f%n", item1.getItemName(), item1.getPrice())
                    );
                    drinkCounter++;
                    totalAmt += item1.getPrice();
                    break;

                case 2:
                    CoffeeItem item2 = new CoffeeItem("Tea", 5.50);
                    orderSummary.append(
                            String.format("%s $%.2f%n", item2.getItemName(), item2.getPrice())
                    );
                    drinkCounter++;
                    totalAmt += item2.getPrice();
                    break;

                case 3:
                    CoffeeItem item3 = new CoffeeItem("Lemonade", 12.00);
                    orderSummary.append(
                            String.format("%s $%.2f%n", item3.getItemName(), item3.getPrice())
                    );
                    drinkCounter++;
                    totalAmt += item3.getPrice();
                    break;

                case 4:
                    CoffeeItem item4 = new CoffeeItem("Water", 17.50);
                    orderSummary.append(
                            String.format("%s $%.2f%n", item4.getItemName(), item4.getPrice())
                    );
                    drinkCounter++;
                    totalAmt += item4.getPrice();
                    break;

                case 5:
                    CoffeeItem item5 = new CoffeeItem("Soda", 10.50);
                    orderSummary.append(
                            String.format("%s $%.2f%n", item5.getItemName(), item5.getPrice())
                    );
                    drinkCounter++;
                    totalAmt += item5.getPrice();
                    break;

                case 6:
                    CoffeeItem item6 = new CoffeeItem("Milkshake", 8.00);
                    orderSummary.append(
                            String.format("%s $%.2f%n", item6.getItemName(), item6.getPrice())
                    );
                    drinkCounter++;
                    totalAmt += item6.getPrice();
                    break;
            }
        }
        customer.setDrinksPurchased(drinkCounter);
        orderSummary.append(
                String.format("%nYour total is $%.2f", totalAmt)
        );
        return orderSummary;
    }

    public void checkRewards(Customer customer, double total){
        if (customer.isEligibleForReward()) {
            System.out.println("Congrats, You are eligible for a reward!\nYour next drink is free!");
        }
        if (total > 20.00){
            System.out.println("You have gained bonus points on your account.");
        }

    }
}
