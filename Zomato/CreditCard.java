package Zomato;

public class CreditCard implements IPaymentStrategy {
    public void pay() {
        System.out.println("Payment Via Credit Card.");
    }
}
