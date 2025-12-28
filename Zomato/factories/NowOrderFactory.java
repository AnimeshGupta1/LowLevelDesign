package Zomato.factories;

import java.util.ArrayList;

import Zomato.models.Cart;
import Zomato.models.DeliveryOrder;
import Zomato.models.MenuItem;
import Zomato.models.Order;
import Zomato.models.PickupOrder;
import Zomato.models.Restaurant;
import Zomato.models.User;
import Zomato.strategies.IPaymentStrategy;

public class NowOrderFactory implements IOrderFactory {

    public Order createOrder(User user, Cart cart, Restaurant restaurant, ArrayList<MenuItem> menuItems,
            IPaymentStrategy paymentStrategy, double totalCost, String orderType) {
        Order order = null;

        if (orderType == "Delivery") {
            DeliveryOrder deliveryOrder = new DeliveryOrder();
            deliveryOrder.setUserAddress(user.getAddress());
            order = deliveryOrder;
        } else {
            PickupOrder pickupOrder = new PickupOrder();
            pickupOrder.setRestaurantAddress(restaurant.getLocation());
            order = pickupOrder;
        }

        order.setUser(user);
        order.setRestaurant(restaurant);
        order.setItems(menuItems);
        order.setPaymentStrategy(paymentStrategy);
        order.setScheduled("1");
        order.setTotal(totalCost);

        return order;
    }
    
    
}
