<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/css/add-customer-style.css">
</head>
<body>
<h1>Insert Customer details</h1>
	<form:form modelAttribute="customer" method="POST"
		action="saveCustomer">
		<form:hidden path="id"/>
		First name : <form:input path="firstName" />
		<br>
		Last Name : <form:input path="lastName" />
			<br>
		email : <form:input path="email" />
				<br>
		<input type="submit" value="save" class="save" />
	</form:form>
</body>
</html>