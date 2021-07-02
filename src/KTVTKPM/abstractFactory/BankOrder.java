package KTVTKPM.abstractFactory;

public class BankOrder implements Order{

	@Override
	public void inputProduct(String proName) {
		System.out.println("Tên sản phẩm của bạn là: " + proName);
		
	}
	

}
