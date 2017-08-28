<%@include file="fragments/header.jspf" %>
<%@include file="fragments/navbar.jspf"%>
	<div id="welcome">
		<p>Welcome: ${name}</p>
		<form action="/gettodo" method="get">
			<input type="submit" value="GetMyToDos"/>
		</form>
	</div>
<%@include file="fragments/footer.jspf"%>