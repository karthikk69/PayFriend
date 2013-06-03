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
public class Sale extends Resource {


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
	public Sale() {

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
	 * Get call for Sale.
	 * @param accessToken
	 *			AccessToken used for the API call
	 * @param saleId
	 * @HttpMethod GET
	 * @URIpath v1/payments/sale/:saleId
	 * @return Sale
	 */
	public static Sale get(String accessToken, String saleId) throws PayPalRESTException {
		if ((saleId == null) || (saleId.length() <= 0)) {
			throw new IllegalArgumentException("saleId cannot be null or empty");
		}
		String pattern = "v1/payments/sale/{0}";
		Object[] parameters = new Object[] {  saleId };
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		APIContext apiContext = new APIContext(accessToken);
		return PayPalResource.configureAndExecute(apiContext, HttpMethod.GET, resourcePath, payLoad, Sale.class);
	}
	
	/**
	 * Get call for Sale.
	 * @param apiContext
	 *			{@link APIContext} to be used for the call.
	 * @param saleId
	 * @HttpMethod GET
	 * @URIpath v1/payments/sale/:saleId
	 * @return Sale
	 */
	public static Sale get(APIContext apiContext, String saleId) throws PayPalRESTException {
		if ((saleId == null) || (saleId.length() <= 0)) {
			throw new IllegalArgumentException("saleId cannot be null or empty");
		}
		String pattern = "v1/payments/sale/{0}";
		Object[] parameters = new Object[] {  saleId };
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		if (apiContext.getAccessToken() == null || apiContext.getAccessToken().trim().length() <= 0) {
			throw new IllegalArgumentException("AccessToken cannot be null in APIContext");
		}
		return PayPalResource.configureAndExecute(apiContext, HttpMethod.GET, resourcePath, payLoad, Sale.class);
	}

	/**
	 * Refund call for Sale.
	 * @param accessToken
	 *			AccessToken used for the API call
	 * @param refund
	 * @HttpMethod POST
	 * @URIpath v1/payments/sale/:saleId/refund
	 * @return Refund
	 */
	public Refund refund(String accessToken, Refund refund) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		return refund(apiContext, refund);
	}
	
	/**
	 * Refund call for Sale.
	 * @param apiContext
	 *			APIContext used for the API call
	 * @param refund
	 * @HttpMethod POST
	 * @URIpath v1/payments/sale/:saleId/refund
	 * @return Refund
	 */
	public Refund refund(APIContext apiContext, Refund refund) throws PayPalRESTException {
		if (apiContext.getAccessToken() == null || apiContext.getAccessToken().trim().length() <= 0) {
			throw new IllegalArgumentException("AccessToken cannot be null or empty");
		}
		if (refund == null) {
			throw new IllegalArgumentException("refund cannot be null");
		}
		if (this.getId() == null) {
			throw new IllegalArgumentException("Id cannot be null");
		}
		String pattern = "v1/payments/sale/{0}/refund";
		Object[] parameters = new Object[] { this.getId() };
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = refund.toJSON();	
		return PayPalResource.configureAndExecute(apiContext, HttpMethod.POST, resourcePath, payLoad, Refund.class);
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