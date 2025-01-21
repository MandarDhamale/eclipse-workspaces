package com.mrd;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Controller() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at(get): ").append(request.getContextPath());
		
		PrintWriter out = response.getWriter();

		String[] languages = request.getParameterValues("languages");

		out.println();
		out.println("Name: " + request.getParameter("fullname"));
		out.println("Gender: " + request.getParameter("gender"));
		out.println("Country: " + request.getParameter("country"));
		out.print("Languages: ");

		if (languages != null) {
			for (String lang : languages) {
				out.print(lang + " ");
			}
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		doGet(request, response);
		response.getWriter().append("Served at(post): ").append(request.getContextPath());

		PrintWriter out = response.getWriter();

		String[] languages = request.getParameterValues("languages");

		out.println();
		out.println("Name: " + request.getParameter("fullname"));
		out.println("Gender: " + request.getParameter("gender"));
		out.println("Country: " + request.getParameter("country"));
		out.print("Languages: ");

		if (languages != null) {
			for (String lang : languages) {
				out.print(lang + " ");
			}
		}

	}

}
