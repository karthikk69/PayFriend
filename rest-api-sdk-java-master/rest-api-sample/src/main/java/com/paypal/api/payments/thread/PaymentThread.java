package com.paypal.api.payments.thread;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.paypal.api.payments.Amount;
import com.paypal.api.payments.AmountDetails;
import com.paypal.api.payments.CreditCardToken;
import com.paypal.api.payments.FundingInstrument;
import com.paypal.api.payments.Payer;
import com.paypal.api.payments.Payment;
import com.paypal.api.payments.Transaction;
import com.paypal.api.payments.servlet.GetPaymentHistoryServlet;
import com.paypal.api.payments.servlet.PaymentWithSavedCardServlet;
import com.paypal.api.payments.util.GenerateAccessToken;
import com.paypal.api.payments.util.PaymentDetails;
import com.paypal.api.payments.util.PaymentStaticToken;
import com.paypal.core.rest.APIContext;
import com.paypal.core.rest.PayPalRESTException;
import com.paypal.core.rest.PayPalResource;

public class PaymentThread 	extends Thread { 
private PaymentDetails pd;
		  public PaymentThread (PaymentDetails s) { 
			  this.pd = s; 
			  InputStream is = GetPaymentHistoryServlet.class
						.getResourceAsStream("/sdk_config.properties");
				try {
					PayPalResource.initConfig(is);
				} catch (PayPalRESTException e) {
					e.printStackTrace();
				}
		  }

		  public void run() { 
		

			try {
				
				CreditCardToken creditCardToken = new CreditCardToken();
				creditCardToken.setCreditCardId(PaymentStaticToken.getPaymentValue(pd.getId()));

				AmountDetails amountDetails = new AmountDetails();
				amountDetails.setShipping("0");
				amountDetails.setSubtotal(pd.getValue().trim());
				amountDetails.setTax("0");

				Amount amount = new Amount();
				amount.setCurrency("USD");
				// Total must be equal to the sum of shipping, tax and subtotal.
				amount.setTotal(pd.getValue().trim());
				amount.setDetails(amountDetails);

				Transaction transaction = new Transaction();
				transaction.setAmount(amount);
				transaction
						.setDescription("This is the payment transaction description.");

				List<Transaction> transactions = new ArrayList<Transaction>();
				transactions.add(transaction);

			
				FundingInstrument fundingInstrument = new FundingInstrument();
				fundingInstrument.setCreditCardToken(creditCardToken);

		
				List<FundingInstrument> fundingInstrumentList = new ArrayList<FundingInstrument>();
				fundingInstrumentList.add(fundingInstrument);

			
				Payer payer = new Payer();
				payer.setFundingInstruments(fundingInstrumentList);
				payer.setPaymentMethod("credit_card");

			
				Payment payment = new Payment();
				payment.setIntent("sale");
				payment.setPayer(payer);
				payment.setTransactions(transactions);

					String accessToken = GenerateAccessToken.getAccessToken();

					APIContext apiContext = new APIContext(accessToken);
			
					Payment createdPayment = payment.create(apiContext);
					
					pd.setResponse(Payment.getLastResponse());
					pd.setSuccess(true);
					PaymentStaticToken.setPaymentContext(pd.getId(), pd);
					
					//System.out.println("Payment confirmed:"+Payment.getLastResponse());
				} catch (PayPalRESTException e) {
					e.printStackTrace();
					pd.setResponse(e.getMessage());
					pd.setSuccess(false);
					PaymentStaticToken.setPaymentContext(pd.getId(), pd);
				//	req.setAttribute("error", e.getMessage());
				}
			//	req.setAttribute("request", Payment.getLastRequest());
			//	req.getRequestDispatcher("response.jsp").forward(req, resp);
			}
			
		}

