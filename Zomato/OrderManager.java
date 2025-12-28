package Zomato;

import java.util.ArrayList;

public final class OrderManager {
    public static volatile OrderManager instance;

    public ArrayList<Order> orderList;

    public static OrderManager getInstance() {
        if (instance == null) {
            synchronized (OrderManager.class) {
                if (instance == null) {
                    instance = new OrderManager();
                }
            }
        }
        return instance;
    }

    public void addOrder(Order order) {
        getInstance().orderList.add(order);
    }

    
}
