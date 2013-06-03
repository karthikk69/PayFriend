package com.paypal.api.payments;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AmountDetailsTestCase {

	public static final String FEE = "100.00";

	public static final String SHIPPING = "12.50";

	public static final String SUBTOTAL = "200.00";

	public static final String TAX = "20.00";

	public static AmountDetails createAmountDetails() {
		AmountDetails amountDetails = new AmountDetails();
		amountDetails.setFee(FEE);
		amountDetails.setShipping(SHIPPING);
		amountDetails.setSubtotal(SUBTOTAL);
		amountDetails.setTax(TAX);
		return amountDetails;
	}

	@Test
	public void testConstruction() {
		AmountDetails amountDetails = createAmountDetails();
		Assert.assertEquals(amountDetails.getFee(), FEE);
		Assert.assertEquals(amountDetails.getShipping(), SHIPPING);
		Assert.assertEquals(amountDetails.getSubtotal(), SUBTOTAL);
		Assert.assertEquals(amountDetails.getTax(), TAX);
	}
	
	@Test
	public void testTOJSON() {
		AmountDetails amountDetails = createAmountDetails();
		Assert.assertEquals(amountDetails.toJSON().length() == 0, false);
	}
	
	@Test
	public void testTOString() {
		AmountDetails amountDetails = createAmountDetails();
		Assert.assertEquals(amountDetails.toString().length() == 0, false);
	}

}
