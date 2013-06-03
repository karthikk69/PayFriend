package com.paypal.api.payments;
import com.paypal.api.payments.Resource;
import com.paypal.core.rest.JSONFormatter;

/**
 * 
 */
public class CreditCardToken extends Resource {


	/**
	 * 
	 */ 
	private String creditCardId;

	/**
	 * 
	 */ 
	private String payerId;

	/**
	 * Constructor
	 */
	public CreditCardToken() {

	}	

	/**
	 * Getter for creditCardId
	 */
	public String getCreditCardId() {
		return creditCardId;
	}
	
	/**
	 * Setter for creditCardId;
	 */
	public void setCreditCardId(String creditCardId) {
		this.creditCardId = creditCardId;
	}
	/**
	 * Getter for payerId
	 */
	public String getPayerId() {
		return payerId;
	}
	
	/**
	 * Setter for payerId;
	 */
	public void setPayerId(String payerId) {
		this.payerId = payerId;
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