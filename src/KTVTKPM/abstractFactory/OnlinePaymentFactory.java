package KTVTKPM.abstractFactory;

public interface OnlinePaymentFactory {
	public Account createAccount();

	public Order createOrder();

}
