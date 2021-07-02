package KTVTKPM.factoryMethod;

public class PayByCardFactory extends PaymentFactory{
	@Override
	public Payment createPayment() {
		return new PayByCard();
	}
	


}
