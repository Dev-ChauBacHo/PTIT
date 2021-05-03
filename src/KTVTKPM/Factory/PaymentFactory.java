package KTVTKPM.Factory;

public class PaymentFactory extends PaymentAbstractFactory {
    @Override
    public Payment getPayment(String type) {
        if (type.equalsIgnoreCase("Card")) {
            return new Card();
        } else if (type.equalsIgnoreCase("Cash")) {
            return new Cash();
        } else if (type.equalsIgnoreCase("BankAccount")) {
            return new BankAccount();
        } else return null;
    }
}
