package org.codedifferently;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Customer c1 = new Customer("Bryant", 333);
        Item i1 = new Item("Coffee",10.00, true);
        Item i2 = new Item("Tea",5.50, true);
        Item i3 = new Item("Croissant",12.00, false);
        Item i4 = new Item("Pie",17.50, false);
        Item i5 = new Item("Waffles",10.50, false);
        Item i6 = new Item("Cookies",8.00, false);


        //Customer c1 = new Customer("Bryant", 333);
        //Customer c1 = new Customer("Bryant", 333);

        Purchase.displayMenu(c1,i1,i2,i3,i4,i5,i6);


    }
}