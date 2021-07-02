package KTVTKPM.singleton;

public class MainSingleton {
	public static void main(String[] args) {
		Fan b1 = new Fan("Midea");
		Fan b2 = new Fan("Panasonic");
		Fan b3 = new Fan("Sun");

		FanManager.getInstance().addFan(b1);
		FanManager.getInstance().addFan(b2);
		FanManager.getInstance().addFan(b3);

		System.out.println(FanManager.getInstance().search("Lich su").getName());

	}
}
