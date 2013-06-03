package com.paypal.api.payments;
import java.util.List;
import com.paypal.api.payments.Amount;
import com.paypal.api.payments.Resource;
import com.paypal.core.rest.JSONFormatter;

/**
 * 
 */
public class PaymentExecution extends Resource {


	/**
	 * 
	 */ 
	private String payerId;

	/**
	 * 
	 */ 
	private List<Amount> transactions;

	/**
	 * Constructor
	 */
	public PaymentExecution() {

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
	 * Getter for transactions
	 */
	public List<Amount> getTransactions() {
		return transactions;
	}
	
	/**
	 * Setter for transactions;
	 */
	public void setTransactions(List<Amount> transactions) {
		this.transactions = transactions;
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