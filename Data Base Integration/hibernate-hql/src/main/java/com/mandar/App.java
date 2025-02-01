package com.mandar;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mandar.entity.Users;

public class App {

	public static void main(String[] args) {

		Users user = new Users("mandardhamale", "simple", "mandar", "dhamale");

//		createUser(user);
		getUser(10);
//		updateUserPassword(10, "complex_password");
//		deleteuser(12);
		
//		hibernateHQL_listing();
//		hibernateHQL_where();
//		hibernateHQL_update();
		hibernateHQL_delete();
		
		
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

		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Users.class).buildSessionFactory();

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

	public static void updateUserPassword(int user_id, String password) {

		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Users.class).buildSessionFactory();

		Session session = sessionFactory.openSession();

		try {

			Users user = new Users();
			session.beginTransaction();

			user = session.get(Users.class, user_id);
			user.setPassword(password);

			session.getTransaction().commit();
			System.out.println("Password updated successfully");

		} finally {
			session.close();
			sessionFactory.close();
		}

	}

	public static void deleteuser(int user_id) {
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Users.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		try {
			
			Users user = new Users();
			session.beginTransaction();
			
			user = session.get(Users.class, user_id);
			session.delete(user);
			
			session.getTransaction().commit();
			System.out.println("User deleted successfully");
			
		} finally {
			session.close();
			sessionFactory.close();
		}
		
		
	}
	
	public static void hibernateHQL_listing() {
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Users.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		try {
			
			session.beginTransaction();
			List<Users> users = session.createQuery("from users").getResultList();
			
			for (Users user : users) {
				System.out.println(user);
			}
			
			
			
		}finally {
			session.close();
			sessionFactory.close();
		}
		
		
	}

	public static void hibernateHQL_where() {
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Users.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		try {
			
			session.beginTransaction();
			List<Users> users = session.createQuery("from users where username='mandardhamale'").getResultList();
			
			for (Users user : users) {
				System.out.println(user);
			}
			
						
		}finally {
			session.close();
			sessionFactory.close();
		}
		
		
	}

	public static void hibernateHQL_update() {
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Users.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		try {
			
			session.beginTransaction();
			session.createQuery("update users set password ='more complex password' where username='mandardhamale'").executeUpdate();
			session.getTransaction().commit();
			System.out.println("Password updated successfully");


		
						
		}finally {
			session.close();
			sessionFactory.close();
		}
		
		
	}

	public static void hibernateHQL_delete() {
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Users.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		try {
	
			
			Users user = new Users();
			session.beginTransaction();
			user = session.get(Users.class, 12);
			session.delete(user);
			session.getTransaction().commit();
			System.out.println("User deleted successfully");
	

			
						
		}finally {
			session.close();
			sessionFactory.close();
		}
		
		
	}

	
	
	
}