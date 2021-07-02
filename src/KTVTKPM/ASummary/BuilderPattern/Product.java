package KTVTKPM.ASummary.BuilderPattern;

import java.io.Serializable;

public class Product implements Serializable{
	private int id;
	private String name;
	
	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}
