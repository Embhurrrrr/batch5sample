package org.ssglobal.training.codes.itemA;

public class SmallestNumber {
	private int a; 
	private int b;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public String getSmallestNum() {
		int smaller = minimum(a, b);
		
		if (smaller == a) {
			return "a is the smallest";
		} else {
			return "b is the smallest";
		}
	}
	
	public static int minimum(int a, int b) {
		if (a < b) {
			return a;
		} else {
			return b;
		}
	}
}