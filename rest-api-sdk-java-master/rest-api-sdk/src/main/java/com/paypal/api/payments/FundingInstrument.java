package com.paypal.api.payments;
import com.paypal.api.payments.CreditCard;
import com.paypal.api.payments.CreditCardToken;
import com.paypal.api.payments.Resource;
import com.paypal.core.rest.JSONFormatter;

/**
 * 
 */
public class FundingInstrument extends Resource {


	/**
	 * 
	 */ 
	private CreditCard creditCard;

	/**
	 * 
	 */ 
	private CreditCardToken creditCardToken;

	/**
	 * Constructor
	 */
	public FundingInstrument() {

	}	

	/**
	 * Getter for creditCard
	 */
	public CreditCard getCreditCard() {
		return creditCard;
	}
	
	/**
	 * Setter for creditCard;
	 */
	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
	/**
	 * Getter for creditCardToken
	 */
	public CreditCardToken getCreditCardToken() {
		return creditCardToken;
	}
	
	/**
	 * Setter for creditCardToken;
	 */
	public void setCreditCardToken(CreditCardToken creditCardToken) {
		this.creditCardToken = creditCardToken;
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