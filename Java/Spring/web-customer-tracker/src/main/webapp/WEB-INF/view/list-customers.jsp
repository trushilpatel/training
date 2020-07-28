<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>List Customers</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>

	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>

	<div id="container">

		<div id="content">

			<!--  add our html table here -->
			<input type="button" value="Add Customer" onClick="window.location.href='insert-form'; return false;" class="add-button">
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Update</th>
					<th>Delete</th> 
				</tr>

				<!-- loop over and print our customers -->
				<c:forEach var="tempCustomer" items="${customers}">
				<c:url var="updateLink" value="/customer/update-customer">
					<c:param name="customerId" value="${tempCustomer.id }"></c:param>				 
				</c:url>
				<c:url var="deleteLink" value="/customer/delete-customer">
					<c:param name="customerId" value="${tempCustomer.id }"></c:param>				 
				</c:url>
					<tr>
						<td>${tempCustomer.firstName}</td>
						<td>${tempCustomer.lastName}</td>
						<td>${tempCustomer.email}</td>
						<td><a href="${updateLink}">Update</a></td>
						<td><a href="${deleteLink}" 
							onclick="if (!(confirm('Are you sure ?'))) return false">Delete</a></td>
						
					</tr>
					

				</c:forEach>

			</table>

		</div>

	</div>


</body>
</html>