package com.Shanklish.POSGroupProject;

import java.util.ArrayList;

public abstract class Pay {
	protected static double subTotal;
	protected static double tax;
	protected static double grandTotal;


	//fix E
	static public double calcSubTotal(ArrayList<E> list){
		subTotal =0;
		for( int i = 0; i < list.size; i ++ ){
			 subTotal += list.getPrice(i);
		}
		
		return subTotal;
	}
	static public double calcTax(double subTotal){
		
		tax = subTotal * 0.6;
		
		
		return tax;
	}
	static public double grandTotal(double tax, double subTotal){
		
		grandTotal = tax + subTotal;
		
		return grandTotal;
	}

	
	
	
}

