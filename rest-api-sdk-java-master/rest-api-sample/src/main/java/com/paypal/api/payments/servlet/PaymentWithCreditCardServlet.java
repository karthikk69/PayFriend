// #CreatePayment using credit card Sample
// This sample code demonstrate how you can process
// a payment with a credit card.
// API used: /v1/payments/payment
package com.paypal.api.payments.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.paypal.api.payments.*;
import com.paypal.api.payments.util.*;
import com.paypal.core.rest.*;

/**
 * @author lvairamani
 * 
 */
public class PaymentWithCreditCardServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger
			.getLogger(PaymentWithCreditCardServlet.class);

	public void init(ServletConfig servletConfig) throws ServletException {
		// ##Load Configuration
		// Load SDK configuration for
		// the resource. This intialization code can be
		// done as Init Servlet.
		InputStream is = PaymentWithCreditCardServlet.class
				.getResourceAsStream("/sdk_config.properties");
		try {
			PayPalResource.initConfig(is);
		} catch (PayPalRESTException e) {
			LOGGER.fatal(e.getMessage());
		}

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	// ##Create
	// Sample showing to create a Payment using
	// CreditCard as a FundingInstrument
/*	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
System.out.println("Reached servlet"+req.getParameter("First_Name"));
		// ###Address
		// Base Address object used as shipping or billing
		// address in a payment. [Optional]
		Address billingAddress = new Address();
		billingAddress.setCity("Johnstown");
		billingAddress.setCountryCode("US");
		billingAddress.setLine1("52 N Main ST");
		billingAddress.setPostalCode("43210");
		billingAddress.setState("OH");

		// ###CreditCard
		// A resource representing a credit card that can be
		// used to fund a payment.
		CreditCard creditCard = new CreditCard();
		creditCard.setBillingAddress(billingAddress);
		creditCard.setCvv2("874");
		creditCard.setExpireMonth("11");
		creditCard.setExpireYear("2018");
		creditCard.setFirstName("Joe");
		creditCard.setLastName("Shopper");
		creditCard.setNumber("4417119669820331");
		creditCard.setType("visa");

		// ###AmountDetails
		// Let's you specify details of a payment amount.
		AmountDetails amountDetails = new AmountDetails();
		amountDetails.setShipping("1");
		amountDetails.setSubtotal("5");
		amountDetails.setTax("1");

		// ###Amount
		// Let's you specify a payment amount.
		Amount amount = new Amount();
		amount.setCurrency("USD");
		// Total must be equal to sum of shipping, tax and subtotal.
		amount.setTotal("7");
		amount.setDetails(amountDetails);

		// ###Transaction
		// A transaction defines the contract of a
		// payment - what is the payment for and who
		// is fulfilling it. Transaction is created with
		// a `Payee` and `Amount` types
		Transaction transaction = new Transaction();
		transaction.setAmount(amount);
		transaction
				.setDescription("This is the payment transaction description.");

		// The Payment creation API requires a list of
		// Transaction; add the created `Transaction`
		// to a List
		List<Transaction> transactions = new ArrayList<Transaction>();
		transactions.add(transaction);

		// ###FundingInstrument
		// A resource representing a Payeer's funding instrument.
		// Use a Payer ID (A unique identifier of the payer generated
		// and provided by the facilitator. This is required when
		// creating or using a tokenized funding instrument)
		// and the `CreditCardDetails`
		FundingInstrument fundingInstrument = new FundingInstrument();
		fundingInstrument.setCreditCard(creditCard);

		// The Payment creation API requires a list of
		// FundingInstrument; add the created `FundingInstrument`
		// to a List
		List<FundingInstrument> fundingInstrumentList = new ArrayList<FundingInstrument>();
		fundingInstrumentList.add(fundingInstrument);

		// ###Payer
		// A resource representing a Payer that funds a payment
		// Use the List of `FundingInstrument` and the Payment Method
		// as 'credit_card'
		Payer payer = new Payer();
		payer.setFundingInstruments(fundingInstrumentList);
		payer.setPaymentMethod("credit_card");

		// ###Payment
		// A Payment Resource; create one using
		// the above types and intent as 'sale'
		Payment payment = new Payment();
		payment.setIntent("sale");
		payment.setPayer(payer);
		payment.setTransactions(transactions);

		try {
			// ###AccessToken
			// Retrieve the access token from
			// OAuthTokenCredential by passing in
			// ClientID and ClientSecret
			// It is not mandatory to generate Access Token on a per call basis.
			// Typically the access token can be generated once and
			// reused within the expiry window
			String accessToken = GenerateAccessToken.getAccessToken();

			// ### Api Context
			// Pass in a `ApiContext` object to authenticate 
			// the call and to send a unique request id 
			// (that ensures idempotency). The SDK generates
			// a request id if you do not pass one explicitly. 
			APIContext apiContext = new APIContext(accessToken);
			// Use this variant if you want to pass in a request id  
			// that is meaningful in your application, ideally 
			// a order id.
			/* 
			 * String requestId = Long.toString(System.nanoTime();
			 * APIContext apiContext = new APIContext(accessToken, requestId ));
			 */
			
			// Create a payment by posting to the APIService
			// using a valid AccessToken
			// The return object contains the status;
	/*		Payment createdPayment = payment.create(apiContext);
			req.setAttribute("response", Payment.getLastResponse());
			LOGGER.info("Created payment with id = " + createdPayment.getId()
					+ " and status = " + createdPayment.getState());
		} catch (PayPalRESTException e) {
			req.setAttribute("error", e.getMessage());
		}

		req.setAttribute("request", Payment.getLastRequest());

		req.getRequestDispatcher("response.jsp").forward(req, resp);
	}*/
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
System.out.println("Reached servlet"+req.getParameter("First_Name"));
		// ###Address
		// Base Address object used as shipping or billing
		// address in a payment. [Optional]
		Address billingAddress = new Address();
		billingAddress.setCity(req.getParameter("City"));
		billingAddress.setCountryCode("US");
		billingAddress.setLine1(req.getParameter("Address"));
		billingAddress.setPostalCode(req.getParameter("Zip"));
		billingAddress.setState(req.getParameter("State"));

		// ###CreditCard
		// A resource representing a credit card that can be
		// used to fund a payment.  
		CreditCard creditCard = new CreditCard();
		creditCard.setBillingAddress(billingAddress);
		creditCard.setCvv2(req.getParameter("Card_Code"));
		creditCard.setExpireMonth(req.getParameter("Exp_Month"));
		creditCard.setExpireYear(req.getParameter("Exp_Year"));
		creditCard.setFirstName(req.getParameter("First_Name"));
		creditCard.setLastName(req.getParameter("Last_Name"));
		creditCard.setNumber(req.getParameter("Card_Num"));
		creditCard.setType(req.getParameter("card_type"));
		
		// ###AmountDetails
		// Let's you specify details of a payment amount.
		AmountDetails amountDetails = new AmountDetails();
		amountDetails.setShipping("1");
		amountDetails.setSubtotal(req.getParameter("Amount"));
		amountDetails.setTax("1");
		
		// ###Amount
		// Let's you specify a payment amount.
		Amount amount = new Amount();
		amount.setCurrency("USD");
		// Total must be equal to sum of shipping, tax and subtotal.
		amount.setTotal(String.valueOf((Integer.parseInt(req.getParameter("Amount"))+2)));
		amount.setDetails(amountDetails);

		// ###Transaction
		// A transaction defines the contract of a
		// payment - what is the payment for and who
		// is fulfilling it. Transaction is created with
		// a `Payee` and `Amount` types
		Transaction transaction = new Transaction();
		transaction.setAmount(amount);
		transaction
				.setDescription("This is the payment transaction description.");

		// The Payment creation API requires a list of
		// Transaction; add the created `Transaction`
		// to a List
		List<Transaction> transactions = new ArrayList<Transaction>();
		transactions.add(transaction);

		// ###FundingInstrument
		// A resource representing a Payeer's funding instrument.
		// Use a Payer ID (A unique identifier of the payer generated
		// and provided by the facilitator. This is required when
		// creating or using a tokenized funding instrument)
		// and the `CreditCardDetails`
		FundingInstrument fundingInstrument = new FundingInstrument();
		fundingInstrument.setCreditCard(creditCard);

		// The Payment creation API requires a list of
		// FundingInstrument; add the created `FundingInstrument`
		// to a List
		List<FundingInstrument> fundingInstrumentList = new ArrayList<FundingInstrument>();
		fundingInstrumentList.add(fundingInstrument);

		// ###Payer
		// A resource representing a Payer that funds a payment
		// Use the List of `FundingInstrument` and the Payment Method
		// as 'credit_card'
		Payer payer = new Payer();
		payer.setFundingInstruments(fundingInstrumentList);
		payer.setPaymentMethod("credit_card");

		// ###Payment
		// A Payment Resource; create one using
		// the above types and intent as 'sale'
		Payment payment = new Payment();
		payment.setIntent("sale");
		payment.setPayer(payer);
		payment.setTransactions(transactions);

		try {
			// ###AccessToken
			// Retrieve the access token from
			// OAuthTokenCredential by passing in
			// ClientID and ClientSecret
			// It is not mandatory to generate Access Token on a per call basis.
			// Typically the access token can be generated once and
			// reused within the expiry window
			String accessToken = GenerateAccessToken.getAccessToken();

			// ### Api Context
			// Pass in a `ApiContext` object to authenticate 
			// the call and to send a unique request id 
			// (that ensures idempotency). The SDK generates
			// a request id if you do not pass one explicitly. 
			APIContext apiContext = new APIContext(accessToken);
			// Use this variant if you want to pass in a request id  
			// that is meaningful in your application, ideally 
			// a order id.
			/* 
			 * String requestId = Long.toString(System.nanoTime();
			 * APIContext apiContext = new APIContext(accessToken, requestId ));
			 */
			
			// Create a payment by posting to the APIService
			// using a valid AccessToken
			// The return object contains the status;
			Payment createdPayment = payment.create(apiContext);
			req.setAttribute("response", Payment.getLastResponse());
			LOGGER.info("Created payment with id = " + createdPayment.getId()
					+ " and status = " + createdPayment.getState());
		//	ObjectMapper mapper = new ObjectMapper(); 
	//		Capture cap = new ObjectMapper().readValue(Payment.getLastResponse(), Capture.class);

		} catch (PayPalRESTException e) {
			e.printStackTrace();
		    System.out.println("In paypalrestexceptionblock"+e.getLocalizedMessage());
			req.setAttribute("error",e.getLocalizedMessage());
		/*	int idx = e.getLocalizedMessage().indexOf("{");
			String tail = e.getLocalizedMessage().substring(idx + 1);
			Map<String,String> map = new HashMap<String,String>();

			ObjectMapper mapper = new ObjectMapper();

			map = mapper.readValue(tail, HashMap.class);
	    System.out.println("Got " + map.toString()); */
			
		} catch (Exception e){
			e.printStackTrace();
			req.setAttribute("error","Transaction could not be fulfilled");
			System.out.println("In normal exceptionblock"+e.getLocalizedMessage());
			
			//req.setAttribute("error", e.getMessage());
			
		}

		req.setAttribute("request", Payment.getLastRequest());
		
		req.getRequestDispatcher("response.jsp").forward(req, resp);
	}
	public static String[] splitOnFirst(String str, char c) {
	    int idx = str.indexOf(c);
	    String head = str.substring(0, idx);
	    String tail = str.substring(idx + 1);
	    return new String[] { head, tail} ;
	}

}
