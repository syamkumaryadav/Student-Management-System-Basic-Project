<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change password</title>
</head>
<body>
<center>
	<h1>Change password</h1>
	<pre>
		
		
		
		
	</pre>
	<form action="ChangepasswordServlet" method="Post">
		<div style="width:40%">
			<fieldset style="background:yellow">
					<table>
						<tr>
							<td><label for="user_name">User Name :</label></td>
							<td><input type="text" placeholder="User name" name="user_name" id="user_name"></td>
						</tr>
						<tr>
							<td><label for="password">Old Password :</label></td>
							<td><input type="password" placeholder="Password" id="password" name="password"></td>
						</tr>
						<tr>
							<td><label for="new_password">New Password :</label></td>
							<td><input type="password" placeholder="New Password" id="new_password" name="new_password"></td>
						</tr>
						<tr>
							<td><label for="confirm_password">Confirm Password :</label></td>
							<td><input type="password" placeholder="Confirm Password" id="confirm_password" name="confirm_password"></td>
						</tr>
						<tr>
							<td></td>
							<td></td>
							<td><input type="submit" value="ChangePassword"></td>
						</tr>
				</table>
			</fieldset>
		</div>
	</form>
</center>
</body>
</html>