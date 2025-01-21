package com.mandar;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
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
		response.getWriter().append("(Get) Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("(Post) Served at: ").append(request.getContextPath());

		String username = request.getParameter("username");
		String password = request.getParameter("password");
//		String redirectUrl = "member.jsp?username=" + username; 
		request.setAttribute("username", username);
		
		
		if(username.equals("admin") && password.equals("1234")) {
			request.getSession().invalidate();
			HttpSession newSession = request.getSession();
			newSession.setMaxInactiveInterval(500);
//			response.sendRedirect(redirectUrl);
			
			//Cookies
			Cookie un_cookie = new Cookie("username", username);
			response.addCookie(un_cookie);
			
			Cookie pw_cookie = new Cookie("password", password);
			response.addCookie(pw_cookie);
			
//			response.sendRedirect("member.jsp");
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("member.jsp");
			dispatcher.forward(request, response);
			
		}else {
			response.sendRedirect("login.jsp");
		}
		
		
		
	}

}
