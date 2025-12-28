package Zomato.models;

public class DeliveryOrder extends Order {
    public String userAddress;

    public DeliveryOrder() {
        this.userAddress = "";
    }
    public String getType() {
        return "Delivery";
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserAddress() {
        return this.userAddress;
    }
}
