<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Header.jsp" %>
    <%@ include file="Footer.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Management System</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }
        header {
            background-color: #0073e6;
            color: white;
            padding: 1rem;
            text-align: center;
        }
        nav {
            background-color: #333;
            color: white;
            overflow: hidden;
        }
        nav a {
            float: left;
            display: block;
            color: white;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
        }
        nav a:hover {
            background-color: #575757;
        }
        main {
            padding: 20px;
        }
        .container {
            max-width: 1000px;
            margin: auto;
            background: white;
            padding: 20px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        footer {
            background-color: #333;
            color: white;
            text-align: center;
            padding: 10px 0;
            position: fixed;
            bottom: 0;
            width: 100%;
        }
    </style>
</head>
<body>



<nav>
    <a href="#home">Home</a>
    <a href="#students">Student Records</a>
    <a href="#courses">Course Management</a>
    <a href="#grades">Grades</a>
    <a href="#attendance">Attendance</a>
    <a href="#reports">Reports</a>
    <a href="#settings">Settings</a>
</nav>

<main>
    <div class="container">
        <h2>Welcome Mr.xxxxxxx</h2>
       <p>Here you can view your Data.</p>
    </div>
</main>


</body>
</html>