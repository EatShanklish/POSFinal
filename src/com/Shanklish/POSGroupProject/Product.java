package com.Shanklish.POSGroupProject;

import java.util.ArrayList;

public class Product 
    {
	private String name;
	private String category;
	private String description;
	private int price;
	
	public ArrayList<Product> productList = new ArrayList<Product>();
	
	public Product()
	{
	    name = null;
	    category = null;
	    description = null;
	    price = 0;
	}
	
	public void addToList(Product p)		//Adds latest item to list
	{
	    productList.add(p);
	}
	
	public void printReciept()			// prints list to screen
	{
	    for ( int i = 0 ; i < productList.size() ; i++ )
		{
		    System.out.println(productList.get(i));
		}
	}
	
	
	
	//-----GETTERS AND SETTERS---------
	
	public String getName()
	{
	    return name;
	}
	
	public void setName( String name )
	{
	    this.name = name;
	}
	
	public String getCategory()
	{
	    return category;
	}
	
	public void setCategory( String category )
	{
	    this.category = category;
	}
	
	public String getDescription()
	{
	    return description;
	}
	
	public void setDescription( String description )
	{
	    this.description = description;
	}
	
	public int getPrice()
	{
	    return price;
	}
	
	public void setPrice( int price )
	{
	    this.price = price;
	}
    }
