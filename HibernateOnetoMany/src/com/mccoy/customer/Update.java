package com.mccoy.customer;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


public class Update {
	
	public static void main(String[] args)
	{
		Update u=new Update();
		u.updateCustomer();
	}
	public void updateCustomer() {

		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession(); //create the session object
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			String queryString = "from Customer where Customer_ID = :custId";
			Query query = session.createQuery(queryString);
				query.setInteger("custId", 20);
			Customer cust = (Customer) query.uniqueResult();
			cust.setCustEmail("vishwas1234@gmail.com");
				session.update(cust);
			System.out.println("Employee records updated!");
			transaction.commit();
		} catch (HibernateException e) {

			transaction.rollback();

			e.printStackTrace();

		}
		finally 
		{
			session.close();
		}
	}

}
