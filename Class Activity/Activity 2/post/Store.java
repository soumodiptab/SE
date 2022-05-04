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

public class Store {
	
	private ProductCatalog productCatalog = new ProductCatalog();
	private Register register = new Register( productCatalog );
	
	public Store() {
		// Need to define a constructor
	}
	
	public Register getRegister() {
		return register;
	}
	
	public void addSale() {
		// To Be Defined
	}

}
