package Zomato;

public class NowOrderFactory implements IOrderFactory {
    public Order createOrder(String type) {

        System.out.println("Ordering Now");
        switch (type) {
            case "Delivery":
                return new DeliveryOrder();
            default :
                return new PickupOrder();
        }
    }
}
