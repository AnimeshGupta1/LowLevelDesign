package Zomato;

import java.util.ArrayList;
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
        getInstance().restaurants.add(restaurant);
    }

    
}
