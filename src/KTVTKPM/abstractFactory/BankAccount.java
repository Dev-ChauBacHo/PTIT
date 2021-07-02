package KTVTKPM.abstractFactory;

public class BankAccount implements Account {

	@Override
	public void inputAccountNumber(String accNumber) {
		System.out.println("Tên tài khoản của bạn: " + accNumber);

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
