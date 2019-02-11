package com.hibernate;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Details {
	
	public  void saveUserinfo(String name, String email, long mobileno, Date dob) {
		
		        Session session = hbutil.getSessionFactory().openSession();
		        Transaction transaction = null;
		 
		        try {
		            transaction = session.beginTransaction();
		          
		            Userinfo user = new Userinfo();
        
                    user.setName(name);
                    user.setEmail(email);
                    user.setMobileno(mobileno);
                    user.setDob(dob);
                    session.save(user);
        
                   transaction.commit();
                   System.out.println("Information Added ");
        
		        } catch (HibernateException e) {
		            transaction.rollback();
		            e.printStackTrace();
		        } finally {
		            session.close();
		        }
}
}