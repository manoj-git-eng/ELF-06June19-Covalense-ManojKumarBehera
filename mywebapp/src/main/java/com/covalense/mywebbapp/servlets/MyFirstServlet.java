package com.covalense.mywebbapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.java.Log;
@Log
public class MyFirstServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String httpMethod=req.getMethod();
		String protocol= req.getProtocol();
		String requestUrl =req.getRequestURI().toString();
		
		log.info("HTTP METHOD= "+httpMethod);
		log.info("Protocol= "+protocol);
		log.info("RequestUrl= "+requestUrl);
		
		
		
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
        "</h1>"+
        "</body>"+
        "</html>";
		
		//Send the Above HTML Response to browser.
		resp.setContentType("text/html");
		//resp.setHeader("Refresh", "1");
		PrintWriter out= resp.getWriter();
		out.print(htmlresponse);
	} // End of doGet method.

} // End of class.
