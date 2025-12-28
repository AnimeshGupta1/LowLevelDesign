package Zomato.factories;

import java.util.ArrayList;

import Zomato.models.Cart;
import Zomato.models.MenuItem;
import Zomato.models.Order;
import Zomato.models.Restaurant;
import Zomato.models.User;
import Zomato.strategies.IPaymentStrategy;


public interface IOrderFactory {

    public Order createOrder(User user, Cart cart, Restaurant restaurant,
                ArrayList<MenuItem> menuItems, IPaymentStrategy paymentStrategy,
            double totalCost, String orderType);
    
}
