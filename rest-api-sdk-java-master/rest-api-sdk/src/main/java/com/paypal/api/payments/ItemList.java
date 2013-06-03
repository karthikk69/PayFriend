package com.paypal.api.payments;
import java.util.List;
import com.paypal.api.payments.Item;
import com.paypal.api.payments.ShippingAddress;
import com.paypal.api.payments.Resource;
import com.paypal.core.rest.JSONFormatter;

/**
 * 
 */
public class ItemList extends Resource {


	/**
	 * 
	 */ 
	private List<Item> items;

	/**
	 * 
	 */ 
	private ShippingAddress shippingAddress;

	/**
	 * Constructor
	 */
	public ItemList() {

	}	

	/**
	 * Getter for items
	 */
	public List<Item> getItems() {
		return items;
	}
	
	/**
	 * Setter for items;
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}
	/**
	 * Getter for shippingAddress
	 */
	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}
	
	/**
	 * Setter for shippingAddress;
	 */
	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
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