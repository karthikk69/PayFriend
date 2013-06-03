package com.paypal.api.payments;
import com.paypal.api.payments.Amount;
import java.util.List;
import com.paypal.api.payments.Link;
import com.paypal.api.payments.Resource;
import com.paypal.core.rest.PayPalResource;
import com.paypal.core.rest.HttpMethod;
import com.paypal.core.rest.PayPalRESTException;
import com.paypal.core.rest.RESTUtil;
import com.paypal.core.rest.JSONFormatter;
import com.paypal.core.rest.APIContext;
import java.io.File;
import java.io.InputStream;
import java.util.Properties;

/**
 * 
 */
public class Refund extends Resource {


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
	private String saleId;

	/**
	 * 
	 */ 
	private String captureId;

	/**
	 * 
	 */ 
	private String parentPayment;

	/**
	 * 
	 */ 
	private String description;

	/**
	 * 
	 */ 
	private List<Link> links;

	/**
	 * Returns the last request sent to the Service
	 * 
	 * @return Last request sent to the server
	 */
	public static String getLastRequest() {
		return PayPalResource.getLastRequest();
	}

	/**
	 * Returns the last response returned by the Service
	 * 
	 * @return Last response got from the Service
	 */
	public static String getLastResponse() {
		return PayPalResource.getLastResponse();
	}
	
	/**
	 * Initialize using InputStream(of a Properties file)
	 * 
	 * @param is
	 *            InputStream
	 * @throws PayPalRESTException
	 */
	public static void initConfig(InputStream is) throws PayPalRESTException {
		PayPalResource.initConfig(is);
	}

	/**
	 * Initialize using a File(Properties file)
	 * 
	 * @param file
	 *            File object of a properties entity
	 * @throws PayPalRESTException
	 */
	public static void initConfig(File file) throws PayPalRESTException {
		PayPalResource.initConfig(file);
	}

	/**
	 * Initialize using Properties
	 * 
	 * @param properties
	 *            Properties object
	 */
	public static void initConfig(Properties properties) {
		PayPalResource.initConfig(properties);
	}
	

	/**
	 * Constructor
	 */
	public Refund() {

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
	 * Getter for saleId
	 */
	public String getSaleId() {
		return saleId;
	}
	
	/**
	 * Setter for saleId;
	 */
	public void setSaleId(String saleId) {
		this.saleId = saleId;
	}
	/**
	 * Getter for captureId
	 */
	public String getCaptureId() {
		return captureId;
	}
	
	/**
	 * Setter for captureId;
	 */
	public void setCaptureId(String captureId) {
		this.captureId = captureId;
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
	 * Get call for Refund.
	 * @param accessToken
	 *			AccessToken used for the API call
	 * @param refundId
	 * @HttpMethod GET
	 * @URIpath v1/payments/refund/:refundId
	 * @return Refund
	 */
	public static Refund get(String accessToken, String refundId) throws PayPalRESTException {
		if ((refundId == null) || (refundId.length() <= 0)) {
			throw new IllegalArgumentException("refundId cannot be null or empty");
		}
		String pattern = "v1/payments/refund/{0}";
		Object[] parameters = new Object[] {  refundId };
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		APIContext apiContext = new APIContext(accessToken);
		return PayPalResource.configureAndExecute(apiContext, HttpMethod.GET, resourcePath, payLoad, Refund.class);
	}
	
	/**
	 * Get call for Refund.
	 * @param apiContext
	 *			{@link APIContext} to be used for the call.
	 * @param refundId
	 * @HttpMethod GET
	 * @URIpath v1/payments/refund/:refundId
	 * @return Refund
	 */
	public static Refund get(APIContext apiContext, String refundId) throws PayPalRESTException {
		if ((refundId == null) || (refundId.length() <= 0)) {
			throw new IllegalArgumentException("refundId cannot be null or empty");
		}
		String pattern = "v1/payments/refund/{0}";
		Object[] parameters = new Object[] {  refundId };
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		if (apiContext.getAccessToken() == null || apiContext.getAccessToken().trim().length() <= 0) {
			throw new IllegalArgumentException("AccessToken cannot be null in APIContext");
		}
		return PayPalResource.configureAndExecute(apiContext, HttpMethod.GET, resourcePath, payLoad, Refund.class);
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