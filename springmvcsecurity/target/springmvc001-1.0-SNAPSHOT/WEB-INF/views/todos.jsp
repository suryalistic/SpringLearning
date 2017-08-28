<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>To Dos</title>
	</head>
	<body>
		Hello ${name} <br/>
		${allToDos} <br/>
		<table id="ToDoTable">
			<thead>
				<tr>
					<th>Description</th>
					<th>Target Date</th>
					<th>Status</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${allToDos}" var="todo">
					<tr>
						<td>${todo.description}</td>
						<td>${todo.targetDate}</td>
						<td>${todo.isDOne}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="/addToDo" class="btn btn-success">Add ToDo</a>
		<a href="/handleSpecException" class="btn btn-warning">SpecificException</a>
		<a href="/handleGeneralException" class="btn btn-warning">GeneralException</a>
	</body>
</html>