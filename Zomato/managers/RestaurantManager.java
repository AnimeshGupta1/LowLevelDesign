package Zomato.managers;

import java.util.ArrayList;

import Zomato.models.Restaurant;

public final class RestaurantManager {
    private static volatile RestaurantManager instance;

    ArrayList<Restaurant> restaurants;

    public static RestaurantManager getInstance() {
        if (instance == null) {
            synchronized (RestaurantManager.class) {
                if (instance == null) {
                    instance = new RestaurantManager();
                }
            }
        }
        return instance;
    }

    public void addRestaurant(Restaurant restaurant) {
        this.restaurants.add(restaurant);
    }

}
