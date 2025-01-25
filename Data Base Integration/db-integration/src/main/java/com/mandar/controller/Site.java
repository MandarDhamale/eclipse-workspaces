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

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
