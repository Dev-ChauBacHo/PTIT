package KTVTKPM.ASummary.FacadePattern;

public class Facade {
	private ConcreteFacade1 fa1;
	private ConcreteFacade2 fa2;
	
	public Facade(ConcreteFacade1 fa1, ConcreteFacade2 fa2) {
		super();
		this.fa1 = fa1;
		this.fa2 = fa2;
	}

	public void method() {
		//some code
	}
}
