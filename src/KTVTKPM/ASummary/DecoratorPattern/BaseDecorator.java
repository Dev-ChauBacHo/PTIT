package KTVTKPM.ASummary.DecoratorPattern;

public class BaseDecorator implements Component{
	private Component wrapee;

	public BaseDecorator(Component wrapee) {
		super();
		this.wrapee = wrapee;
	}

	@Override
	public void excute() {
		// TODO Auto-generated method stub
		
	}
}
