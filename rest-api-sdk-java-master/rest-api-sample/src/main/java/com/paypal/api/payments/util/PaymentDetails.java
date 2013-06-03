package com.paypal.api.payments.util;

public class PaymentDetails {
	public String Id;
	public String value;
	public String response;
	public boolean isSuccess;
	
	public boolean isSuccess() {
		return isSuccess;
	}
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	 public PaymentDetails (String id,String value) { 
		  this.Id = id;
		  this.value=value;
	  }
}
