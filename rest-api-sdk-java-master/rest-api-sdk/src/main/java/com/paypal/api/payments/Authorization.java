package com.paypal.api.payments;
import com.paypal.api.payments.Amount;
import java.util.List;
import com.paypal.api.payments.Link;
import com.paypal.api.payments.Resource;
import com.paypal.core.rest.JSONFormatter;

/**
 * 
 */
public class Authorization extends Resource {


	/**
	 * 
	 */ 
	private String id;

	/**
	 * 
	 */ 
	private String createTime;

	/**
	 * 
	 */ 
	private String updateTime;

	/**
	 * 
	 */ 
	private String state;

	/**
	 * 
	 */ 
	private Amount amount;

	/**
	 * 
	 */ 
	private String parentPayment;

	/**
	 * 
	 */ 
	private List<Link> links;

	/**
	 * Constructor
	 */
	public Authorization() {

	}	

	/**
	 * Getter for id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * Setter for id;
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * Getter for createTime
	 */
	public String getCreateTime() {
		return createTime;
	}
	
	/**
	 * Setter for createTime;
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	/**
	 * Getter for updateTime
	 */
	public String getUpdateTime() {
		return updateTime;
	}
	
	/**
	 * Setter for updateTime;
	 */
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
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
	 * Getter for parentPayment
	 */
	public String getParentPayment() {
		return parentPayment;
	}
	
	/**
	 * Setter for parentPayment;
	 */
	public void setParentPayment(String parentPayment) {
		this.parentPayment = parentPayment;
	}
	/**
	 * Getter for links
	 */
	public List<Link> getLinks() {
		return links;
	}
	
	/**
	 * Setter for links;
	 */
	public void setLinks(List<Link> links) {
		this.links = links;
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