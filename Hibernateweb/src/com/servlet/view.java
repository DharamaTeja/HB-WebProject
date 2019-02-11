package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import com.hibernate.Userinfo;
import com.hibernate.hbutil;

public class view extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public view() {
        super();
        
    }
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//String name=request.getParameter("name");
		 PrintWriter pw=response.getWriter();
		 response.setContentType("text/html");
	
				String sql="from Userinfo";
				
				SessionFactory sf = hbutil.getSessionFactory();
				Session session = sf.openSession();
				Query q = session.createQuery(sql);
				Iterator it = q.iterate();
				
				pw.append("<table border=1\"><tr>");
				pw.append("<th>id</th> <th>name</th> <th>email</th> <th>mobileno</th> <th>dob</th>");
				
				while(it.hasNext()) {
					
					Userinfo ui = (Userinfo) it.next();
					pw.append("<tr><td>"+ui.getId()+"</td></tr>");
					pw.append("<td>"+ui.getName()+"</td>");
					pw.append("<td>"+ui.getEmail()+"</td>");
					pw.append("<td>"+ui.getMobileno()+"</td>");
					pw.append("<td>"+ui.getDob()+"</td></tr>");
				}
			        pw.print("</table>");
				    pw.println("<br><a href='index.jsp'>GoToMain</a>");
}
}