<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
<body>

	<h1>Please Login Here</h1>
	<pre>
	
	
	
	</pre>
<center>
	<form action="LoginServlet" method="Post">
		<div style="width:40%">
			<fieldset style="background:red">
				<table>					
					<tr>
						<td><label for="user_name">User Name :</label></td>
						<td><input type="email" placeholder="User_name" name="user_name" id="user_name"></td>
					</tr>
					<tr>
						<td><label for="password">Password :</label></td>
						<td><input type="password" placeholder="Password" id="password" name="password"></td>
					</tr>
					<tr>
						<td></td>
						<td></td>
						<td><input type="submit" value="Login"></td>
					</tr>
				</table>
			</fieldset>	
		</div>	
	</form>
</center>	
</body>
</html>