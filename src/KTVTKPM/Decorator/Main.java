package KTVTKPM.Decorator;

public class Main {
    public static void main(String[] args) {
        OrderInterface bookOrder = new BookOrder();

        AddressDecorator addressDecorator = new AddressDecorator(bookOrder, "NOW");

        System.out.println(bookOrder.accept());
        System.out.println(addressDecorator.accept());
    }
}
