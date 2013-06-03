package com.paypal.api.payments;
import com.paypal.api.payments.Resource;
import com.paypal.core.rest.JSONFormatter;

/**
 * 
 */
public class Item extends Resource {


	/**
	 * 
	 */ 
	private String name;

	/**
	 * 
	 */ 
	private String sku;

	/**
	 * 
	 */ 
	private String price;

	/**
	 * 
	 */ 
	private String currency;

	/**
	 * 
	 */ 
	private String quantity;

	/**
	 * Constructor
	 */
	public Item() {

	}	

	/**
	 * Getter for name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Setter for name;
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Getter for sku
	 */
	public String getSku() {
		return sku;
	}
	
	/**
	 * Setter for sku;
	 */
	public void setSku(String sku) {
		this.sku = sku;
	}
	/**
	 * Getter for price
	 */
	public String getPrice() {
		return price;
	}
	
	/**
	 * Setter for price;
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	/**
	 * Getter for currency
	 */
	public String getCurrency() {
		return currency;
	}
	
	/**
	 * Setter for currency;
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	/**
	 * Getter for quantity
	 */
	public String getQuantity() {
		return quantity;
	}
	
	/**
	 * Setter for quantity;
	 */
	public void setQuantity(String quantity) {
		this.quantity = quantity;
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