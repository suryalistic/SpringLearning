<%@include file="fragments/header.jspf"%>
<%@include file="fragments/navbar.jspf"%>
	<div>
		<form:form action="/submitAddToDo" method="post" class="form-inline" commandName="todo">
			<fieldset class="form-group">
				<form:label for="desc" path="description">Description</form:label>
				<form:input type="text" id="description" path="description"  class="form-control" required="required"/><br/>
				<form:label for="targetDate" path="targetDate">Target Date</form:label>
				<form:input type="Date" path="targetDate" id="targetDate" class="form-control"/>
				<form:errors path="description" class="text-danger"/>
			</fieldset>
			<input type="submit" value="Add" class="btn btn-success"/>
		</form:form>	
	</div>
	<script type="text/javascript" src="webjars/bootstrap-datepicker/1.0.1/js/bootstrap-datepicker.js"></script>	
	<script>
		$('#targetDate').datepicker({
			format : 'dd/mm/yyyy'
		});
	</script>
	<%@include file="fragments/footer.jspf"%>