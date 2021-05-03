package KTVTKPM.Factory;

public class PaymentFactoryProducer {
    public PaymentAbstractFactory getFactory() {
        // Chi co Payment Factory
        return new PaymentFactory();
    }
}
