package Zomato.strategies;

public class CreditCard implements IPaymentStrategy {
    String cardNo;

    CreditCard(String cardNo) {
        this.cardNo = cardNo;
    } 
    public void pay() {
        System.out.println("Payment Via Credit Card.");
    }
}
