package com.mandar;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/MemberAreaController")
public class MemberAreaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MemberAreaController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");

		switch (action) {
		case "destroy": {

			request.getSession().invalidate();
			Cookie[] cookies = request.getCookies();

			for (Cookie c : cookies) {
				if (c.getName().equals("username")) {
					c.setValue(null);
					c.setMaxAge(0);
					response.addCookie(c);
				}
			}
			response.sendRedirect("login.jsp");
		}
		}
	}
}
