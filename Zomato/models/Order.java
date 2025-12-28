package Zomato.models;

import java.util.ArrayList;

import Zomato.strategies.IPaymentStrategy;

public abstract class Order {
    public static int nextOrderId;
    public int orderId;
    public User user;
    public Restaurant restaurant;
    public ArrayList<MenuItem> items;
    public IPaymentStrategy paymentStrategy;
    public String scheduled;
    public double total;

    Order() {
        user = null;
        restaurant = null;
        paymentStrategy = null;
        total = 0.0;
        scheduled = "";
        orderId = ++nextOrderId;
    }

    public Boolean processPayment() {
        if (paymentStrategy != null) {
            paymentStrategy.pay();
            return true;
        } else {
            System.out.println("Please choose a Payment Strategy");
            return false;
        }
    }

    public abstract String getType();

    public int getOrderId() {
        return orderId;
    }

    public void setUser(User u) {
        user = u;
    }

    public User getUser() {
        return user;
    }

    public void setRestaurant(Restaurant r) {
        restaurant = r;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setItems(ArrayList<MenuItem> its) {
        items = its;
        total = 0;
        for (MenuItem i : items) {
            total += i.getPrice();
        }
    }

    public ArrayList<MenuItem> getItems(){
        return items;
    }

    public void setPaymentStrategy(IPaymentStrategy p) {
        paymentStrategy = p;
    }

    public void setScheduled(String s) {
        scheduled = s;
    }

    public String getScheduled() {
        return scheduled;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
