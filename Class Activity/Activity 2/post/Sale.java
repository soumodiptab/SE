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

import java.util.*;

public class Sale {
	private Vector 	lineItems 	= new Vector();
	private Date 	date 		= new Date();
	private boolean isComplete 	= false;
	private Payment payment;
	
	public Sale() {
		// default constructor
	}
	
	public float getBalance() {
		return payment.getAmount() - total();
	}
	
	public void becomeComplete() {
		isComplete = true;
	}
	
	public boolean isComplete() {
		return isComplete;
	}
	
	public void makeLineItem( ProductDescription spec, int quantity ) {
		lineItems.addElement( new SaleLineItem( spec, quantity) );
	}
	
	private float total() {
		float total = 0;
		Enumeration e = lineItems.elements();
		while (e.hasMoreElements() ) {
			total += ((SaleLineItem) e.nextElement()).subtotal();
		}
		return total;
	}
	
	public void makePayment( float cashTendered ) {
		payment = new Payment( cashTendered );
	}
}
