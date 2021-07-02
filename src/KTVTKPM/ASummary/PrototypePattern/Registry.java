package KTVTKPM.ASummary.PrototypePattern;

public class Registry {
	private Prototype prototype;
	
	public Registry(Prototype prototype) {
		super();
		this.prototype = prototype;
	}

	public Prototype clone() {
		//some code
		return prototype;
	}
}	
