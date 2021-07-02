package KTVTKPM.ASummary.ProxyPattern;

public class ProxyService implements InterfaceService {
	private Service service;

	
	public ProxyService(Service service) {
		super();
		this.service = service;
	}


	@Override
	public void operation() {
		// TODO Auto-generated method stub
		
	}
	
	public void checkAccess() {
		//some code
	}
}
