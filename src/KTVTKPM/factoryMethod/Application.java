package KTVTKPM.factoryMethod;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		int choice = 0;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Lựa chọn phương thức thanh toán: ");
			System.out.println("1. Thanh toán online");
			System.out.println("2. Trả tiền mặt");
			System.out.println("3. Thoát");
			choice = input.nextInt();
			input.nextLine();
			switch (choice) {
			case 1:
				System.out.println("1. Thanh toán bằng thẻ ngân hàng");
				System.out.println("2. Thanh toán bằng ví điện tử");
				System.out.println("3. Thoát");
				int k = input.nextInt();
				input.nextLine();
				switch (k) {
				case 1:
					System.out.println("Nhập số thẻ");
					String cardNumber = input.nextLine();
					System.out.println("Nhập số tiền bạn phải trả");
					int money = input.nextInt();
					input.nextLine();
					PayByCard payByCard = new PayByCard();
//					payByCard.payByCard(cardNumber, money);
					break;
				case 2:
					System.out.println("Nhập mã:");
					String code = input.nextLine();
					System.out.println("Nhập số tiền bạn phải trả");
					int money1 = input.nextInt();
					input.nextLine();
					PayByCard payByCard2 = new PayByCard();
//					payByCard2.payByCard(code, money1);
					break;
				case 3:
					break;
				default:
					System.out.println("Vui lòng nhập lại");
					break;
				}
				break;
			case 2:
				System.out.println("Nhập số tiền bạn phải trả");
				int money = input.nextInt();
				input.nextLine();
				PayByCash payByCash = new PayByCash();
//				payByCash.payByMoney(money);
				break;
			case 3:
				break;
			default:
				System.out.println("Vui lòng nhập lại");
				break;
			}
			break;
		} while (choice != 0);

	}

}
