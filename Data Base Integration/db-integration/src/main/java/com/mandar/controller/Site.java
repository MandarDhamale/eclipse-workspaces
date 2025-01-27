package com.mandar.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.mandar.entity.User;
import com.mandar.model.UsersModel;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/site")
public class Site extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Site() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String page = request.getParameter("page").toLowerCase();

		
		switch (page) {
		case "home": {
			
			request.setAttribute("title", "Home Page");
			request.getRequestDispatcher("index.jsp").forward(request, response);
			break;
		}
		
		case "adduser":{
			
			addUser(request, response);
			break;
			
		}
		
		case "listusers": {
			
			listUsers(request, response);
			break;
			
		}
		
		
		default:
			request.setAttribute("title", "Error Page");
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String form = request.getParameter("form").toLowerCase();

		
		switch (form) {
		case "adduseroperation": {
			
			String username = request.getParameter("username");
			String email = request.getParameter("email");
			
			new UsersModel().addUser(new User(0, username, email));
			request.getRequestDispatcher("home.jsp").forward(request, response);

			break;
		}
	
	
		default:
			request.setAttribute("title", "Error Page");
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
	
	
	}
	
	protected void listUsers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<User> users = new ArrayList<User>();
		users = new UsersModel().listuser();
	
		request.setAttribute("listUsers", users);
		request.setAttribute("title", "List Users");
		request.getRequestDispatcher("listusers.jsp").forward(request, response);
		
	}
	

	protected void addUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("title", "Add user Page");
		request.getRequestDispatcher("adduser.jsp").forward(request, response);
		
		
	}
	

}
