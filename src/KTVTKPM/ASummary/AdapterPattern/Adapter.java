package KTVTKPM.ASummary.AdapterPattern;

public class Adapter extends Adaptee implements Client {
	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}

}
