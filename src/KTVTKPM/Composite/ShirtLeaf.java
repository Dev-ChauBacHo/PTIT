package KTVTKPM.Composite;

public class ShirtLeaf implements ShirtComponent {
	private String name;
	private long size;
	 
	public ShirtLeaf(String name, long size) {
		super();
		this.name = name;
		this.size = size;
	}
	 
	@Override
	public void showName() {
		System.out.println("BookLeaf [name=" + name + ", size=" + size + "]");
		
	}

	@Override
	public long totalType() {
		return size;
	}

}
