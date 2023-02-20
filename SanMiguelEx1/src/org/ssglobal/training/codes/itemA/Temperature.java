package org.ssglobal.training.codes.itemA;

public class Temperature {
	
	public static void main(String[] args) {
		double tempC = 0.0;
		convertion(tempC);
	}
	
	public static void convertion(double tempC) {
		double tempF = 98.6;
		tempC = (tempF - 32) * 5 / 9;
		
		System.out.println("Body temp in Celcius is: %.2f".formatted(tempC));
	}
}
