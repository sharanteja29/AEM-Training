package com.accenture.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// Anything
    public Login() {
        System.out.println("Login()");
    }
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Login Init()");
	}
	public void destroy() {
		System.out.println("Login Destroy()");
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Login Service()");
		
		PrintWriter writer = response.getWriter();
		
		String username = request.getParameter("username");
		String pass = request.getParameter("password");
		
		if(username.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("admin123")) {
//			System.out.println("Welcome");
//			writer.print("<h1>Welcome Accenture<h1/>");
			// RequestDispatcher Use to forward the request
//			RequestDispatcher dispatcher = request.getRequestDispatcher("/Welcome").forward(request, response);
			request.getRequestDispatcher("/Welcome").forward(request, response);
		}
		else {
//			System.out.println("Invalid Credentials");
			writer.print("Invalid Credentials<br>");
			request.getRequestDispatcher("/LoginException").include(request, response);
		}
		
	}

}
