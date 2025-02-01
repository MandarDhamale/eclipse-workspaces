package com.mandar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mandar.entity.Users;

public class App {

	public static void main(String[] args) {

		Users user = new Users("mkd", "pwd", "mak", "dha");
		
		getUser(8);

	}

	public static void createUser(Users user) {
		// Load Hibernate configuration
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");

		// Build the SessionFactory
		SessionFactory sessionFactory = config.buildSessionFactory();

		// Open a session
		Session session = sessionFactory.openSession();

		// Begin a transaction
		session.beginTransaction();

		// Create a new Employee object
//        Users user = new Users("mandardhamale","password","mandar","dhamale");

		// Save the user to the database
		session.save(user);

		// Commit the transaction
		session.getTransaction().commit();

		// Close the session and SessionFactory
		session.close();
		sessionFactory.close();

		System.out.println("Employee saved successfully!");
	}

	public static void getUser(int user_id) {

		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Users.class)
				.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		

		try {

			Users user = new Users();

			session.beginTransaction();

			user = session.get(Users.class, user_id);

			session.getTransaction().commit();
			System.out.println(user);

		} finally {
			session.close();
			sessionFactory.close();
		}

	}

}