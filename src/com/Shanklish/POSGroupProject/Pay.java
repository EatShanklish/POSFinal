package com.Shanklish.POSGroupProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Pay {
	protected static double subTotal;
	protected static double tax;
	protected static double grandTotal;


	//fix E
<<<<<<< HEAD
/*	public double calcSubTotal(ArrayList<E> list){
=======
	 public static double calcSubTotal(ArrayList<E> list)
	 {
>>>>>>> 1281bef570f5ed510f418c3bcc1a95614c64fa37
		subTotal =0;
		for( int i = 0; i < list.size; i ++ )
		    {
			 subTotal += list.getPrice(i);
		    }
		
		return subTotal;
<<<<<<< HEAD
	}*/
	public double calcTax(double subTotal){
=======
	}
	
<<<<<<< HEAD
	static public double calcTax(double subTotal){
>>>>>>> 1281bef570f5ed510f418c3bcc1a95614c64fa37
		
=======
	static public double calcTax(double subTotal)
	{
>>>>>>> 5ced8b994a98b63aca535871c99430241fcb6c25
		tax = subTotal * 0.6;
		return tax;
	}
	
	static public double grandTotal(double tax, double subTotal)
	{	
		grandTotal = tax + subTotal;
		return grandTotal;
	}
	
	
	//Will print all the items into the console
	// Pay.viewProducts();
	public static void viewProducts() throws IOException
	{
	    String fileName = "Groceries.txt";
	    String line = null;
	    
	    FileReader fileReader = new FileReader(fileName);
	    BufferedReader bufferedReader = new BufferedReader(fileReader);
	    
	    while( (line = bufferedReader.readLine()) != null)
		{
		    System.out.println(line);
		}
	    
	}

	
	//Take product object as parameter and add it to the text file
	//( pay.printReciept(arraylist.get[i]) )
	public static void printReciept(Product p) throws IOException
	{
	    String fileName = "emptyText.txt";
	    
	    FileWriter fileWriter = new FileWriter(fileName);
	    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);  	   
	    
	    bufferedWriter.append(p.getName() + "\t" + p.getPrice());
	    bufferedWriter.append("\n");
	    
	    bufferedWriter.close();
	    fileWriter.close();
	}
}

