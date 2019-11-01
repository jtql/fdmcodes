package com.fdmgroup.SecurityAndDataAccessExample;

import java.io.IOException;
import java.security.Principal;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HomePageServlet
 */
public class HomePageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// This Servlet will only run if the User jas logged in successfully
		// Tomcat will populate the Session and Principal for us with the User's
		// isername and role
		HttpSession session = request.getSession();
		Principal p = request.getUserPrincipal();// get current active user
		// Check if the user is an Admin
		String username = p.getName();
		session.setAttribute(username, true);
		// Make a call to the DAO to get some information about the user from the
		// database
		DatabaseAccessObject dao = new DatabaseAccessObject();
		String address = dao.getUserAddress(username);

		request.setAttribute("username", username);
		request.setAttribute("userAddress", address);

		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/protectedHomePage.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
