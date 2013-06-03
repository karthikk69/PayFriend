package com.paypal.api.payments;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LinkTestCase {

	public static final String HREF = "http://sample.com";

	public static final String METHOD = "POST";

	public static final String REL = "authorize";

	public static Link createLink() {
		Link link = new Link();
		link.setHref(HREF);
		link.setMethod(METHOD);
		link.setRel(REL);
		return link;
	}

	@Test
	public void testConstruction() {
		Link link = LinkTestCase.createLink();
		Assert.assertEquals(link.getHref(), HREF);
		Assert.assertEquals(link.getRel(), REL);
		Assert.assertEquals(link.getMethod(), METHOD);
	}

	@Test
	public void testTOJSON() {
		Link link = LinkTestCase.createLink();
		Assert.assertEquals(link.toJSON().length() == 0, false);
	}
	
	@Test
	public void testTOString() {
		Link link = LinkTestCase.createLink();
		Assert.assertEquals(link.toString().length() == 0, false);
	}

}
