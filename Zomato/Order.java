package Zomato;

import java.util.ArrayList;

public class Order {
    public int id;
    public User user;

    public Restaurant restaurant;
    public ArrayList<MenuItem> items;

    public IPaymentStrategy strategy;

    public void getType() {
        
    }
}
