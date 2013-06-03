<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<style type="text/css">
#footer {
	position: fixed;
	bottom: 0;
	width: 100%;
	color: #fff;
}
</style>
<meta http-equiv="Content-Type" content="text/html; utf-8">
<title>Pay Friend Response</title>
<link href="source/assets/bootstrap.min.css" rel="stylesheet">

<script type='text/javascript'
	src='http://ajax.googleapis.com/ajax/libs/jquery/1.6.4/jquery.min.js'></script>
<script type='text/javascript' src="source/assets/bootstrap.min.js"></script>
<link
	href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.0/css/bootstrap-combined.min.css"
	rel="stylesheet">

<script type="text/javascript">
	function stringify() {
		var response ='<%=request.getAttribute("paymentResultStr")%>
	';
		var aSplit = response.split('$');
		var resultJSON = '{"100004012315458":"Madhumala Kenchaiah","505634200":"Smitha BK","505491097":"Arjun Prakash","100006012369630":"Testkk Karthik","1081818796":"Karthik kenchaiah"}';
		var result = $.parseJSON(resultJSON);
		for ( var i = 1; i < aSplit.length; i++) {
			var valsp = aSplit[i].split('|');
			$
					.each(
							result,
							function(k, v) {
								if (valsp[0] == k) {
									$('#FriendsTable')
											.append(
													'<tr><td><div class="thumbnail"><img src=\'https://graph.facebook.com/'+k+'/picture\'></div></td><td>'
															+ v
															+ '</td><td>'
															+ valsp[1]
															+ '</td><td>'
															+ valsp[2]
															+ '</td></tr>');

								}
							});
			//Do something
		}
	}
</script>
</head>
<body onload="stringify();">
	<form name="MainForm">
		<input type="hidden" name="key"> <input type="hidden"
			name="amount"> <input id="numVal" type="hidden" value="0">
		<div id="holder">
			<div id="camoflagger">
				<div class="navbar">
					<div class="navbar-inner">
						<div class="container">
							<a class="btn btn-navbar" data-toggle="collapse"
								data-target=".nav-collapse"> <span class="icon-bar"></span>
								<span class="icon-bar"></span> <span class="icon-bar"></span>
							</a> <a class="brand" href="#">PayFriend</a>
							<ul class="nav pull-right">
								<li class="active"><a href="BootStrapLogin.html">Home</a></li>
							</ul>
							<div class="nav-collapse"></div>
							<!-- /.nav-collapse -->
						</div>
					</div>
					<!-- /navbar-inner -->
				</div>
				<div class="hero-unit">
					<h1>Payment Confirmation jsp</h1>
				</div>
				<table id="FriendsTable">
				</table>
				<div id="footer">
					<div class="container">
						<p>
							<small>Application by:</small><strong> Karthik Kenchaiah
							</strong>
						</p>
					</div>
				</div>
			</div>
		</div>
	</form>
</body>
</html>