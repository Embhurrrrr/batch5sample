package org.ssglobal.training.codes.itemA;

public class VeryBuggy {
	
	public static void main(String[] param) {
		String name = "Maria";
		int value = 50;
		
		System.out.println("Hello. Please type your name: %s".formatted(name));
		
		System.out.println("Now type a whole number: %d".formatted(value));
		
		System.out.println("The square of your number is " + value * value);
	}
}
