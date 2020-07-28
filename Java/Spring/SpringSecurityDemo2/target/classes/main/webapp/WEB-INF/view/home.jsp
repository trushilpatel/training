<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@taglib uri = "http://www.springframework.org/security/tags" prefix = "security"%>

<html>

<head>
	<title>luv2code Company Home Page</title>
</head>

<body>
	<h2>luv2code Company Home Page</h2>
	<hr>
	
	Welcome to the luv2code company home page!

	<security:authorize access="hasRole('MANAGER')">
	<a href="${pageContext.request.contextPath }/role/leader">Leaders are welcomed here</a>
	</security:authorize>
	<br>
	
	<security:authorize access="hasRole('ADMIN')">
	<a href="${pageContext.request.contextPath }/role/admin">Admin are welcomed here</a>
	</security:authorize>
	
	<form:form action="${pageContext.request.contextPath}/logout" method="POST">
		<input type="submit" value="logout">
	</form:form>
</body>

</html>