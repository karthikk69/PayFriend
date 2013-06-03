// #GetCreditCard Sample
// This sample code demonstrates how you 
// retrieve a previously saved 
// Credit Card using the 'vault' API.
// API used: GET /v1/vault/credit-card/{id}
package com.paypal.api.payments.servlet;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.paypal.api.payments.CreditCard;
import com.paypal.api.payments.util.GenerateAccessToken;
import com.paypal.api.payments.util.PaymentStaticToken;
import com.paypal.core.rest.PayPalRESTException;
import com.paypal.core.rest.PayPalResource;


public class LoadServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger
			.getLogger(LoadServlet.class);

	public void init(ServletConfig servletConfig) throws ServletException {
	//	System.out.println("Starting Loading: \n");
		PaymentStaticToken.setPaymentMapping("100004012315458", "CARD-0NV54568JW249031DKGUUEVI");
		PaymentStaticToken.setPaymentMapping("505634200", "CARD-0NV54568JW249031DKGUUEVI");
		PaymentStaticToken.setPaymentMapping("505491097", "CARD-0NV54568JW249031DKGUUEVI");
		PaymentStaticToken.setPaymentMapping("100006012369630", "CARD-0NV54568JW249031DKGUUEVI");
		PaymentStaticToken.setPaymentMapping("1081818796", "CARD-0NV54568JW249031DKGUUEVI");
	
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	// ##GetCreditCardUsingId
	// Call the method with a previously created Credit Card ID
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

	
	}

}
