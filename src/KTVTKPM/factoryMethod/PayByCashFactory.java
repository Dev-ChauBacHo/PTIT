package KTVTKPM.factoryMethod;

public class PayByCashFactory extends PaymentFactory {

	@Override
	public Payment createPayment() {
		// TODO Auto-generated method stub
		return new PayByCash();
	}

}
