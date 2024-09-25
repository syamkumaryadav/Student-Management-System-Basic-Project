package com.students;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ChangePasswordServlet
 */
@WebServlet("/ChangepasswordServlet")
public class ChangePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("user_name");
		String old_password = request.getParameter("password");
		String new_password = request.getParameter("new_password");
		String confirm_password = request.getParameter("confirm_password");
		System.out.println("username:::"+username);
		System.out.println("old_password:::"+old_password);
		System.out.println("new_password:::"+new_password);
		System.out.println("confirm_password:::"+confirm_password);
		PrintWriter out=response.getWriter();
		out.println(username+" you are successfully logged in.");
		
		ServletContext sc=getServletContext();
		sc.setAttribute("username", username);
		
		
		Connection conn=null;
        Statement stmt=null;
		//ResultSet rs=null;
     
        try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		 conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","gokada","syam");
		 stmt=conn.createStatement();
		stmt.execute("INSERT INTO students_backup (student_name, gender, class, register_no, password, father_name, mother_name, email, mobile, address,isfirsttime) SELECT student_name, gender, class, register_no, password, father_name, mother_name, email, mobile, address,isfirsttime FROM students WHERE student_name = '"+username+"'");
		stmt.execute("update students set password='"+confirm_password+"', isfirsttime=1 where email='"+username+"'");
		out.println("updated successfully.");
		out.println("Please go to login page.");
		
		}
		catch(Exception e) {
			System.out.print(e);
			 out.println("Internal server error!");
		}
        finally {
    		try {
    			stmt.close();
    			//rs.close();
    			conn.close();
    		} catch (SQLException e) {
    			// TODO Auto-generated catch block
    			out.println(e);
    		}
    	}
      
	}

}
