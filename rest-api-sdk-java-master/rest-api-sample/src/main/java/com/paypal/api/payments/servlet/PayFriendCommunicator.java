package com.paypal.api.payments.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.paypal.api.payments.Payment;
import com.paypal.api.payments.thread.PaymentThread;
import com.paypal.api.payments.util.PaymentDetails;
import com.paypal.api.payments.util.PaymentStaticToken;
import com.paypal.core.rest.PayPalRESTException;
import com.paypal.core.rest.PayPalResource;

/**
 * Servlet implementation class PayFriendCommunicator
 */
public class PayFriendCommunicator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PayFriendCommunicator() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//	System.out.println("Reached Servlet");
	//	System.out.println("key:"+request.getParameter("key"));
		PaymentStaticToken.clearPaymentContext();
		String key=request.getParameter("key");
		String val=request.getParameter("amount");
	//	System.out.println("val:"+request.getParameter("amount"));
		String [] keys = key.split("!");
		String [] vals = val.split("!");
		 List threads = new ArrayList();
			
		for (int x=1; x<keys.length; x++)
	    {
			if(!vals[x].equals("0")){
				
	        PaymentThread temp= new PaymentThread(new PaymentDetails(keys[x],vals[x]));
	        temp.start();
	        threads.add(temp);
			}
	    }
		
		for (int i = 0; i < threads.size(); i++){
			try {
				((Thread) threads.get(i)).join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	//	System.out.println("All threads finished");
		String paymentResultStr = "";
		HashMap<String, PaymentDetails> map=PaymentStaticToken.PaymentContext;
		for (Entry<String, PaymentDetails> entry : map.entrySet()) {
		    String iD = entry.getKey();
		    PaymentDetails value = entry.getValue();
		   
	//	    System.out.println( value.getValue()+"\n");
		    if(!value.isSuccess()){
		    paymentResultStr=paymentResultStr+"$"+iD+"|"+value.getValue()+"|"+"Transaction Failed";
		    }
		    else
		    	paymentResultStr=paymentResultStr+"$"+iD+"|"+value.getValue()+"|"+"Transaction Successfull";
		}
	//	System.out.println(paymentResultStr);
		request.setAttribute("paymentResultStr", paymentResultStr);
		request.getRequestDispatcher("Responsefile.jsp").forward(request, response);
	}

}
