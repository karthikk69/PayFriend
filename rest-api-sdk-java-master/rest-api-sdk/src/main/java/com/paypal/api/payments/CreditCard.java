package com.paypal.api.payments;
import com.paypal.api.payments.Address;
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
public class CreditCard extends Resource {


	/**
	 * 
	 */ 
	private String id;

	/**
	 * 
	 */ 
	private String validUntil;

	/**
	 * 
	 */ 
	private String state;

	/**
	 * 
	 */ 
	private String payerId;

	/**
	 * 
	 */ 
	private String type;

	/**
	 * 
	 */ 
	private String number;

	/**
	 * 
	 */ 
	private String expireMonth;

	/**
	 * 
	 */ 
	private String expireYear;

	/**
	 * 
	 */ 
	private String cvv2;

	/**
	 * 
	 */ 
	private String firstName;

	/**
	 * 
	 */ 
	private String lastName;

	/**
	 * 
	 */ 
	private Address billingAddress;

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
	public CreditCard() {

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
	 * Getter for validUntil
	 */
	public String getValidUntil() {
		return validUntil;
	}
	
	/**
	 * Setter for validUntil;
	 */
	public void setValidUntil(String validUntil) {
		this.validUntil = validUntil;
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
	 * Getter for type
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * Setter for type;
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * Getter for number
	 */
	public String getNumber() {
		return number;
	}
	
	/**
	 * Setter for number;
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	/**
	 * Getter for expireMonth
	 */
	public String getExpireMonth() {
		return expireMonth;
	}
	
	/**
	 * Setter for expireMonth;
	 */
	public void setExpireMonth(String expireMonth) {
		this.expireMonth = expireMonth;
	}
	/**
	 * Getter for expireYear
	 */
	public String getExpireYear() {
		return expireYear;
	}
	
	/**
	 * Setter for expireYear;
	 */
	public void setExpireYear(String expireYear) {
		this.expireYear = expireYear;
	}
	/**
	 * Getter for cvv2
	 */
	public String getCvv2() {
		return cvv2;
	}
	
	/**
	 * Setter for cvv2;
	 */
	public void setCvv2(String cvv2) {
		this.cvv2 = cvv2;
	}
	/**
	 * Getter for firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Setter for firstName;
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * Getter for lastName
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Setter for lastName;
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * Getter for billingAddress
	 */
	public Address getBillingAddress() {
		return billingAddress;
	}
	
	/**
	 * Setter for billingAddress;
	 */
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
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
	 * Create call for CreditCard.
	 * @param accessToken
	 *			AccessToken used for the API call
	 * @HttpMethod POST
	 * @URIpath v1/vault/credit-card
	 * @return CreditCard
	 */
	public CreditCard create(String accessToken) throws PayPalRESTException {
		APIContext apiContext = new APIContext(accessToken);
		return create(apiContext);
	}
	
	/**
	 * Create call for CreditCard.
	 * @param apiContext
	 *			APIContext used for the API call
	 * @HttpMethod POST
	 * @URIpath v1/vault/credit-card
	 * @return CreditCard
	 */
	public CreditCard create(APIContext apiContext) throws PayPalRESTException {
		if (apiContext.getAccessToken() == null || apiContext.getAccessToken().trim().length() <= 0) {
			throw new IllegalArgumentException("AccessToken cannot be null or empty");
		}
		String resourcePath = "v1/vault/credit-card";
		String payLoad = this.toJSON();	
		return PayPalResource.configureAndExecute(apiContext, HttpMethod.POST, resourcePath, payLoad, CreditCard.class);
	}

	/**
	 * Get call for CreditCard.
	 * @param accessToken
	 *			AccessToken used for the API call
	 * @param creditCardId
	 * @HttpMethod GET
	 * @URIpath v1/vault/credit-card/:creditCardId
	 * @return CreditCard
	 */
	public static CreditCard get(String accessToken, String creditCardId) throws PayPalRESTException {
		if ((creditCardId == null) || (creditCardId.length() <= 0)) {
			throw new IllegalArgumentException("creditCardId cannot be null or empty");
		}
		String pattern = "v1/vault/credit-card/{0}";
		Object[] parameters = new Object[] {  creditCardId };
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		APIContext apiContext = new APIContext(accessToken);
		return PayPalResource.configureAndExecute(apiContext, HttpMethod.GET, resourcePath, payLoad, CreditCard.class);
	}
	
	/**
	 * Get call for CreditCard.
	 * @param apiContext
	 *			{@link APIContext} to be used for the call.
	 * @param creditCardId
	 * @HttpMethod GET
	 * @URIpath v1/vault/credit-card/:creditCardId
	 * @return CreditCard
	 */
	public static CreditCard get(APIContext apiContext, String creditCardId) throws PayPalRESTException {
		if ((creditCardId == null) || (creditCardId.length() <= 0)) {
			throw new IllegalArgumentException("creditCardId cannot be null or empty");
		}
		String pattern = "v1/vault/credit-card/{0}";
		Object[] parameters = new Object[] {  creditCardId };
		String resourcePath = RESTUtil.formatURIPath(pattern, parameters);
		String payLoad = "";
		if (apiContext.getAccessToken() == null || apiContext.getAccessToken().trim().length() <= 0) {
			throw new IllegalArgumentException("AccessToken cannot be null in APIContext");
		}
		return PayPalResource.configureAndExecute(apiContext, HttpMethod.GET, resourcePath, payLoad, CreditCard.class);
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