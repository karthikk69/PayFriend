package com.paypal.api.payments;
import com.paypal.api.payments.AmountDetails;
import com.paypal.api.payments.Resource;
import com.paypal.core.rest.JSONFormatter;

/**
 * 
 */
public class Amount extends Resource {


	/**
	 * 
	 */ 
	private String total;

	/**
	 * 
	 */ 
	private String currency;

	/**
	 * 
	 */ 
	private AmountDetails details;

	/**
	 * Constructor
	 */
	public Amount() {

	}	

	/**
	 * Getter for total
	 */
	public String getTotal() {
		return total;
	}
	
	/**
	 * Setter for total;
	 */
	public void setTotal(String total) {
		this.total = total;
	}
	/**
	 * Getter for currency
	 */
	public String getCurrency() {
		return currency;
	}
	
	/**
	 * Setter for currency;
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	/**
	 * Getter for details
	 */
	public AmountDetails getDetails() {
		return details;
	}
	
	/**
	 * Setter for details;
	 */
	public void setDetails(AmountDetails details) {
		this.details = details;
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