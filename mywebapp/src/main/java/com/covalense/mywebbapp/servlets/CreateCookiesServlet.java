package com.covalense.mywebbapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/createCookie")
public class CreateCookiesServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		// Create cookie.
		Cookie myNameCookie = new Cookie("myName", "Manoj");
		Cookie myLocationCookie = new Cookie("myLocation", "Bangalore");

		myLocationCookie.setMaxAge(7*24*60*60); //Time in second.
		// Send the above cookie to BROWSER.
		resp.addCookie(myNameCookie);
		resp.addCookie(myLocationCookie);

		PrintWriter out = resp.getWriter();
		out.print("Created the cookie----");
	} //End of doGet.

} //End of class.
