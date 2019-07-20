package com.covalense.mywebbapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.beans.EmployeeInfoBean;

import lombok.extern.java.Log;
@Log
@WebServlet("/currentDate")
public class MyFirstServlet extends HttpServlet {

	@Override
	protected synchronized void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		ServletContext ctx=getServletContext();
		String movieName= ctx.getInitParameter("movie");
		
		ServletConfig config= getServletConfig();
		String actorName=config.getInitParameter("actor");
		
		/*
		 * String currentDateTime= new Date().toString();
		 * 
		 * 
		 * String httpMethod=req.getMethod(); String protocol= req.getProtocol(); String
		 * requestUrl =req.getRequestURI().toString();
		 * 
		 * log.info("HTTP METHOD= "+httpMethod); log.info("Protocol= "+protocol);
		 * log.info("RequestUrl= "+requestUrl);
		 */
		
		
		
		String currentDateTime = new Date().toString();
		
		//Get Query String Information
		String fnameValue = req.getParameter("fname");
		String lnameValue = req.getParameter("lname");
		
		String htmlresponse=
		"<!DOCTYPE html>"+
        "<html>"+
        "<head>"+
        "<title>My First Html</title>"+
        "</head>"+
        "<body>"+
        "<h1>"+
        "Current date & time is:<br>"+
        "<span style=\"color: red\">"+currentDateTime+"</span>"+
        "<br><br>"+
        "First Name : "+fnameValue+
        "<br><br>"+
        "Last name  : "+lnameValue+
        "<br><br>"+
        "movie name  : "+movieName+
        "<br><br>"+
        "actor name  : "+actorName+
        "</h1>"+
        "</body>"+
        "</html>";
		
		//Send the Above HTML Response to browser.
		resp.setContentType("text/html");
		//resp.setHeader("Refresh", "1");
		PrintWriter out= resp.getWriter();
		out.print(htmlresponse);
		
		// Get the object from Forward servlet.
	
		//EmployeeInfoBean empInfo = (EmployeeInfoBean) req.getAttribute("info");
				EmployeeInfoBean empInfo = (EmployeeInfoBean) ctx.getAttribute("info");

				if (empInfo == null) {
					out.print("<HTML>");
					out.print("<BODY>");
					out.print("EmployeeInfoBean object not found");
					out.print("</BODY>");
					out.print("</HTML>");
				} else {
					out.print("<HTML>");
					out.print("<BODY>");
					out.print("<H1><span style=\"color:green\"> EmployeeInfoBean object Found ....</span></H1>");
					out.print("<br>");
					out.print("<br> ID : " + empInfo.getId());
					out.print("<br> Name :" + empInfo.getName());
					out.print("<br> Age :" + empInfo.getAge());
					out.print("<br> Gender :" + empInfo.getGender());
					out.print("</BODY>");
					out.print("</HTML>");

				}

	} // End of doGet method.

} // End of class.
