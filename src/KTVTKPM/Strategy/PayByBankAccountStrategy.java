package KTVTKPM.Strategy;

public class PayByBankAccountStrategy implements PaymentStrategy{
    private String username;

    @Override
    public boolean pay(double amount) {
        // do something
        return true;
    }
}
