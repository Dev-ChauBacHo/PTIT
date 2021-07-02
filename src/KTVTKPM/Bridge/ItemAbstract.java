package KTVTKPM.Bridge;

public abstract class ItemAbstract {
	private int id;
	private String name;
	private Category category;

	public void setCategory(Category category) {
		this.category = category;
	}
}
