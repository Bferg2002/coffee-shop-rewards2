package org.codedifferently;

public class Customer {
   private String name;
   private int phoneNumber;
   private int points;

   Customer(){

   }

   Customer(String name, int phoneNumber){
       this.name = name;
       this.phoneNumber = phoneNumber;
       this.points = 0;
   }

    public String getName(){
       return name;
   }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
