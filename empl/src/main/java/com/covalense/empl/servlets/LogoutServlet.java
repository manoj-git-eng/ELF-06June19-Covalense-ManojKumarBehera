package com.covalense.empl.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogoutServlet
 */
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//3. Invalidate the session.
		HttpSession session = request.getSession(false);
		if (session != null) {
			session.invalidate();
		}
		PrintWriter out = response.getWriter();

		out.print("<HTML>");
		out.print("<BODY>");
		out.print("<H4><span style =\"color : red\">Thanks for visiting !!! </span></H4>");
		out.print("<BR>");
		out.print("</BODY>");
		out.print("</HTML>");
		RequestDispatcher dispatcher = null;
		response.setContentType("text/html");
		dispatcher = request.getRequestDispatcher("EMP/emp.html");
		dispatcher.include(request, response);

	}

}
