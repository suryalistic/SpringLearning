<%@include file="fragments/header.jspf"%>
<%@include file="fragments/navbar.jspf"%>
<div id="main" class="container">
	Hello ${name} <br/>
	<table id="ToDoTable" class="table">
		<thead>
			<tr>
				<th>Description</th>
				<th>Target Date</th>
				<th>Status</th>
				<th>Update</th>
				<th>Delete?</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${allToDos}" var="todo">
				<tr>
					<td>${todo.description}</td>
					<td><fmt:formatDate pattern="yyyy-MM-dd" value="${todo.targetDate}"/></td>
					<td>${todo.isDone}</td>
					<td><a href="/retrieveToDo?id=${todo.id}" class="btn btn-success">Update</a></td>
					<td><a href="/deleteToDo?id=${todo.id}" class="btn btn-danger">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="/addToDo">Add ToDo</a>
	<%@include file="fragments/footer.jspf"%>
</div>
	