package KTVTKPM.abstractFactory;

public class BankPayment implements OnlinePaymentFactory{

	@Override
	public Account createAccount() {
		return new BankPayment().createAccount();
	}

	@Override
	public Order createOrder() {
		// TODO Auto-generated method stub
		return new BankPayment().createOrder();
	}



}

