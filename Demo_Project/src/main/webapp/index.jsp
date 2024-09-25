<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registeration Form</title>
</head>
<body>
	<center>
		<form action="RegisterServelet" method="post">
			<div style="width:50%">
				<fieldset style="background:#FFC0CB"><center><H1>Student Registeration Form</H1></center> </fieldset>
				<fieldset style="background:#FFC0CB">
					<legend>Student details</legend>
					<table>	
						<tr>
							<td></td>
							<td></td>
							<td></td>
							<td><a href="login.jsp"><input type="button" value="Login"></a></td>
						</tr>
					    <tr>
					        <td><lable for="student_name">Name :</lable></td>
					        <td><input type="text" id="student_name" name="student_name" placeholder="Enter full name" required></td>
					        <td></td>
					        
					    </tr>
					    <tr>
					        <td><lable for="class">Class :</lable></td>
					        <td><input type="text" id="class" name="class"  placeholder="Class" required></td>
					    </tr>
					    <tr>
					        <td><lable for="gender">Gender :</lable></td>
					        <td><input type="text" id="gender" name="gender"  placeholder="Gender" required></td>
					    </tr>
					    <tr>
					        <td><lable for="register_no">Register No :</lable></td>
					        <td><input type="text" id="register_no" name="register_no" placeholder="Register number" required></td>
					    </tr>
					    <tr>
					        <td><lable for="father_name">Father's Name :</lable></td>
					        <td><input type="text" id="father_name" name="father_name" placeholder="Father name" required></td>
					    </tr>
					    <tr>
					        <td><lable for="mother_name">Mother's Name :</lable></td>
					        <td><input type="text" id="mother_name" name="mother_name"  placeholder="Mother name" required></td>
					    </tr>
					    <tr>
					        <td><lable for="mobile">Phone number :</lable></td>
					        <td><input type="text" id="mobile" name="mobile" placeholder="7095098594" required></td>
					    </tr>
					    <tr>
					        <td><lable for="email">Email :</lable></td>
					        <td><input type="email" id="email" name="email" placeholder="Sample@gmail.com" required></td>
					    </tr>
					    <tr>
					        <td><lable for="address">Address :</lable></td>
					        <td><textarea name="address" id="address" name="address" rows="1" cols="32" >
								</textarea></td>
					    </tr>
					    <tr>
					        <td><input type="submit" value="Register"></td>
					        
					    </tr>
				</table>
			</div>
			</fieldset>
		</form>
	</center>
</body>
</html>