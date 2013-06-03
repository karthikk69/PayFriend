package com.paypal.api.payments;
import com.paypal.api.payments.Resource;
import com.paypal.core.rest.JSONFormatter;

/**
 * 
 */
public class AmountDetails extends Resource {


	/**
	 * 
	 */ 
	private String subtotal;

	/**
	 * 
	 */ 
	private String tax;

	/**
	 * 
	 */ 
	private String shipping;

	/**
	 * 
	 */ 
	private String fee;

	/**
	 * Constructor
	 */
	public AmountDetails() {

	}	

	/**
	 * Getter for subtotal
	 */
	public String getSubtotal() {
		return subtotal;
	}
	
	/**
	 * Setter for subtotal;
	 */
	public void setSubtotal(String subtotal) {
		this.subtotal = subtotal;
	}
	/**
	 * Getter for tax
	 */
	public String getTax() {
		return tax;
	}
	
	/**
	 * Setter for tax;
	 */
	public void setTax(String tax) {
		this.tax = tax;
	}
	/**
	 * Getter for shipping
	 */
	public String getShipping() {
		return shipping;
	}
	
	/**
	 * Setter for shipping;
	 */
	public void setShipping(String shipping) {
		this.shipping = shipping;
	}
	/**
	 * Getter for fee
	 */
	public String getFee() {
		return fee;
	}
	
	/**
	 * Setter for fee;
	 */
	public void setFee(String fee) {
		this.fee = fee;
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