package KTVTKPM.Strategy;

public class StrategyMain {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addItem(new Item(3.45));
        cart.addItem(new Item(7.35));
        cart.addItem(new Item(9.5));


        PaymentStrategy payment = new PayByCardStrategy(1, 943570957);


        cart.pay(payment);
    }
}
