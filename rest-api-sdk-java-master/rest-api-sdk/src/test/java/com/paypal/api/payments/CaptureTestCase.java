package com.paypal.api.payments;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CaptureTestCase {

	public static final String AUTHID = "12345";

	public static final String DESCRIPTION = "sample description";

	public static final String ID = "12345";

	public static final String PARENTPAYMENT = "12345";

	public static final String STATE = "Approved";

	public static final Amount AMOUNT = AmountTestCase.createAmount("120.00");

	public static final String CREATEDTIME = "2013-01-17T18:12:02.347Z";

	public static Capture createCapture() {
		List<Link> links = new ArrayList<Link>();
		links.add(LinkTestCase.createLink());
		Capture capture = new Capture();
		capture.setAuthorizationId(AUTHID);
		capture.setDescription(DESCRIPTION);
		capture.setId(ID);
		capture.setParentPayment(PARENTPAYMENT);
		capture.setState(STATE);
		capture.setAmount(AMOUNT);
		capture.setCreateTime(CREATEDTIME);
		capture.setLinks(links);
		return capture;
	}

	@Test
	public void testConstruction() {
		Capture capture = createCapture();
		Assert.assertEquals(capture.getId(), ID);
		Assert.assertEquals(capture.getAuthorizationId(), AUTHID);
		Assert.assertEquals(capture.getDescription(), DESCRIPTION);
		Assert.assertEquals(capture.getParentPayment(), PARENTPAYMENT);
		Assert.assertEquals(capture.getState(), STATE);
		Assert.assertEquals(capture.getAmount().getCurrency(),
				AMOUNT.getCurrency());
		Assert.assertEquals(capture.getCreateTime(), CREATEDTIME);
		Assert.assertEquals(capture.getLinks().size(), 1);
	}

	@Test
	public void testTOJSON() {
		Capture capture = createCapture();
		Assert.assertEquals(capture.toJSON().length() == 0, false);
	}

	@Test
	public void testTOString() {
		Capture capture = createCapture();
		Assert.assertEquals(capture.toString().length() == 0, false);
	}

}
