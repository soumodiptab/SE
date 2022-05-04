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

public class Register {
	
	private ProductCatalog productCatalog;
	private Sale sale;
	
	public Register( ProductCatalog catalog ) {
		productCatalog = catalog;
	}
	
	//  when a sale becomes complete, the system goes to a 
	//  state where it can accept payment	
	public void endSale() {
		sale.becomeComplete();
	}
	
	public void enterItem( int upc, int quantity ) {
		if ( isNewSale() ) {
			sale = new Sale();
		}
		ProductDescription desc = 
						productCatalog.getDescription( upc );
		sale.makeLineItem( desc, quantity );
	}
	
	public void makePayment( float cashTendered ) {
		sale.makePayment( cashTendered );
		sale.getBalance();
	}
	
	private boolean isNewSale() {
		return ( sale == null ) || (sale.isComplete() );
	}
}
