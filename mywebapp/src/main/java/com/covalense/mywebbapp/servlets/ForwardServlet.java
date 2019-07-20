package com.covalense.mywebbapp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.IOP.ServiceContext;

import com.covalense.mywebapp.beans.EmployeeInfoBean;

@WebServlet("/forward")
public class ForwardServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		EmployeeInfoBean empInfo= new EmployeeInfoBean();
		empInfo.setId(289);
		empInfo.setName("Sanju");
		empInfo.setGender("Female");
		empInfo.setAge(28);
		
		
		//Passing the above Object to employeeInfoBean.
		//req.setAttribute("info",empInfo);
		ServletContext ctx=getServletContext();
		ctx.setAttribute("info", empInfo);
		
		String url = "search?id=2";
		RequestDispatcher dispatcher = req.getRequestDispatcher(url);
		dispatcher.forward(req, resp);

	}

}
