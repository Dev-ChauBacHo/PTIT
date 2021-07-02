package KTVTKPM.abstractFactory;

public class CardAccount implements Account {

	@Override
	public void inputAccountNumber(String accNumber) {
		System.out.println("Tài khoản của bạn là: " + accNumber);

	}

	@Override
	public boolean inputPassword(String password) {
		if (password == null && password.length() == 0) {
			return false;
		} else {
			return true;
		}

	}

}
