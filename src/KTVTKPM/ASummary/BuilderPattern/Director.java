package KTVTKPM.ASummary.BuilderPattern;

public class Director {
	private BuilderInterface build;
	
	public Director(BuilderInterface build) {
		super();
		this.build = build;
	}
	
	public void changeBuilder(BuilderInterface build) {
		//some code
	}
}
