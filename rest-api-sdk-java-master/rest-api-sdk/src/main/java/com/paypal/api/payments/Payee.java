package com.paypal.api.payments;
import com.paypal.api.payments.Resource;
import com.paypal.core.rest.JSONFormatter;

/**
 * 
 */
public class Payee extends Resource {


	/**
	 * 
	 */ 
	private String merchantId;

	/**
	 * 
	 */ 
	private String email;

	/**
	 * 
	 */ 
	private String phone;

	/**
	 * Constructor
	 */
	public Payee() {

	}	

	/**
	 * Getter for merchantId
	 */
	public String getMerchantId() {
		return merchantId;
	}
	
	/**
	 * Setter for merchantId;
	 */
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	/**
	 * Getter for email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Setter for email;
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * Getter for phone
	 */
	public String getPhone() {
		return phone;
	}
	
	/**
	 * Setter for phone;
	 */
	public void setPhone(String phone) {
		this.phone = phone;
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