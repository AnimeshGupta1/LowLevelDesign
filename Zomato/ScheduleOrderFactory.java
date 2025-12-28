package Zomato;

public class ScheduleOrderFactory implements IOrderFactory{
    
    public Order createOrder(String type) {

        System.out.println("Schedule Order");
        switch (type) {
            case "Delivery":
                return new DeliveryOrder();
            default :
                return new PickupOrder();
        }
    }
}
