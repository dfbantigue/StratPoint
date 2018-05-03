<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" href="/resources/css/main.css">
<script type="text/javascript" src="/resources/js/app.js"></script>
<title>Home Page</title>
</head>
<body>
	<input type="text" id="searchName" onkeyup="searchName()"
		placeholder=" &#128269;Search">
	<table id="usersTbl">
		<tr class="header">
			<th ><a href="#" onclick="sortName()" class="sort-by">Name</a></th>
			<th ><a href="#" onclick="sortAge()" class="sort-by">Age</a></th>
			<th ><a href="#" onclick="sortActive()" class="sort-by">Active</a></th>
			<th >Blocked</th>
		</tr>
		<c:forEach var="user" items="${users}">
			<tr>
				<td><a href="<c:url value="/profile/${user.id}" />">${user.name.first}
						${user.name.middle}. ${user.name.last}</a></td>
				<td>${user.age}</td>
				<c:choose>
					<c:when test='${user.active==true}'>
						<td><input type="checkbox" id="active" checked="checked"
							onclick="return false;"></td>
					</c:when>
					<c:otherwise>
						<td><input type="checkbox" id="active"
							onclick="return false;"></td>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test='${user.blocked==true}'>
						<td><input type="checkbox" id="active" checked="checked"
							onclick="return false;"></td>
					</c:when>
					<c:otherwise>
						<td><input type="checkbox" id="active"
							onclick="return false;"></td>
					</c:otherwise>
				</c:choose>
			</tr>
		</c:forEach>
	</table>
</body>
</html>