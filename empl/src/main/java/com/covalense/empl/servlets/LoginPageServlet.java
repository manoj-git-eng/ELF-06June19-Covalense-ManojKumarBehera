package com.covalense.empl.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("loginpage")
public class LoginPageServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Cookie dummyCookie = new Cookie("dummyCookie", "CheckCookieEnabled");
		resp.addCookie(dummyCookie);

		// 2.Validating the Sessions.

		PrintWriter out = resp.getWriter();
		HttpSession session = req.getSession(false);
		if (session == null) {
			out.print("<h1><span style = 'color : red'>Invalid session !!! Please login!!!</h1>");
			out.print("<BR><BR>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("log.html");
			dispatcher.include(req, resp);
		}

		else {
			// validate Session nd generate proper response.

			RequestDispatcher dispatcher = req.getRequestDispatcher("/login");
			dispatcher.include(req, resp);
		}
	}
}
