package com.covalense.emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.covalense.emp.beans.EmployeeInfoBean;
import static com.covalense.emp.common.EmpCommons.VIEW_HOMEPAGE;
import static com.covalense.emp.common.EmpCommons.VIEW_LOGINPAGE;
import com.covalense.emp.dao.EmployeeDAO;

@Controller
@RequestMapping("/login")
@PropertySource("classpath:emp.properties")
public class LoginController {
	@Autowired
	@Qualifier("hibernate")
	EmployeeDAO dao;

	@GetMapping("/loginpage")
	public String getLogin() {
		return VIEW_LOGINPAGE;
	}

	@PostMapping("/homepage")
	public String authenticate(String password, int id, HttpServletRequest req,
			@Value("${invalidLog}") String invalidLog, @Value("{dbInstancetype}") String dbInstancetype) {

		EmployeeInfoBean bean = dao.getEmployeeInfo(id);

		if (bean != null && bean.getPassword().equals(password)) {
			HttpSession session = req.getSession(true);
			req.setAttribute("bean", bean);
			return VIEW_HOMEPAGE;
		}
		req.setAttribute("emp", invalidLog);
		return VIEW_LOGINPAGE;
	}

	@GetMapping("/logout")
	public String logout(HttpSession session, ModelMap modelMap, @Value("${logoutmsg}") String logout) {
		modelMap.addAttribute("logout", logout);
		return VIEW_LOGINPAGE;
	}
}
