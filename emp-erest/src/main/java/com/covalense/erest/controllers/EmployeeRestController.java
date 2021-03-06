package com.covalense.erest.controllers;

import java.io.Serializable;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.InitBinder;

import com.covalense.erest.dao.EmployeeDAO;
import com.covalense.erest.dto.EmployeeInfoBean;

@SuppressWarnings("serial")
@RestController
@RequestMapping("/rest")
public class EmployeeRestController implements Serializable {
	@Autowired
	@Qualifier("hibernate")
	EmployeeDAO dao;

	@InitBinder
	public void InitBinder(WebDataBinder binder) {
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, editor);
	}

	@DeleteMapping(path = "/deleteEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse deleteEmployee(@RequestParam("id") int id, HttpServletRequest request) {
		EmployeeResponse response = new EmployeeResponse();
		if (request.getSession(false) != null) {
			if (dao.deleteEmployeeInfo(id)) {
				response.setStatusCode(201);
				response.setMessage("Successful");
				response.setDescription("Employee Data Deleted successfully");
			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDescription("Employee Data deletion failed");

			}
			return response;
		} else {

			response.setStatusCode(501);
			response.setMessage("Failure");
			response.setDescription("Please log in First!!");
			return response;
		}
	}

	@PostMapping(path = "/createEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse addEmployee(@RequestBody EmployeeInfoBean bean) {
		EmployeeResponse response = new EmployeeResponse();
		if (dao.createEmployeeInfo(bean)) {
			response.setStatusCode(201);
			response.setMessage("Successful");
			response.setDescription("Employee Data inserted successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Employee Data insertion failed");

		}
		return response;
	} // End of addEmployee.

	@PutMapping(path = "/updateEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse updateEmployee(@RequestBody EmployeeInfoBean bean, HttpServletRequest request) {

		EmployeeResponse response = new EmployeeResponse();
		if (request.getSession(false) != null) {
			if (dao.updateEmployeeInfo(bean)) {
				response.setStatusCode(201);
				response.setMessage("Successful");
				response.setDescription("Employee Data updated successfully");
			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDescription("Employee Data updation failed");

			}
			return response;
		} else {
			response.setStatusCode(501);
			response.setMessage("Failure");
			response.setDescription("Please log in First!!");
			return response;
		}
	}

	@GetMapping(path = "/getEmployee", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public EmployeeResponse getEmployee(@RequestParam("id") int id, HttpServletRequest request) {
		EmployeeResponse response = new EmployeeResponse();
		if (request.getSession(false) != null) {
			EmployeeInfoBean bean = dao.getEmployeeInfo(id);

			if (bean != null) {
				response.setStatusCode(201);
				response.setMessage("Successful");
				response.setDescription("Employee Data Found !!");
				response.setBean(Arrays.asList(bean));

			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDescription("Employee Data NOT Found !!");

			}
			return response;

		} else {
			response.setStatusCode(501);
			response.setMessage("Failure");
			response.setDescription("Please log in First!!");
			return response;
		}

	}

	@GetMapping(value = "/getAllEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployee(HttpServletRequest request) {

		EmployeeResponse response = new EmployeeResponse();
		if (request.getSession(false) != null) {
			List<EmployeeInfoBean> beans = dao.getAllEmployeeListInfo();

			if (beans != null) {
				response.setStatusCode(201);
				response.setMessage("Successful");
				response.setDescription("Employee Data Found !!");
				response.setBean(beans);

			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDescription("Employee Data NOT Found !!");

			}
			return response;
		} else {
			response.setStatusCode(501);
			response.setMessage("Failure");
			response.setDescription("Please log in First!!");
			return response;
		}

	}
}
