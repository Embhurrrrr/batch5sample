package org.ssglobal.training.codes.itemI;

public class FahrenheitToCelsius {
	
	public static void main(String[] args) {
		// declare and initialize data
		double celsius = 35.5;
		double fahrenheit = 22.6;
		
		// calculate celsius equivalent
		celsius = (fahrenheit - 32) * 5/9;
		
		// output results
		System.out.println(fahrenheit + "\u00B0F = ");
		System.out.println(celsius + "\u00B0C");
	}
}

/*
 * Errors:
 * 1. Spacing of ( String [] args)
 * 2. Data Type of Celsius and Fahrenheit are float.
 * 3. Spacing between the declation and initiation of data, computation of celsius, and the print results
 * 4. In the calculation of Celsius, the "Fahrenheit - 32" must have the parenthesis instead of 5/9.
 * 5. In the calculation of Celsius, the Celsius doesn't need a data type since it is already declared.
 * 6. Unecessary words or characters in the printing. 
 * 7. Class name has "x" at the end which is unecessary in naming.
 * 8. Variables must start in small letters.
 * */
