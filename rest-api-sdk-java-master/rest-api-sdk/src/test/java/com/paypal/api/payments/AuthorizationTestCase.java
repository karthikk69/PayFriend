package com.paypal.api.payments;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthorizationTestCase {

	public static final String ID = "12345";

	public static final String PARENTPAYMENT = "12345";

	public static final String STATE = "Approved";

	public static final Amount AMOUNT = AmountTestCase.createAmount("120.00");

	public static final String CREATEDTIME = "2013-01-17T18:12:02.347Z";

	public static Authorization createAuthorization() {
		List<Link> links = new ArrayList<Link>();
		links.add(LinkTestCase.createLink());
		Authorization authorization = new Authorization();
		authorization.setId(ID);
		authorization.setParentPayment(PARENTPAYMENT);
		authorization.setState(STATE);
		authorization.setAmount(AMOUNT);
		authorization.setCreateTime(CREATEDTIME);
		authorization.setLinks(links);
		return authorization;
	}

	@Test
	public void testConstruction() {
		Authorization authorization = createAuthorization();
		Assert.assertEquals(authorization.getId(), ID);
		Assert.assertEquals(authorization.getCreateTime(), CREATEDTIME);
		Assert.assertEquals(authorization.getLinks().size(), 1);
		Assert.assertEquals(authorization.getParentPayment(), PARENTPAYMENT);
		Assert.assertEquals(authorization.getState(), STATE);
		Assert.assertEquals(authorization.getAmount().getCurrency(),
				AmountTestCase.CURRENCY);
	}

	@Test
	public void testTOJSON() {
		Authorization authorization = createAuthorization();
		Assert.assertEquals(authorization.toJSON().length() == 0, false);
	}

	@Test
	public void testTOString() {
		Authorization authorization = createAuthorization();
		Assert.assertEquals(authorization.toString().length() == 0, false);
	}

}
