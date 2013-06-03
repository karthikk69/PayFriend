package com.paypal.api.payments;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubTransactionTestCase {

	public static final Sale SALE = SaleTestCase.createSale();

	public static final Authorization AUTHORIZATION = AuthorizationTestCase
			.createAuthorization();

	public static final Refund REFUND = RefundTestCase.createRefund();

	public static final Capture CAPTURE = CaptureTestCase.createCapture();

	public static SubTransaction createSubTransaction() {
		SubTransaction subTransaction = new SubTransaction();
		subTransaction.setAuthorization(AUTHORIZATION);
		subTransaction.setCapture(CAPTURE);
		subTransaction.setRefund(REFUND);
		subTransaction.setSale(SALE);
		return subTransaction;
	}

	@Test
	public void testConstruction() {
		SubTransaction subTransaction = createSubTransaction();
		Assert.assertEquals(subTransaction.getAuthorization().getId(),
				AuthorizationTestCase.ID);
		Assert.assertEquals(subTransaction.getSale().getId(), SaleTestCase.ID);
		Assert.assertEquals(subTransaction.getRefund().getId(),
				RefundTestCase.ID);
		Assert.assertEquals(subTransaction.getCapture().getId(),
				CaptureTestCase.ID);
	}

	@Test
	public void testTOJSON() {
		SubTransaction subTransaction = createSubTransaction();
		Assert.assertEquals(subTransaction.toJSON().length() == 0, false);
	}

	@Test
	public void testTOString() {
		SubTransaction subTransaction = createSubTransaction();
		Assert.assertEquals(subTransaction.toString().length() == 0, false);
	}

}
