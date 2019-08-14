package com.covalense.erest.controllers;

import java.io.Serializable;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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

	@DeleteMapping(path="/deleteEmployee" , produces = MediaType.APPLICATION_JSON_VALUE)
	public  EmployeeResponse deleteEmployee(@RequestParam("id") int id) {
		EmployeeResponse response=new EmployeeResponse(); 
		if (dao.deleteEmployeeInfo(id)) {
			response.setStatusCode(201);
			response.setMessage("Successful");
			response.setDescription("Employee Data Deleted successfully");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Employee Data deletion failed");
			
		}
		return response;
	} //End of deleteEmployee.

	@PostMapping(path="/createEmployee" , produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse addEmployee(@RequestBody EmployeeInfoBean bean) {
		EmployeeResponse response=new EmployeeResponse(); 
		if (dao.createEmployeeInfo(bean)) {
			response.setStatusCode(201);
			response.setMessage("Successful");
			response.setDescription("Employee Data inserted successfully");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Employee Data insertion failed");
			
		}
		return response;
	} //End of addEmployee.

	@PutMapping(path="/update", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse updateEmployee(@RequestBody EmployeeInfoBean bean) {
		EmployeeResponse response=new EmployeeResponse(); 
		if (dao.updateEmployeeInfo(bean)) {
			response.setStatusCode(201);
			response.setMessage("Successful");
			response.setDescription("Employee Data updated successfully");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Employee Data updation failed");
			
		}
		return response;
	}//End of updateEmployee.

	@GetMapping(path="/getEmployee" , produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public EmployeeInfoBean getEmployee(@RequestParam("id")int id) {
		return dao.getEmployeeInfo(id);
	}// End of getEmployee.

	@GetMapping(value="/getAllEmployee" , produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<EmployeeInfoBean> getAllEmployee() {
		return dao.getAllEmployeeListInfo();
	} //End of getAllEmployee.

} //End of class.
