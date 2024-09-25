package com.students;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("user_name");
		String password = request.getParameter("password");
		System.out.println("username:::"+email);
		System.out.println("password:::"+password);
		PrintWriter out=response.getWriter();
		out.println(email+" you are successfully logged in.");
		String dbPassword=null;
		Statement stmt=null;
		int isFirstTime=0;
		Connection conn=null;
		ResultSet rs=null;
		 try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
			 conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","gokada","syam");
			 stmt=conn.createStatement();
			 rs=stmt.executeQuery("select isfirsttime,password from students where email='"+email+"'");
			if (rs.next()) {
				dbPassword = rs.getString("password");
				isFirstTime=rs.getInt("isfirsttime");
               
            } else {
                response.getWriter().println("Invalid username.");
            	}
			System.out.println("login password:::"+password);
			System.out.println("dbPassword:::"+dbPassword);
			System.out.println("isFirstTime:::"+isFirstTime);
			
			  if(isFirstTime==1) {
	                // Check if the provided password matches the stored password
	                if (password.equals(dbPassword)) {
	                	 RequestDispatcher dispatcher = request.getRequestDispatcher("HomePage.jsp");
			             dispatcher.forward(request, response);
	                } else {
	                    response.getWriter().println("Invalid password.");
	                }
			
			  }else {
				 if (password.equals(dbPassword)) {
					 RequestDispatcher dispatcher = request.getRequestDispatcher("changePassword.jsp");
		             dispatcher.forward(request, response);
	             } else {
	                 response.getWriter().println("Invalid password.");
	             }
				 
		 }
		 }
			catch(Exception e) {
				System.out.print(e);
				 out.println("Internal server error!");
			}
		 finally {
			try {
				stmt.close();
				rs.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
