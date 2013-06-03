package com.paypal.api.payments.util;

import java.util.HashMap;

public class PaymentStaticToken {
public static HashMap<String, String> PaymentMapping = new HashMap<String, String>();
public static HashMap<String, PaymentDetails> PaymentContext= new HashMap<String, PaymentDetails>();

public static PaymentDetails getPaymentContext(String key) {
	return PaymentContext.get(key);
}

public static void clearPaymentContext() {
	 PaymentContext.clear();
}

public static HashMap<String, PaymentDetails> getPayContext() {
	return PaymentContext;
}

public static void setPaymentContext(String key,PaymentDetails value) {
	PaymentContext.put(key, value);

}

public static HashMap<String, String> getPaymentMapping() {
	return PaymentMapping;
}

public static void setPaymentMapping(String key,String value) {
	PaymentMapping.put(key, value);
}

public static String getPaymentValue(String key) {
	return PaymentMapping.get(key);
}

}
