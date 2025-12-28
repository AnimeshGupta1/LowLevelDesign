package Zomato;

public class Upi implements IPaymentStrategy{
    public void pay() {
        System.out.println("Payment Via UPI");
    }
}
