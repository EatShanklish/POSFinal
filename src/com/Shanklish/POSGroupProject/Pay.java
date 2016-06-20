package com.Shanklish.POSGroupProject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Pay {
	protected static double subTotal;
	protected static double tax;
	protected static double grandTotal;


	//fix E
	 public static double calcSubTotal(ArrayList<E> list)
	 {
		subTotal =0;
		for( int i = 0; i < list.size; i ++ )
		    {
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

	
	//Take product object as parameter and add it to the text file
	//( pay.printReciept(arraylist.get[i]) )
	public static void printReciept(Product p) throws IOException
	{
	    String fileName = "emptyText.txt";
	    
	    FileWriter fileWriter = new FileWriter(fileName);
	    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);  	   
	    
	    bufferedWriter.append(p.getName() + "\t" + p.getPrice());
	}
}

