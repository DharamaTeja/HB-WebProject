package com.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

	public class hbutil {
	    private static final SessionFactory sessionFactory;
	    static {
	        try {
	            sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	        } catch (Throwable ex) {
	            System.err.println("SessionFactory creation failed" + ex);
	            throw new ExceptionInInitializerError(ex);
	        }
	    }
	 
	    public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }
	}
