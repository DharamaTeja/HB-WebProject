package com.mccoy.customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
public class Main {
    /**
     * @param args
     */
    public static void main(String[] args)
    {
Customer user = new Customer(); 
Bank b = new Bank();
Bank b2 = new Bank(); 

b.setBankName("Vijaya");
b.setAccType("Savings");
b.setAccNo(1201L);

b2.setBankName("SBI");
b2.setAccType("Current");
b2.setAccNo(5001L);
user.setCustName("Vishwas");
user.setCustEmail("vishwas@gmail.com");

user.getBank().add(b);
user.getBank().add(b2);
       
SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory(); 
Session session = sessionFactory.openSession(); //create the session object
session.beginTransaction(); 

session.save(b); 
session.save(b2);
session.save(user);

session.getTransaction().commit(); 
session.close(); 
}
}