<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<label>Add Business</label>
<c:url value="/addBusinessHome" var="addBusUrl"/>
<a href="${addBusUrl}">Add New Business</a>
<p>${message}</p>
</body>
</html>
