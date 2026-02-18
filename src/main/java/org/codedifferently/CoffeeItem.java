package org.codedifferently;

public class CoffeeItem {
    private String itemName;        //name of the item
    private double price;       //price of the item

    //constructor for the item
    CoffeeItem(String itemName, double price){
        this.itemName = itemName;
        this.price = price;
    }

    //setters and getters for the coffee item
    public String getItemName(){
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

} // ends CoffeeItem class
