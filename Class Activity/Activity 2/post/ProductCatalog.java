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

public class ProductCatalog {

	private Hashtable productDescriptions = new Hashtable();

	private ProductDescription productDescription;

	public ProductCatalog() {
		ProductDescription ps = new ProductDescription( 100, 1,
		                                         "product 1" );
		productDescriptions.put( new Integer( 100 ), ps );
		
		ps = new ProductDescription( 200, 1, "product 2");
		productDescriptions.put( new Integer( 200 ), ps );
	}

	public ProductDescription getDescription( int upc ) {
		return (ProductDescription) productDescriptions.get( 
		                                   new Integer( upc ) );
	}
}
