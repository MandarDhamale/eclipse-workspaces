package com.mandar;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
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
		case "destroy": 
			request.getSession().invalidate();
			response.sendRedirect(request.getContextPath() + "/SiteController?action=login");
			break;
		
		case "memberArea":
			request.getRequestDispatcher("member.jsp").forward(request, response);
			
		default: 
			throw new IllegalArgumentException();

		}
	}
}
