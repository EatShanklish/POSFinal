package com.Shanklish.POSGroupProject;

import java.util.Scanner;

public class angelaTest {

	public static void main(String[] args) {
		double input;
		
	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome! You owe us 30.15. Please pay now.");
		input = scan.nextInt();
		
		Cash payment1 = new Cash(input);
		
		
		System.out.println(payment1.calcChange(input));

	}

}
