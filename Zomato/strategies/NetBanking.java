package Zomato.strategies;

public class NetBanking implements IPaymentStrategy {
    public void pay() {
        System.out.println("Payment Via NetBanking");
    }
}
