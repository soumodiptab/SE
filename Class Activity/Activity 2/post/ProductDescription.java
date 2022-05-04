/*
 * Created on Apr 3, 2006
 *
 * Based on Chapter 24 of Craig Larman's Applying UML and Patterns, 
 * 1st Edition, 1998.
 */
package post;

/**
 * @author Craig Larman
 * @author Scott Hawker
 */

public class ProductDescription {
	
	private int 	upc 		= 0;
	private float 	price 		= 0;
	private String description 	= "";
	
	public ProductDescription( int upc, float price, 
	                           String description ) {
		this.upc			= upc;
		this.price			= price;
		this.description 	= description;
	}
	
	public int getUPC() { 
		return upc;
	}
	
	public float getPrice() {
		return price;
	}
	
	public String getDescription() {
		return description;
	}
}
