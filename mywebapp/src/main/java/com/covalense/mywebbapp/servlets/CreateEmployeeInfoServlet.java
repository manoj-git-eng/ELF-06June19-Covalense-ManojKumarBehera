package com.covalense.mywebbapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.beans.EmployeeInfoBean;
import com.covalense.mywebapp.dao.EmployeeDAO;
import com.covalense.mywebapp.dao.EmployeeDAOFactory;

@WebServlet("/create")
public class CreateEmployeeInfoServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		EmployeeInfoBean bean = new EmployeeInfoBean();

		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		Date date = null;
		try {
			date = format.parse("2013-02-01");
		} catch (ParseException e) {
			e.printStackTrace();
		}

		bean.setId(Integer.parseInt(req.getParameter("id")));
		bean.setName((req.getParameter("name")));
		bean.setAccountNumber(Long.parseLong(req.getParameter("acno")));
		bean.setAge(Integer.parseInt(req.getParameter("age")));
		bean.setDepartmentId(req.getParameter("deptid"));
		bean.setDesignation(req.getParameter("designation"));
		bean.setDateOfBirth(date);
		bean.setEmail(req.getParameter("email"));
		bean.setGender(req.getParameter("gender"));
		bean.setJoiningDate(date);
		bean.setManagerId(req.getParameter("managerid"));
		bean.setPhnum(Long.parseLong(req.getParameter("phone")));
		bean.setSalary(Double.parseDouble(req.getParameter("salary")));

		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		PrintWriter out = resp.getWriter();

		if (dao.createEmpInfo(bean)) {
			out.print("<html>");
			out.print("<body>");
			out.print("employee created");
			out.print("</body> ");
			out.print("</html> ");
		} else {
			out.print("<html>");
			out.print("<body>");
			out.print("employee not found");
			out.print("</body> ");
			out.print("</html> ");
		}
	}
}
