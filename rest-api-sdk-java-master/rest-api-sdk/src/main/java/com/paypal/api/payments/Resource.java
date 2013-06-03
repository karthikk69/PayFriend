package com.paypal.api.payments;
import com.paypal.core.rest.JSONFormatter;

/**
 * 
 */
public class Resource{


	/**
	 * Constructor
	 */
	public Resource() {

	}	





	/**
	 * Returns a JSON string corresponding to object state
	 * 
	 * @return JSON representation
	 */
	public String toJSON() {
		return JSONFormatter.toJSON(this);
	}
	
	@Override
	public String toString() {
		return toJSON();
	}

}