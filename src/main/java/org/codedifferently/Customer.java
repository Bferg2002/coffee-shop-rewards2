package org.codedifferently;

public class Customer {
   private String name;
   private String email;
   private int drinksPurchased;
   private double wallet;

   Customer(){

   }

   Customer(String name, String email, int drinksPurchased){
       this.name = name;
       this.email = email;
       this.drinksPurchased = drinksPurchased;
   }

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

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public int getDrinksPurchased() {
        return drinksPurchased;
    }

    public void setDrinksPurchased(int drinksPurchased) {
        this.drinksPurchased = drinksPurchased;
    }

    public boolean isEligibleForReward(){
       if(drinksPurchased >= 5){
           return true;
       }
       return false;
    }
}// ends Customer class
