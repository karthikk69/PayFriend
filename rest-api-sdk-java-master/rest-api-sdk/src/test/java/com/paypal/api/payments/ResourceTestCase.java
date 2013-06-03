package com.paypal.api.payments;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ResourceTestCase {

	public static Resource createResource() {
		Resource resource = new Resource();
		return resource;
	}

	@Test
	public void testTOJSON() {
		Resource resource = ResourceTestCase.createResource();
		Assert.assertEquals(resource.toJSON().length() == 0, false);
	}

	@Test
	public void testTOString() {
		Resource resource = ResourceTestCase.createResource();
		Assert.assertEquals(resource.toString().length() == 0, false);
	}

}
