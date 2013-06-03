package com.paypal.api.payments;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddressTestCase {

//	public static final String RECIPIENTSNAME = "TestUser";

	public static final String CITY = "Niagara Falls";

	public static final String COUNTRYCODE = "US";

	public static final String LINE1 = "3909 Witmer Road";

	public static final String LINE2 = "Niagara Falls";

	public static final String POSTALCODE = "14305";

	public static final String PHONE = "716-298-1822";

	public static final String STATE = "NY";
	
	public static final String TYPE = "Business";

	public static Address createAddress() {
		Address billingAddress = new Address();
//		billingAddress.setRecipientName(RECIPIENTSNAME);
		billingAddress.setCity(CITY);
		billingAddress.setCountryCode(COUNTRYCODE);
		billingAddress.setLine1(LINE1);
		billingAddress.setLine2(LINE2);
		billingAddress.setPostalCode(POSTALCODE);
		billingAddress.setPhone(PHONE);
		billingAddress.setState(STATE);
		billingAddress.setType(TYPE);
		return billingAddress;
	}

	@Test
	public void testConstruction() {
		Address address = createAddress();
//		Assert.assertEquals(address.getRecipientName(), RECIPIENTSNAME);
		Assert.assertEquals(address.getCity(), CITY);
		Assert.assertEquals(address.getCountryCode(), COUNTRYCODE);
		Assert.assertEquals(address.getLine1(), LINE1);
		Assert.assertEquals(address.getLine2(), LINE2);
		Assert.assertEquals(address.getPostalCode(), POSTALCODE);
		Assert.assertEquals(address.getPhone(), PHONE);
		Assert.assertEquals(address.getState(), STATE);
		Assert.assertEquals(address.getType(), TYPE);
	}
	
	@Test
	public void testTOJSON() {
		Address address = createAddress();
		Assert.assertEquals(address.toJSON().length() == 0, false);
	}
	
	@Test
	public void testTOString() {
		Address address = createAddress();
		Assert.assertEquals(address.toString().length() == 0, false);
	}
}
