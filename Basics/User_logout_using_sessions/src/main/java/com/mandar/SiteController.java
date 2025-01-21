package com.mandar;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/SiteController")
public class SiteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SiteController() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String action = request.getParameter("action");
		
		switch (action) {
		case "login":
			request.getRequestDispatcher("login.jsp").forward(request, response);
			break;

		default:
			request.getRequestDispatcher("index.jsp").forward(request, response);
			break;
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		
		switch (action) {
		case "authenticate":
			authenticate(request, response);
			break;

		default:
			request.getRequestDispatcher("index.jsp").forward(request, response);
			break;
		}
		
		
		
	}
	
	protected void authenticate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("(Post) Served at: ").append(request.getContextPath());

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		
		if(username.equals("admin") && password.equals("1234")) {
			
			request.getSession().invalidate();
			HttpSession newSession = request.getSession();
			newSession.setMaxInactiveInterval(500);
			newSession.setAttribute("username", username);
			newSession.setAttribute("password", password);
			response.sendRedirect(request.getContextPath() + "/MemberAreaController?action=memberArea");
			
		}else {
			response.sendRedirect(request.getContextPath() + "/SiteController?action=login");
		}
		
		
	}
	

}
