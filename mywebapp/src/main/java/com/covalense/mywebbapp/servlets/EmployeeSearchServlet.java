package com.covalense.mywebbapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.beans.EmployeeInfoBean;
import com.covalense.mywebapp.dao.EmployeeDAO;
import com.covalense.mywebapp.dao.EmployeeDAOFactory;
@WebServlet(urlPatterns = "/search", initParams = { 
		@WebInitParam(name = "actress", value = "basanti") 
		}
)
//@WebServlet("/search/employeeSearch")
public class EmployeeSearchServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ServletContext ctx = getServletContext();
		String movieName = ctx.getInitParameter("movie");
		
		

		ServletConfig config = getServletConfig();
		String actorName = config.getInitParameter("actor");
		String actressName = config.getInitParameter("actress");

		String idValue = req.getParameter("id");

		// Interact with DB.
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean = dao.getEmployeeInfo(idValue);

		// Send the response to browser.
		PrintWriter out = resp.getWriter();
		if (bean == null) {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("employee not found");
			out.print("</BODY>");
			out.print("</HTML>");
		} else {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style=\"color:green\"> Employee Found ....</span></H1>");
			out.print("<br>");
			out.print("<br> ID : " + bean.getId());
			out.print("<br> Name :" + bean.getName());
			out.print("<br> Age :" + bean.getAge());
			out.print("<br> DOB :" + bean.getDateOfBirth());
			out.print("<br> Gender :" + bean.getGender());
			out.print("<br> Phone No :" + bean.getPhnum());
			out.print("<br> Joining Date :" + bean.getJoiningDate());
			out.print("<br> Acc no :" + bean.getAccountNumber());
			out.print("<br> Designation :" + bean.getDesignation());
			out.print("<br> Department Id :" + bean.getDepartmentId());
			out.print("<br> Salary :" + bean.getSalary());
			out.print("<br> Manager id :" + bean.getManagerId());
			out.print("<br> Movie name :" + movieName);
			out.print("<br> Actor name :" + actorName);
			out.print("<br> Email :" + bean.getEmail());
			out.print("</BODY>");
			out.print("</HTML>");

		}

	}// End of doGet Method.

}// End of class.
