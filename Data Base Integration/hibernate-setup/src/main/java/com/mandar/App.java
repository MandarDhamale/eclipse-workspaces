package com.mandar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mandar.entity.Users;

public class App {
    public static void main(String[] args) {
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
        Users employee = new Users("m","m","m","m");

        // Save the employee to the database
        session.save(employee);

        // Commit the transaction
        session.getTransaction().commit();

        // Close the session and SessionFactory
        session.close();
        sessionFactory.close();

        System.out.println("Employee saved successfully!");
    }
}