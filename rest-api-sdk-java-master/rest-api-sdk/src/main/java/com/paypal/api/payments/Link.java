package com.paypal.api.payments;
import com.paypal.api.payments.Resource;
import com.paypal.core.rest.JSONFormatter;

/**
 * 
 */
public class Link extends Resource {


	/**
	 * 
	 */ 
	private String href;

	/**
	 * 
	 */ 
	private String rel;

	/**
	 * 
	 */ 
	private String method;

	/**
	 * Constructor
	 */
	public Link() {

	}	

	/**
	 * Getter for href
	 */
	public String getHref() {
		return href;
	}
	
	/**
	 * Setter for href;
	 */
	public void setHref(String href) {
		this.href = href;
	}
	/**
	 * Getter for rel
	 */
	public String getRel() {
		return rel;
	}
	
	/**
	 * Setter for rel;
	 */
	public void setRel(String rel) {
		this.rel = rel;
	}
	/**
	 * Getter for method
	 */
	public String getMethod() {
		return method;
	}
	
	/**
	 * Setter for method;
	 */
	public void setMethod(String method) {
		this.method = method;
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