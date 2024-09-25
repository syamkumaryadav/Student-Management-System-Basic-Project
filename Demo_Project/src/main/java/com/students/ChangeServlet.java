package com.students;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ChangeServlet
 */
@WebServlet("/ChangeServlet")
public class ChangeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		ServletContext sc=getServletContext();
		String username=(String)sc.getAttribute("username");
		out.print("<body>");
		out.print("Your name :"+username);
	
		out.print("<body>");
		out.print("<a href='http://localhost:8088/Demo_Project/login.jsp'> new form </a>");
		out.print("</body>");
	}

}
