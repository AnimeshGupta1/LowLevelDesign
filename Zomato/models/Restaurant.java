package Zomato.models;

import java.util.ArrayList;

public class Restaurant {
    private static int nextRestaurantId;
    private int restaurantId;
    private String name;
    private String location;
    ArrayList<MenuItem> menu;

    Restaurant(String name, String location) {
        this.name = name;
        this.location = location;
        this.restaurantId = ++nextRestaurantId;
    }

    public String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return this.location;
    }

    void setLocation(String location) {
        this.location = location;
    }
    
    
}
