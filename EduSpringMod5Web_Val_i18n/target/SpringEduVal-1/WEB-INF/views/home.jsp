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
<p>	Message from Server ${message} </p>
<c:url var="phoneUrl" value="/addphoneModel"/>
<c:url var="langTestEn" value="/langTest?lang=en"/>
<c:url var="langTestFr" value="/langTest?lang=fr"/>
<c:url var="langTestHin" value="/langTest?lang=hin"/>
<c:url var="langTestTel" value="/langTest?lang=tel"/>
<a href="${phoneUrl}">Add Phone</a><br/><br/>
<a href="${langTestEn}">Language Test English</a><br/><br/>
<a href="${langTestFr}">Language Test French</a><br/><br/>
<a href="${langTestHin}">Language Test Hindi</a><br/><br/>
<a href="${langTestTel}">Language Test Telugu</a><br/><br/>
</body>
</html>
