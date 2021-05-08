package KTVTKPM.Strategy;

public class PayByCardStrategy implements PaymentStrategy{
    private int cardType;
    private int cardNumber;

    public PayByCardStrategy(int cardType, int cardNumber) {
        this.cardType = cardType;
        this.cardNumber = cardNumber;
    }

    public PayByCardStrategy() {
    }

    @Override
    public boolean pay(double amount) {
        // do something
        System.out.println("Paid by card");
        return true;
    }
}
