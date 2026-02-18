package org.codedifferently;

public class CoffeeItem {
    private String itemName;
    private double price;

    CoffeeItem(String itemName, double price){
        this.itemName = itemName;
        this.price = price;
    }

    CoffeeItem(String itemName){
        this.itemName = itemName;
        this.price = 0;
    }
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
