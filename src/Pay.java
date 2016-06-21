
public abstract class Pay {
	protected double subTotal;
	protected double tax;
	protected double grandTotal;
	
	abstract void pay();
	abstract void calcSubTotal();
	abstract void calcTax();
	abstract void grandTotal();
	
}
