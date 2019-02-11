package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hibernate.Details;

import com.hibernate.Details;

public class RegDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegDetails() {
        super();
      
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
	
		String name=request.getParameter("name");
		String email=request.getParameter("email");
	    String mobileno=request.getParameter("mobileno");
	    long no =Long.parseLong(mobileno);
		String dob=request.getParameter("dob");
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		
		java.util.Date dateOfJoin = null;
		try {
			dateOfJoin = formatter.parse(dob);
		} catch (ParseException e1) {
		
			e1.printStackTrace();
		} 
	 
		Details de = new Details();
		de.saveUserinfo(name, email, no, dateOfJoin);
        RequestDispatcher rd= request.getRequestDispatcher("Display");
		rd.forward(request, response);
 
	}

}
