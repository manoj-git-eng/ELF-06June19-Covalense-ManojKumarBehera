package com.covalense.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactory;

@Controller
@RequestMapping("/webapp")
public class EmpController {

	@GetMapping("/emplogin")
	public String getEmp() {
		return "emplogin";
	}

	@PostMapping("/homepage")
	public String getHome(int id, String password, ModelMap modelMap) {

		EmployeeDAO factory = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();

		if (password == null) {
			return "emplogin";

		} else if (employeeInfoBean.getPassword().equals(password)) {
			modelMap.addAttribute("bean", employeeInfoBean);
			return "homepage";

		} else {
			return "emplogin";

		}

	}

}
