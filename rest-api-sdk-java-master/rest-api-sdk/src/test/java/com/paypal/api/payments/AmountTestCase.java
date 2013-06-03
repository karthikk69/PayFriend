package com.paypal.api.payments;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AmountTestCase {

	public static final String CURRENCY = "USD";

	public static final AmountDetails AMOUNTDETAILS = AmountDetailsTestCase
			.createAmountDetails();

	public static Amount createAmount(String total) {
		Amount amount = new Amount();
		amount.setCurrency(CURRENCY);
		amount.setTotal(total);
		amount.setDetails(AMOUNTDETAILS);
		return amount;
	}

	@Test
	public void testConstruction() {
		Amount amount = createAmount("1000.00");
		Assert.assertEquals(amount.getTotal(), "1000.00");
		Assert.assertEquals(amount.getCurrency(), CURRENCY);
		Assert.assertEquals(amount.getDetails().getFee(),
				AmountDetailsTestCase.FEE);
	}

	@Test
	public void testTOJSON() {
		Amount amount = createAmount("12.25");
		Assert.assertEquals(amount.toJSON().length() == 0, false);
	}

	@Test
	public void testTOString() {
		Amount amount = createAmount("12.25");
		Assert.assertEquals(amount.toString().length() == 0, false);
	}

}
