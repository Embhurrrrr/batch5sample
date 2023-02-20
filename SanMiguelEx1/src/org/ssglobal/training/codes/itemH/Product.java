package org.ssglobal.training.codes.itemH;

public class Product {
	public String prodName;
	public int prodQty;
	
	public void product(String name) {
		prodName = name;
	}
	
	public void downLoad(int qty) {
		prodQty += qty;
	}
	
	public void upLoad(int qty) {
		prodQty -= qty;
	}
	
	public String print() {
		return prodName + ": " + prodQty + " pieces";
	}
}