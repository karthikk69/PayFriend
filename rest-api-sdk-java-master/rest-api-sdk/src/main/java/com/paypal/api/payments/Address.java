package com.paypal.api.payments;
import com.paypal.api.payments.Resource;
import com.paypal.core.rest.JSONFormatter;

/**
 * 
 */
public class Address extends Resource {


	/**
	 * 
	 */ 
	private String line1;

	/**
	 * 
	 */ 
	private String line2;

	/**
	 * 
	 */ 
	private String city;

	/**
	 * 
	 */ 
	private String state;

	/**
	 * 
	 */ 
	private String postalCode;

	/**
	 * 
	 */ 
	private String countryCode;

	/**
	 * 
	 */ 
	private String type;

	/**
	 * 
	 */ 
	private String phone;

	/**
	 * Constructor
	 */
	public Address() {

	}	

	/**
	 * Getter for line1
	 */
	public String getLine1() {
		return line1;
	}
	
	/**
	 * Setter for line1;
	 */
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	/**
	 * Getter for line2
	 */
	public String getLine2() {
		return line2;
	}
	
	/**
	 * Setter for line2;
	 */
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	/**
	 * Getter for city
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * Setter for city;
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * Getter for state
	 */
	public String getState() {
		return state;
	}
	
	/**
	 * Setter for state;
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * Getter for postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}
	
	/**
	 * Setter for postalCode;
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	/**
	 * Getter for countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}
	
	/**
	 * Setter for countryCode;
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	/**
	 * Getter for type
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * Setter for type;
	 */
	public void setType(String type) {
		this.type = type;
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