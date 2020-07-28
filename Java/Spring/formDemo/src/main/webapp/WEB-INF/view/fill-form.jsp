<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<html>
<head>
<meta charset="ISO-8859-1">
<title>Fill Form</title>
</head>
<body>

<form:form action="processForm" modelAttribute="Student">
	First Name : <form:input path="firstName"/>
	<br />
	Last name : <form:input path="lastName" />
	
	<br/>
	
	Gender :
	<br />
	<form:radiobutton path="gender" value="Male"/>Male
	<form:radiobutton path="gender" value="Female" />Female
	
	<br />
	Country :
	<form:select path="country" >
		<form:option value="India">India</form:option>
		<form:option value="USA">USA</form:option>
	</form:select>
	
	<br />
	Language :
	<form:checkbox path="language" value="Gujarati"/> Gujarati
	<form:checkbox path="language" value="Hindi"/> Hindi
	
	<input type="submit">
</form:form>

</body>
</html>