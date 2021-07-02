package KTVTKPM.ASummary.AbstractFactoryPattern;

import java.io.Serializable;

public class Product implements Serializable{
	private int id;
	private String name;
	
	public Product(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
}
