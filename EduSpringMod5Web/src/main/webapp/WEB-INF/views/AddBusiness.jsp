<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Ad Business</title>
	</head>
	<body>
		<form:form action="addNewBusiness" method="POST" commandName="addBusiness">
			<label for="businessName">Business Name<form:input id="businessName" path="businessName"/></label>
			<label for="registeredDate">Registered Date<form:input id="registeredDate" path="registeredDate"/></label>
			<label for="ownerName">Business Name<form:input id="ownerName" path="ownerName"/></label>
			<input type="submit" value="submit"/>
		</form:form>
		
	</body>
</html>