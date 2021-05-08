package KTVTKPM.Strategy;

public class PayByCashStrategy implements PaymentStrategy {

    @Override
    public boolean pay(double amount) {
        // do something
        System.out.println("Paid by cash");
        return true;
    }
}
