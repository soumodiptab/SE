/*
 * Created on Apr 3, 2006
 * Based on Chapter 24 of Craig Larman's Applying UML and Patterns, 
 * 1st Edition, 1998.
 */
package post;

/**
 * @author Craig Larman
 * @author Scott Hawker
 *
 */
public class Payment {

	private float amount;
	
	public Payment( float cashTendered ) {
		this.amount = cashTendered;
	}
	
	public float getAmount() {
		return amount;
	}
}
