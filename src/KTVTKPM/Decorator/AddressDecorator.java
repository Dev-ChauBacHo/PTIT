package KTVTKPM.Decorator;

public class AddressDecorator extends OrderDecorator {
    String note;

    public AddressDecorator(OrderInterface order, String note) {
        super(order);
        this.note = note;
    }

    @Override
    public String accept() {
        return order.accept() + addAdress();
    }

    private String addAdress() {
        return "address: " + note;
    }
}
