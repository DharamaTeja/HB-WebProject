package com.mccoy.customer;


import org.hibernate.HibernateException;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Delete {
	
	public static void main(String[] args)
	{
		Delete d=new Delete();
		d.deleteCustomer();
	}

	public void deleteCustomer() {
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession(); //create the session object
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			String queryString = "from Customer where Customer_NAME = :custName";
			Query query = session.createQuery(queryString);
			query.setString("custName","Vishwas");
			Customer cst = (Customer) query.uniqueResult();
			session.delete(cst);
			System.out.println("Customer row deleted");
               transaction.commit();
		} 
		catch (HibernateException e) 
		{
			transaction.rollback();

			e.printStackTrace();

		} finally {

			session.close();

		}
	}

}
