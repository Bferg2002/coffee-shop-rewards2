package org.codedifferently;

public class Customer {
   private String name;     //name of the customer
   private String email;    //email for the customer
   private int drinksPurchased; //number of drinks the customer purchased
   Customer(){
   }

   //Constructor for the customer object
   Customer(String name, String email, int drinksPurchased){
       this.name = name;
       this.email = email;
       this.drinksPurchased = drinksPurchased;
   }

   //setters and getters for the instance variables
    public String getName(){
       return name;
   }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String email) {
        this.email = email;
    }

    public int getDrinksPurchased() {
        return drinksPurchased;
    }

    public void setDrinksPurchased(int drinksPurchased) {
        this.drinksPurchased = drinksPurchased;
    }


    //checks to see if the customer is eligible for a reward
    public boolean isEligibleForReward(){
       if(drinksPurchased >= 5){
           return true;
       }
       return false;
    }
}// ends Customer class
