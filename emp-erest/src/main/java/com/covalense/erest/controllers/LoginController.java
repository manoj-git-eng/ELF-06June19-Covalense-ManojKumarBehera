package com.covalense.erest.controllers;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.erest.dao.EmployeeDAO;
import com.covalense.erest.dto.EmployeeInfoBean;

@RestController
@RequestMapping("/login")
public class LoginController {
	@Autowired
	@Qualifier("hibernate")
	private EmployeeDAO dao;

	@PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse login(int id, String password, HttpServletRequest request) {
		EmployeeInfoBean bean = dao.getEmployeeInfo(id);
		EmployeeResponse response = new EmployeeResponse();
		if (bean.getPassword().equals(password)) {
			response.setStatusCode(201);
			response.setMessage("Successful");
			response.setDescription("Logged in successfully");
			response.setBean(Arrays.asList(bean));
			request.getSession().setAttribute("bean", bean);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Log in failed");

		}
		return response;
	}

	@GetMapping(value = "/logout", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse logout(HttpSession session) {
		session.invalidate();
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(201);
		response.setMessage("Successful");
		response.setDescription("Log Out Successfully");
		return response;

	}

	@GetMapping(value = "/readCookie", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse readCookie(@CookieValue(name = "JSESSIONID") String sessionId) {
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(201);
		response.setMessage("Successful");
		response.setDescription(" JSESSIONID= " + sessionId);
		return response;
	}

}
