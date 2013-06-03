package com.paypal.api.payments;
import com.paypal.api.payments.Resource;
import com.paypal.core.rest.JSONFormatter;

/**
 * 
 */
public class RedirectUrls extends Resource {


	/**
	 * 
	 */ 
	private String returnUrl;

	/**
	 * 
	 */ 
	private String cancelUrl;

	/**
	 * Constructor
	 */
	public RedirectUrls() {

	}	

	/**
	 * Getter for returnUrl
	 */
	public String getReturnUrl() {
		return returnUrl;
	}
	
	/**
	 * Setter for returnUrl;
	 */
	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}
	/**
	 * Getter for cancelUrl
	 */
	public String getCancelUrl() {
		return cancelUrl;
	}
	
	/**
	 * Setter for cancelUrl;
	 */
	public void setCancelUrl(String cancelUrl) {
		this.cancelUrl = cancelUrl;
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