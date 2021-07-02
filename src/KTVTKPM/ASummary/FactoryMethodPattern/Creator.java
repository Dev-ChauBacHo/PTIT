package KTVTKPM.ASummary.FactoryMethodPattern;

public class Creator implements ProductInterface {
	private ProductInterface product;

	public Creator(ProductInterface product) {
		super();
		this.product = product;
	}

    public Creator() {

    }

    public ProductInterface createProduct() {
		//some code
		return product;	
	}

	@Override
	public void getProductByName() {
		// TODO Auto-generated method stub
		
	}
}
