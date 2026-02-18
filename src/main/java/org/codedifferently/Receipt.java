package org.codedifferently;

public class Receipt
{
    private double totalAmt; //customer's total bill amount
    private StringBuilder orderSummary = new StringBuilder("You ordered:\n");   //creates the customer's receipt

    //setters and getters for the instance variables
    public void setTotalAmt(double totalAmt) {
        this.totalAmt = totalAmt;
    }

    public double getTotalAmt() {
        return totalAmt;
    }

    //creates the receipt for the customer by creating coffeeItem objects
    public  StringBuilder createCustomerOrder(Customer customer, String customerOrder){
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

        customer.setDrinksPurchased(customer.getDrinksPurchased() + drinkCounter);

        return orderSummary;
    }

    //returns the customer's receipt '
    public String getFullReceipt() {
        return orderSummary.toString() + String.format("%nYour total is $%.2f", totalAmt);
    }

    //checks to see if the customer has earned any awards and displays a message to the user
    public void checkRewards(Customer customer, double total){
        if (customer.isEligibleForReward()) {
            System.out.println("Congrats, You are eligible for a reward!\nYour next drink is free!");
        }
        if (total > 20.00){
            System.out.println("You have gained bonus points on your account.");
        }

        if(customer.getDrinksPurchased() < 5){
            System.out.println("Drinks towards reward: " + (5 - customer.getDrinksPurchased()));
        }

    }
}
