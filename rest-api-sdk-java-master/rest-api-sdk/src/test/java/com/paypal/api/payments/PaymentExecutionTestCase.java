package com.paypal.api.payments;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PaymentExecutionTestCase {
	
	public static PaymentExecution createPaymentExecution(){
		List<Amount> transactions = new ArrayList<Amount>();
		transactions.add(AmountTestCase.createAmount("100.00"));
		PaymentExecution pae=new PaymentExecution();
		pae.setPayerId(PayerInfoTestCase.PAYERID);
		pae.setTransactions(transactions);
		return pae;
	}
	
	@Test
	public void testConstruction(){
		PaymentExecution pae = createPaymentExecution();
		Assert.assertEquals(pae.getPayerId(), PayerInfoTestCase.PAYERID);
		Assert.assertEquals(pae.getTransactions().get(0).getTotal(),"100.00");
		Assert.assertEquals(pae.getTransactions().get(0).getCurrency(),AmountTestCase.CURRENCY);
	}
	
	
	@Test
	public void testToJson(){
		PaymentExecution pae = createPaymentExecution();
		Assert.assertEquals(pae.toJSON().length() == 0, false);
	}
	
	@Test
	public void testToString(){
		PaymentExecution pae = createPaymentExecution();
		Assert.assertEquals(pae.toString().length() == 0, false);
	}
}
