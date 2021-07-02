package KTVTKPM.ASummary.SingletionPattern;

public class Singleton {
	private Singleton sing;

	private Singleton() {

	}
	
	public Singleton getInstance() {
		return sing;
	}
}
