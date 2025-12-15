package com.accenture.servlets;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Welcome() {
    	System.out.println("Welcome()");
    }
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Welcome init()");
	}
	public void destroy() {
		System.out.println("Welcome destroy()");
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Welcome service()");
		request.getRequestDispatcher("Welcome.html").forward(request, response);
	}

}
