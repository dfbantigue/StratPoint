<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript" src="/resources/js/app.js"></script>
<title>Profile View</title>
</head>
<body>

	<h2><img src="${user.picture}" /> ${user.name.first} ${user.name.middle}. ${user.name.last}</h2>
	<table id="profileTtbl">
		<tr class="header" style="hidden">
			<th style="width:5%;"></th>
			<th style="width:95%;"></th>
		</tr>
		<tr>
			<td><b>ID:</b></td>
			<td>${user.id}</td>
		</tr>
		<tr>
			<td><b>Profile:</b></td>
			<td>${user.profile}</td>
		</tr>
		<tr>
			<td><b>Email:</b></td>
			<td>${user.email}</td>
		</tr>	
		<tr>
			<td><b>Phone:</b></td>
			<td>${user.phone}</td>
		</tr>
		<tr>
			<td><b>Address:</b></td>
			<td>${user.address}</td>
		</tr>
		<tr>
			<td><b>Age</b>:</td>
			<td>${user.age}</td>
		</tr>
		<tr>
			<td><b>Balance:</b></td>
			<td>${user.balance}</td>
		</tr>					
	</table>
	<input type="button" id="back" onclick="history.back();" value="Back to Home Page">
</body>
</html>