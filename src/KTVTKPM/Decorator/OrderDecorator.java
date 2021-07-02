package KTVTKPM.Decorator;

public abstract class OrderDecorator implements OrderInterface {
    OrderInterface order;

    public OrderDecorator(OrderInterface order) {
        this.order = order;
    }
}
