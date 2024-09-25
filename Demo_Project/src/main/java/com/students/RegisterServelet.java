package com.students;

import java.io.IOException; 
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServelet
 */
@WebServlet("/RegisterServelet")
public class RegisterServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String student_name = request.getParameter("student_name");
        String gender = request.getParameter("gender");
		String father_name = request.getParameter("father_name");
        String mother_name = request.getParameter("mother_name");
        String className = request.getParameter("class");
        String register_no = request.getParameter("register_no");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String address = request.getParameter("address");
        PrintWriter out=response.getWriter();
        String password="test@123";
        int isfirsttime=0;
        if(student_name.equals("null")||student_name.equals("Null")|| student_name.isEmpty() ) {
        	 out.println("Please enter student name.");
        }
        if(gender.equals("null")||gender.equals("Null")|| gender.isEmpty() ) {
       	 out.println("Please enter Gender.");
       }
        if(father_name.equals("null")||father_name.equals("Null")|| father_name.isEmpty() ) {
       	 out.println("Please enter Father name.");
       }
        if(mother_name.equals("null")||mother_name.equals("Null")|| mother_name.isEmpty() ) {
       	 out.println("Please enter Mother name.");
       }
        if(className.equals("null")||className.equals("Null")|| className.isEmpty() ) {
       	 out.println("Please enter Class.");
       }
        if(register_no.equals("null")||register_no.equals("Null")|| register_no.isEmpty() ) {
       	 out.println("Please enter Register no.");
       }
        if(email.equals("null")||email.equals("Null")|| email.isEmpty() ) {
       	 out.println("Please enter email.");
       }
        if(mobile.equals("null")||mobile.equals("Null")|| mobile.isEmpty() ) {
          	 out.println("Please enter mobile Number.");
          }
        if(address.equals("null")||address.equals("Null")|| address.isEmpty() ) {
          	 out.println("Please enter Address.");
          }
        Connection conn=null;
        Statement stmt=null;
		
     
        try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		 conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","gokada","syam");
		 stmt=conn.createStatement();
		stmt.execute("INSERT INTO students (student_name,class,gender,email,mobile,address,REGISTER_NO,FATHER_NAME,MOTHER_NAME,PASSWORD,isfirsttime)  VALUES ('"+student_name+"', '"+className+"','"+gender+"', '"+email+"', '"+mobile+"', '"+address+"','"+register_no+"','"+father_name+"','"+mother_name+"','"+password+"','"+isfirsttime+"')");
        }
		catch(Exception e) {
			System.out.print(e);
			 out.println("Internal server error!");
		}
        finally {
    		try {
    			stmt.close();
    			conn.close();
    		} catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    	}
      
        
        out.println("your Registration successfully completed with username: "+email  +" and password: "+password);
            
	}
	

}
