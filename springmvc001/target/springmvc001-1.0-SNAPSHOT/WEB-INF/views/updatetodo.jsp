<%@include file="fragments/header.jspf"%>
<%@include file="fragments/navbar.jspf"%>
	<div>
		<form:form action="/updateToDo" method="post" class="form-inline" commandName="todo">
			<fieldset class="form-group">
				<form:input type="text" path="id"/>
				<form:input type="text" path="userName"/>
				<form:input type="text" path="targetDate"/>
				<form:label for="desc" path="description">Description</form:label>
				<form:input type="text" id="description" path="description"  class="form-control" required="required"/><br/>
				<form:errors path="description" class="text-danger"/>
			</fieldset>
			<input type="submit" value="Update" class="btn btn-success"/>
		</form:form>	
	</div>
<%@include file="fragments/footer.jspf"%>
