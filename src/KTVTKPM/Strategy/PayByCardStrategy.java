package KTVTKPM.Strategy;

public class PayByCardStrategy implements PaymentStrategy{
    private int cardType;
    private int cardNumber;

    @Override
    public boolean pay(double amount) {
        // do something
        return true;
    }
}
