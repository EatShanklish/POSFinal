package com.Shanklish.POSGroupProject;

import java.util.ArrayList;

public abstract class Pay {
	protected double subTotal;
	protected double tax;
	protected double grandTotal;


	//fix E
/*	public double calcSubTotal(ArrayList<E> list){
		subTotal =0;
		for( int i = 0; i < list.size; i ++ ){
			 subTotal += list.getPrice(i);
		}
		
		return subTotal;
	}*/
	public double calcTax(double subTotal){
		
		tax = subTotal * 0.6;
		
		
		return tax;
	}
	public double grandTotal(double tax, double subTotal){
		
		grandTotal = tax + subTotal;
		
		return grandTotal;
	}

	
}

