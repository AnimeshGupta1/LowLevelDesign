package Zomato.strategies;

public class Upi implements IPaymentStrategy {
    String mobile;

    Upi(String mobile) {
        this.mobile = mobile;
    }
    
    public void pay() {
        System.out.println("Payment Via UPI");
    }
}
