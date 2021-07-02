package KTVTKPM.abstractFactory;

public class CardtOrder implements Order {

	@Override
	public void inputProduct(String proName) {
		System.out.println("Ten san pham: " + proName);
	}

}
