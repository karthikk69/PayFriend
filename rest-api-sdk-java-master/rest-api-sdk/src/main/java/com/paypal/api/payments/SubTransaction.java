package com.paypal.api.payments;
import com.paypal.api.payments.Sale;
import com.paypal.api.payments.Authorization;
import com.paypal.api.payments.Refund;
import com.paypal.api.payments.Capture;
import com.paypal.api.payments.Resource;
import com.paypal.core.rest.JSONFormatter;

/**
 * 
 */
public class SubTransaction extends Resource {


	/**
	 * 
	 */ 
	private Sale sale;

	/**
	 * 
	 */ 
	private Authorization authorization;

	/**
	 * 
	 */ 
	private Refund refund;

	/**
	 * 
	 */ 
	private Capture capture;

	/**
	 * Constructor
	 */
	public SubTransaction() {

	}	

	/**
	 * Getter for sale
	 */
	public Sale getSale() {
		return sale;
	}
	
	/**
	 * Setter for sale;
	 */
	public void setSale(Sale sale) {
		this.sale = sale;
	}
	/**
	 * Getter for authorization
	 */
	public Authorization getAuthorization() {
		return authorization;
	}
	
	/**
	 * Setter for authorization;
	 */
	public void setAuthorization(Authorization authorization) {
		this.authorization = authorization;
	}
	/**
	 * Getter for refund
	 */
	public Refund getRefund() {
		return refund;
	}
	
	/**
	 * Setter for refund;
	 */
	public void setRefund(Refund refund) {
		this.refund = refund;
	}
	/**
	 * Getter for capture
	 */
	public Capture getCapture() {
		return capture;
	}
	
	/**
	 * Setter for capture;
	 */
	public void setCapture(Capture capture) {
		this.capture = capture;
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