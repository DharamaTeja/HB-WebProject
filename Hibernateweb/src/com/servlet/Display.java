package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Display() {
        super();
        
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		 PrintWriter pw = response.getWriter();
		 
	       pw.println("Details Added Successfully............");
	      // pw.println("<form action='index.html' method='post'></form>");
	      // pw.print("<br><input type='submit' value='Edit'>");
	      // pw.print("<input type='submit' value='View'>");
	      // pw.print("<input type='submit' value='Delete'>");
	       pw.println("<br><a href='index.jsp'>GoToMain</a>");
	       pw.println("<br><a href='index.html'>Edit</a>");
	       pw.println("<br><a href='index.html'>Delete</a>"); 
	       pw.println("<br><a href='index1.html'>View</a>");
	       
	       
	}

}
