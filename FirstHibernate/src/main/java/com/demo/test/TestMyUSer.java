package com.demo.test;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.MyUser;


public class TestMyUSer {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session s = sf.openSession();
		Transaction tx =s.beginTransaction();
		
		MyUser u1 = new MyUser(2,"Tanmay","tanmay@gmail.com","9595912200");
		s.save(u1);
				
		tx.commit();
		s.close();
		sf.close();
		
		
	}

}
