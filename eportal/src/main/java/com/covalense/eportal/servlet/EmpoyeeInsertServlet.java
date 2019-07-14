package com.covalense.eportal.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.eportal.dao.EmployeeDAO;
import com.covalense.eportal.dao.EmployeeDAOFactory;
import com.covalense.eportal.dto.EmployeeInfoBean;

@WebServlet("/insert")
public class EmpoyeeInsertServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		EmployeeInfoBean empinf = new EmployeeInfoBean();

		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		try {

			empinf.setId(Integer.parseInt(req.getParameter("id")));
			empinf.setName(req.getParameter("name"));
			empinf.setAge(Integer.parseInt(req.getParameter("age")));
			empinf.setAccountNumber(Long.parseLong(req.getParameter("accountnumber")));
			empinf.setDepartmentId(req.getParameter("deptid"));
			empinf.setDesignation(req.getParameter("designation"));
			empinf.setDateOfBirth(format.parse(req.getParameter("dob")));
			empinf.setJoiningDate(format.parse(req.getParameter("joiningdate")));
			empinf.setEmail(req.getParameter("email"));
			empinf.setGender(req.getParameter("gender"));
			empinf.setManagerId(req.getParameter("mgrid"));
			empinf.setSalary(Double.parseDouble(req.getParameter("salary")));
			empinf.setPhnum(Long.parseLong(req.getParameter("phone")));

			EmployeeDAO dao = EmployeeDAOFactory.getInstance();
			boolean result = dao.createEmployeeInfo(empinf);

			PrintWriter out = resp.getWriter();

			if (result) {
				out.print("Employee info inserted");
			} else {
				out.print("Employee info not inserted");
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}