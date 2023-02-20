package org.ssglobal.training.codes.itemA;

import java.util.Scanner;

public class TestSmallestNumber {

	public static void main(String[] args) {
		SmallestNumber sn = new SmallestNumber();
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("Enter number for a: ");
			sn.setA(scan.nextInt());
			
			System.out.print("Enter number for b: ");
			sn.setB(scan.nextInt());
		
			scan.close();
		
			System.out.println(sn.getSmallestNum());
		}
	}
}