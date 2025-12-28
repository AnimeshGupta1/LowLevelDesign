package Zomato.models;

import java.util.ArrayList;

public class Cart {
    Restaurant restaurant;
    ArrayList<MenuItem> items;
    
    public void addToCart(MenuItem item) {
        items.add(item);
    }

    public double totalCost() {
        double sum = 0;
        for (MenuItem it : items) {
            sum += it.getPrice();
        }
        return sum;
    }
    
    public void isEmpty() {
        if (items.size() == 0) {
            System.out.println("Cart is empty");
        } else {
            System.out.println("Cart is not empty");
        }
    }
}
