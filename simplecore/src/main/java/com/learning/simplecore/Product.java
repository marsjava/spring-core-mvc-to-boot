package com.learning.simplecore;

public class Product {
	
	private int price;		// primitive field property
	private Computer comp;	// object field property
	
	public Product() {
		System.out.println("Product: Default constructor is invoked.");
	}

//	public Product(int price, Laptop laptop) {
//		System.out.println("Product: Argument constructor is invoked.");
//		this.price = price;
//		this.laptop = laptop;
//	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Computer getComp() {
		return comp;
	}

	public void setComp(Computer comp) {
		this.comp = comp;
	}

	public void code() {
		comp.compile();		
	}
}
