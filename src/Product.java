

public class Product
    {
	private String name;
	private String category;
	private String description;
	private int price;
	
	public Product()
	{
	    name = null;
	    category = null;
	    description = null;
	    price = 0;
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
