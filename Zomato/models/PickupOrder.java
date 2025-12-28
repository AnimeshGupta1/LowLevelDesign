package Zomato.models;

public class PickupOrder extends Order {
    
    public String restaurantAddress;

    public PickupOrder() {
        this.restaurantAddress = "";
    }

    public String getType() {
        return "Pickup";
    }
    
    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public String getRestaurantAddress() {
        return this.restaurantAddress;
    }
    
}
