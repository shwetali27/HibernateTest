/*
*@file_Name: StoreData.java
*@Author: Shwetali
*@Date: 20-09-2016
*@purpose: main class for hibernate data entry.
*/

package com.bridgelabz.controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.bridgelabz.dto.Employee;

public class StoreData {
	public static void main(String[] args) {

		// Creating configuration object
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");

		// creating session factory object
		SessionFactory factory = cfg.buildSessionFactory();

		
		// creating session object
		Session session = factory.openSession();

		// creating transaction object
		Transaction t = session.beginTransaction();

		Employee e1 = new Employee();
		// e1.setId(4); //generator tag is used to automatically increment the id
		
		e1.setFirstName("Punam");
		e1.setLastName("Pande");

		session.persist(e1);// persisting the object

		t.commit();// transaction is committed
		session.close();//closing the session

		
		System.out.println("Data successfully stored");

	}
}
