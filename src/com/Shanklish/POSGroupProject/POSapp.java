package com.Shanklish.POSGroupProject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class POSapp {
	
	//instantiating objects
	static Scanner scan = new Scanner(System.in);
	//declaring variables
	static boolean shop = false;

	public static void main(String[] args) throws IOException {
		System.out.println("Hello. Welcome to your neighborhood grocery story\n");
		System.out.println("Here is a list of the current items we have in stock\n");
		Pay.viewProducts();
		
		
	shop =Validator.getYesNo(scan, "\nWould you like to make a purchase?\n");
	
	
	
		while (shop){
		
			ArrayList <Product> shoppingCart = new ArrayList<Product>();
			shoppingCart.add()
			
			
			
			
			
			shop =  Validator.getYesNo(scan, "Would you like to add anything else to your cart?");
		}
		
		
		
		
		
		
		
		
		
		
		scan.close();
	}
	
	
	

}
