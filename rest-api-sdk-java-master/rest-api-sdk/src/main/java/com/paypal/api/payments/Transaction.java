package com.paypal.api.payments;
import com.paypal.api.payments.Amount;
import com.paypal.api.payments.Payee;
import com.paypal.api.payments.ItemList;
import java.util.List;
import com.paypal.api.payments.SubTransaction;
import com.paypal.api.payments.Resource;
import com.paypal.core.rest.JSONFormatter;

/**
 * 
 */
public class Transaction extends Resource {


	/**
	 * 
	 */ 
	private Amount amount;

	/**
	 * 
	 */ 
	private Payee payee;

	/**
	 * 
	 */ 
	private String description;

	/**
	 * 
	 */ 
	private ItemList itemList;

	/**
	 * 
	 */ 
	private List<SubTransaction> relatedResources;

	/**
	 * Constructor
	 */
	public Transaction() {

	}	

	/**
	 * Getter for amount
	 */
	public Amount getAmount() {
		return amount;
	}
	
	/**
	 * Setter for amount;
	 */
	public void setAmount(Amount amount) {
		this.amount = amount;
	}
	/**
	 * Getter for payee
	 */
	public Payee getPayee() {
		return payee;
	}
	
	/**
	 * Setter for payee;
	 */
	public void setPayee(Payee payee) {
		this.payee = payee;
	}
	/**
	 * Getter for description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Setter for description;
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * Getter for itemList
	 */
	public ItemList getItemList() {
		return itemList;
	}
	
	/**
	 * Setter for itemList;
	 */
	public void setItemList(ItemList itemList) {
		this.itemList = itemList;
	}
	/**
	 * Getter for relatedResources
	 */
	public List<SubTransaction> getRelatedResources() {
		return relatedResources;
	}
	
	/**
	 * Setter for relatedResources;
	 */
	public void setRelatedResources(List<SubTransaction> relatedResources) {
		this.relatedResources = relatedResources;
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