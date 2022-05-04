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


public class SaleLineItem {
	
	private int quantity;
	private ProductDescription productDesc;
	
	public SaleLineItem( ProductDescription desc, int quantity) {
		this.productDesc 	= desc;
		this.quantity 		= quantity;
	}
	
	public float subtotal() {
		return quantity * productDesc.getPrice();
	}
}
