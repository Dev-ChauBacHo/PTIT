package KTVTKPM.Factory;

public class Card implements Payment {
    @Override
    public void pay() {
        System.out.println("Card");
    }
}
