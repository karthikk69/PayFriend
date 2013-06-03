package com.paypal.api.payments;
import java.util.List;
import com.paypal.api.payments.Payment;
import com.paypal.api.payments.Resource;
import com.paypal.core.rest.JSONFormatter;

/**
 * 
 */
public class PaymentHistory extends Resource {


	/**
	 * 
	 */ 
	private List<Payment> payments;

	/**
	 * 
	 */ 
	private Integer count;

	/**
	 * 
	 */ 
	private String nextId;

	/**
	 * Constructor
	 */
	public PaymentHistory() {

	}	

	/**
	 * Getter for payments
	 */
	public List<Payment> getPayments() {
		return payments;
	}
	
	/**
	 * Setter for payments;
	 */
	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}
	/**
	 * Getter for count
	 */
	public Integer getCount() {
		return count;
	}
	
	/**
	 * Setter for count;
	 */
	public void setCount(Integer count) {
		this.count = count;
	}
	/**
	 * Getter for nextId
	 */
	public String getNextId() {
		return nextId;
	}
	
	/**
	 * Setter for nextId;
	 */
	public void setNextId(String nextId) {
		this.nextId = nextId;
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