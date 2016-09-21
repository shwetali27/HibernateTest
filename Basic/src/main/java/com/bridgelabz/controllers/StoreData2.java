/*
*@file_Name: StoreData2.java
*@Author: Shwetali
*@Date: 20-09-2016
*@purpose: main class for hibernate data entry using Annotation.
*/

package com.bridgelabz.controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.bridgelabz.dto.Employee2;

public class StoreData2 {
	public static void main(String[] args) {

		// Creating configuration object
		Configuration cfg = new Configuration().configure("hibernateAnnotation.cfg.xml");

		// creating session factory object
		SessionFactory factory = cfg.buildSessionFactory();

		// creating session object
		Session session = factory.openSession();

		// creating transaction object
		Transaction t = session.beginTransaction();

		Employee2 e1 = new Employee2();
		//e1.setId(1001);
		e1.setFirstName("Jit");
		e1.setLastName("Pande");

		Employee2 e2 = new Employee2();
		//e2.setId(1002);
		e2.setFirstName("Pooja");
		e2.setLastName("Singh");

		session.persist(e1);// persisting the object
		session.persist(e2);

		t.commit();// transaction is committed
		session.close();// closing the session

		System.out.println("Data successfully stored");

	}
}
