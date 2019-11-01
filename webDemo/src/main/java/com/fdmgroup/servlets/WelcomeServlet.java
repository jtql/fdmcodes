package com.fdmgroup.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
public class WelcomeServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String[] stringArray = { "apple", "orange", "peach" };
		request.setAttribute("fruits", stringArray);//to send to hello.jsp
		String userName = (String) request.getParameter("userName");//captures from welcome.html
		request.setAttribute("name", userName);
		RequestDispatcher reqDisp = request.getRequestDispatcher("hello.jsp");

		reqDisp.forward(request, response);
	}

}
