package Zomato;

import java.util.ArrayList;

public class Cart {
    Restaurant restaurant;
    ArrayList<MenuItem> items;

    Cart(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
    
    public void addToCart(MenuItem item) {
        items.add(item);
    }

    public void totalCost() {

    }
    
    public void isEmpty() {
        if (items.size() == 0) {
            System.out.println("Cart is empty");
        } else {
            System.out.println("Cart is not empty");
        }
    }
}
