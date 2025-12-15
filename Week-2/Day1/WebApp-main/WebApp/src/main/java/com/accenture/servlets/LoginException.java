package com.accenture.servlets;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginException extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginException() {
    	System.out.println("LoginException()");
    }
	public void init(ServletConfig config) throws ServletException {
		System.out.println("LoginException init()");
	}
	public void destroy() {
		System.out.println("LoginException destroy()");
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LoginException service()");
		request.getRequestDispatcher("Login.html").include(request, response);
	}

}
