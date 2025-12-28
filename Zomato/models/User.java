package Zomato.models;

public class User {
    private int userId;
    private String name;
    private String address;
    private Cart cart;
    
    User(int userId, String name, String address) {
        this.userId = userId;
        this.name = name;
        this.address = address;
        cart = new Cart();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cart geCart() {
        return this.cart;
    }
}
