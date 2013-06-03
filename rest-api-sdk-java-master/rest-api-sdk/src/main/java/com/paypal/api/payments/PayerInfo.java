package com.paypal.api.payments;
import com.paypal.api.payments.Address;
import com.paypal.api.payments.Resource;
import com.paypal.core.rest.JSONFormatter;

/**
 * 
 */
public class PayerInfo extends Resource {


	/**
	 * 
	 */ 
	private String email;

	/**
	 * 
	 */ 
	private String firstName;

	/**
	 * 
	 */ 
	private String lastName;

	/**
	 * 
	 */ 
	private String payerId;

	/**
	 * 
	 */ 
	private Address shippingAddress;

	/**
	 * 
	 */ 
	private String phone;

	/**
	 * Constructor
	 */
	public PayerInfo() {

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
	 * Getter for firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Setter for firstName;
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * Getter for lastName
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Setter for lastName;
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	 * Getter for shippingAddress
	 */
	public Address getShippingAddress() {
		return shippingAddress;
	}
	
	/**
	 * Setter for shippingAddress;
	 */
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
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