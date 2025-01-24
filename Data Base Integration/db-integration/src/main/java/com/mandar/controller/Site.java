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

@WebServlet("/Site")
public class Site extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Site() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = request.getParameter("page").toLowerCase();
		
		switch (page) {

		case "listusers": {
			
			List<User> users = new ArrayList<User>();
			users = new UsersModel().listuser();
			
			request.setAttribute("listUsers", users);
			request.setAttribute("title", "List Users");
			
			request.getRequestDispatcher("listusers.jsp").forward(request, response);
			break;
		}
		default:
			request.setAttribute("title", "Error Page");
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}	
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
