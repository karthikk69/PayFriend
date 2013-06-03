package com.paypal.api.payments;
import com.paypal.api.payments.Address;
import com.paypal.core.rest.JSONFormatter;

/**
 * 
 */
public class ShippingAddress extends Address {


	/**
	 * 
	 */ 
	private String recipientName;

	/**
	 * Constructor
	 */
	public ShippingAddress() {

	}	

	/**
	 * Getter for recipientName
	 */
	public String getRecipientName() {
		return recipientName;
	}
	
	/**
	 * Setter for recipientName;
	 */
	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
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