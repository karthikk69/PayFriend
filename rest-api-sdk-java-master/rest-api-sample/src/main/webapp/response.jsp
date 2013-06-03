<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Response Page</title>
<script type="text/javascript">
	function stringify() {
		var request =
<%=request.getAttribute("request")%>
	;
		var response =
<%=request.getAttribute("response")%>
	;
	
		var error ='<%=request.getAttribute("error")%>';
		var req = document.getElementById("request");
		var resp = document.getElementById("response");
		if (request != null) {
			
			req.innerHTML = JSON.stringify(request, null, 4);
		} else {
			req.innerHTML = "No payload for this request";
		}
		if (response != null) {
			
			var pas = JSON.parse(JSON.stringify(response, null, 4));
			alert(pas.id);
		//	alert(pas.transactions[0].related_resources[0].sale.id);
		//	alert(objJSON.result);
		//	alert(objJSON.count);
			resp.innerHTML = JSON.stringify(response, null, 4);
		} else if (error != null) {
			
			resp.innerHTML = error;
			var parsedData = JSON.parse(error.substr(error.indexOf('{')));
			var result="<p>"+parsedData.name+"<p>";
			result=result+"<table>";
			for (var i=0;i<parsedData.details.length;i++)
			{  
				    result=result+"<tr>";
			        result=result+"<td>"+parsedData.details[i].issue+"</td>";
			        var valu = parsedData.details[i].field;
			        var valu1= valu.substr(valu.indexOf('.')+1);
			        result=result+"<td>"+valu1.substr(valu1.indexOf('.')+1)+"</td>";
			        result=result+"</tr>"; 
			}
			result=result+"</table>";
			resp.innerHTML = result;
		}
	}
</script>
</head>
<body onload="stringify();">
	<a href="index.html">Back</a>
	<br />
	<%
		if (request.getAttribute("redirectURL") != null) {
	%>
	<a href=<%=(String) request.getAttribute("redirectURL")%>>Redirect
		to PayPal to approve the payment</a>
	<br />
	<%
		}
	%>
	<table border="1px" style="border-collapse: collapse">
		<tr>
			<th>Request</th>
			<th>Response</th>
		</tr>
		<tr>
			<td valign="top"><pre id="request">
					
			</pre></td>
			<td valign="top"><pre id="response">
					
				</pre></td>
		</tr>
	</table>
	<br />
	<a href="index.html">Back</a>
</body>
</html>