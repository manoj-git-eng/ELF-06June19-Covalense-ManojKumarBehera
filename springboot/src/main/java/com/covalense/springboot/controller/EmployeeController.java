package com.covalense.springboot.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.covalense.springboot.dto.EducationDetailsInfoBean;
import com.covalense.springboot.dto.EmployeeAddressInfoBean;
import com.covalense.springboot.dto.EmployeeExperienceInfoBean;
import com.covalense.springboot.dto.EmployeeInfoBean;
import com.covalense.springboot.dto.EmployeeResponse;
import com.covalense.springboot.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeRepository repository;

	@GetMapping(path = "/", produces = MediaType.TEXT_PLAIN_VALUE)
	public String helloWorld() {
		return "Hello World";
	}

	@PostMapping(path = "/create", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse createEmployee(@RequestBody EmployeeInfoBean bean) {
		bean.getEmployeeOtherInfoBean().setInfoBean(bean);
		for (EmployeeAddressInfoBean addressInfoBean : bean.getAddressInfoBean()) {
			addressInfoBean.getAddressPKBean().setInfoBean(bean);
		}
		for (EducationDetailsInfoBean educationDetailsInfoBean : bean.getEducationDetailsInfoBeans()) {
			educationDetailsInfoBean.getEducationDetailsPKBean().setInfoBean(bean);
		}
		for (EmployeeExperienceInfoBean employeeExperienceInfoBean : bean.getEmployeeExperienceInfoBeans()) {
			employeeExperienceInfoBean.getEmployeeExPKBean().setInfoBean(bean);
		}
		EmployeeInfoBean manager = bean.getMngrId();
		manager = repository.findById(manager.getId()).get();
		bean.setMngrId(manager);

		EmployeeResponse response = new EmployeeResponse();
		if (!repository.existsById(bean.getId())) {
			repository.save(bean);
			response.setstatuscode(201);
			response.setMessage("Succesful");
			response.setDescription("Employee data added succsesfully");
		} else {
			response.setstatuscode(401);
			response.setMessage("Failed");
			response.setDescription("Employee data not added to DB");
		}
		return response;
	}

	@GetMapping(path = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployee(@RequestParam("id") int id) {
		EmployeeResponse response = new EmployeeResponse();
		if (repository.existsById(id)) {
			EmployeeInfoBean bean = repository.findById(id).get();
			response.setstatuscode(201);
			response.setMessage("Succesful");
			response.setDescription("Employee data found succsesfully");
			response.setBean(Arrays.asList(bean));
		} else {
			response.setstatuscode(401);
			response.setMessage("Failed");
			response.setDescription("Employee data not found");
		}
		return response;
	}
	@PutMapping(path = "/update", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getUpdate(@RequestBody EmployeeInfoBean bean) {
		bean.getEmployeeOtherInfoBean().setInfoBean(bean);
		for (EmployeeAddressInfoBean addressInfoBean : bean.getAddressInfoBean()) {
			addressInfoBean.getAddressPKBean().setInfoBean(bean);
		}
		for (EducationDetailsInfoBean educationDetailsInfoBean : bean.getEducationDetailsInfoBeans()) {
			educationDetailsInfoBean.getEducationDetailsPKBean().setInfoBean(bean);
		}
		for (EmployeeExperienceInfoBean employeeExperienceInfoBean : bean.getEmployeeExperienceInfoBeans()) {
			employeeExperienceInfoBean.getEmployeeExPKBean().setInfoBean(bean);
		}
		EmployeeInfoBean manager = bean.getMngrId();
		manager = repository.findById(manager.getId()).get();
		bean.setMngrId(manager);

		EmployeeResponse response = new EmployeeResponse();
		if (repository.existsById(bean.getId())) {
			repository.save(bean);
			response.setstatuscode(201);
			response.setMessage("Succesful");
			response.setDescription("Employee data updated succsesfully");
			repository.save(bean);
		} else {
			response.setstatuscode(401);
			response.setMessage("Failed");
			response.setDescription("Employee data updation failed");
		}
		return response;
	}
	@DeleteMapping(path = "/delete", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse deleteEmployee(@RequestParam("id") int id) {
		EmployeeInfoBean bean = repository.findById(id).get();
		EmployeeResponse response = new EmployeeResponse();
		if (bean != null) {
			response.setstatuscode(201);
			response.setMessage("Succesful");
			response.setDescription("Employee deleted succsesfully");
			response.setBean(Arrays.asList(bean));
			repository.delete(bean);
		} else {
			response.setstatuscode(401);
			response.setMessage("Failed");
			response.setDescription("Employee deletion fails");
		}
		return response;
	}
	
	

}
