<html>
	<head>
		<title>Login</title>
	</head>
	<body>
		<div id="errorDiv">
			<p><font color="red">${errorMessage}</font></p>
		</div>
		<div id="loginDiv">
			<form action="/gologin" method="POST">
				<label for="userName">Name:</label>
				<input id="userName" name="userName" value="" type="text"/>
				<label for="password">Password:</label>
				<input id="password" name="password" type="password">
				<input type="submit" value="Login"/>
			</form>
		</div>
	</body>
</html>