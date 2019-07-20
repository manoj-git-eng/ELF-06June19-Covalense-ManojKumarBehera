package com.covalense.empl.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.covalense.empl.beans.EmployeeInfoBean;
import com.covalense.empl.dao.EmployeeDAO;
import com.covalense.empl.dao.EmployeeDAOFactory;

import lombok.extern.java.Log;

@Log
@WebServlet("/login")
public class HomepageServlet extends HttpServlet {
	@Override
	protected synchronized void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String url = "http://localhost/empl/log.html?error=invalid";
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean = dao.getEmployeeInfo(Integer.parseInt(req.getParameter("id")));
		if (bean.getPassword() == null) {
			resp.sendRedirect(url);
		} else if (bean.getPassword().equals(req.getParameter("password"))) {

			// Valid credentials.Creating the Session.
			HttpSession session = req.getSession(true);

			PrintWriter out = resp.getWriter();

			out.print("<!DOCTYPE html>");
			out.print("<html lang='en'>");

			out.print("<head>");
			out.print("<meta charset='UTF-8'>");
			out.print("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
			out.print("<meta http-equiv='X-UA-Compatible' content='ie=edge'>");
			out.print("<title>Document</title>");
			out.print(
					"<link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css' "
							+ "integrity='sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T' crossorigin='anonymous'>");

			out.print("</head>");
			out.print("<body>");
			out.print("<nav class='navbar navbar-expand-lg navbar-dark bg-dark'>");
			out.print(
					"<a class='navbar-brand' href='#'><img height='100px' width='100px' src='https://cdn.pixabay.com/photo/2015/09/18/11/46/man-945482__340.jpg' alt=''></a>");
			out.print(
					"<button class='navbar-toggler' type='button' data-toggle='collapse' data-target='#navbarSupportedContent' aria-controls='navbarSupportedContent' aria-expanded='false' aria-label='Toggle navigation'>");
			out.print("	<span class='navbar-toggler-icon'></span>");
			out.print("	</button>");
			out.print("<div class='collapse navbar-collapse' id='navbarSupportedContent'>");
			out.print("<ul class='navbar-nav mr-auto'>");
			out.print("<li class='nav-item active'>");
			out.print("	<form class='form-inline my-2 my-lg-0'>");
			out.print("<input class='form-control mr-sm-2' type='search' placeholder='Search' aria-label='Search'>");
			out.print("<button class='btn btn-outline-success my-2 my-sm-0' type='submit'>Search</button>");
			out.print("</form>");
			out.print("</li>");
			out.print("</ul>");
			out.print("<form class='form-inline my-2 my-lg-0'>");
			out.print("<button class='btn btn-outline-success my-2 my-sm-0' type='submit' href='/logout'>Log Out</button>");
			out.print("</form>");
			out.print("</div>");
			out.print("</nav>");
			out.print("<center>");
			out.print("<table border='5'>");
			out.print("<tr>");
			out.print("<th>");
			out.print(" <div class='data-display'><h2>ID: " + bean.getId() + "'</h2></div>");
			out.print("<div class='data-display'><h2>Name: " + bean.getName() + "'</h2></div>");
			out.print("<div class='data-display'><h2>Age: " + bean.getAge() + "'</h2></div>");
			out.print("<div class='data-display'><h2>Gender: " + bean.getGender() + "'</h2></div>");
			out.print("<div class='data-display'><h2>DOB :" + bean.getDateOfBirth() + "'</h2></div>");
			out.print("<div class='data-display'><h2>Designation :" + bean.getDesignation() + "'</h2></div>");
			out.print("<div class='data-display'><h2>Joining Date :" + bean.getJoiningDate() + "'</h2></div>");
			out.print("<div class='data-display'><h2>Phone No :" + bean.getPhnum() + "'</h2></div>");
			out.print("<div class='data-display'><h2>Email :" + bean.getEmail() + "'</h2></div>");
			out.print("<div class='data-display'><h2>Acc No :" + bean.getAccountNumber() + "'</h2></div>");
			out.print("<div class='data-display'><h2>Salary :" + bean.getSalary() + "'</h2></div>");
			out.print(" <div class='data-display'><h2>Department ID :" + bean.getDepartmentId() + "'</h2></div>");
			out.print("<div class='data-display'><h2>Manager ID :" + bean.getManagerId() + "'</h2></div>");
			out.print("</th>");
			out.print("</tr>");
			out.print("</table>");
			out.print(" </center>");

			out.print("</body>");
			out.print("</html>");

		} else {
			resp.sendRedirect(url);

		}

	} // End of doGet method.

} // End of class.
