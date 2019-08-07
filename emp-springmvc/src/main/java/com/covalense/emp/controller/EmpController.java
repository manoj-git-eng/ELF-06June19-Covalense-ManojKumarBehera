package com.covalense.emp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactoryOld;

@Controller
@RequestMapping("/webapp")
public class EmpController {

	//@GetMapping("/emplogin")
	public String getEmp() {
		return "emplogin";
	}

	public void InitBinder(WebDataBinder binder) {
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, editor);
	} // End of initBinder()

	//@GetMapping("/homepage")
	public String getHome(int id, String password, ModelMap modelMap) {

		EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();

		//Session session = HibernateUtil.openSession();

		//employeeInfoBean = session.get(EmployeeInfoBean.class, id);

		if (password == null) {
			return "emplogin";

		} else if (employeeInfoBean.getPassword().equals(password)) {
			modelMap.addAttribute("msg", "login successful!!!");
			return "homepage";

		} else {
			return "emplogin";

		}

	}

}
