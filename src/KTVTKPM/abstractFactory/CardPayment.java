package KTVTKPM.abstractFactory;

public class CardPayment implements OnlinePaymentFactory{

	@Override
	public Account createAccount() {
		// TODO Auto-generated method stub
		return new CardPayment().createAccount();
	}

	@Override
	public Order createOrder() {
		// TODO Auto-generated method stub
		return new CardPayment().createOrder();
	}



}
