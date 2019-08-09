package com.covalense.emp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import static com.covalense.emp.common.EmpCommons.VIEW_HOMEPAGE;
import static com.covalense.emp.common.EmpCommons.VIEW_LOGINPAGE;
import static com.covalense.emp.common.EmpCommons.SEARCH_PAGE;
import static com.covalense.emp.common.EmpCommons.CREATE_EMPLOYEE;
import static com.covalense.emp.common.EmpCommons.UPDATE_EMPLOYEE;

import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dto.EducationDetailsInfoBean;
import com.covalense.emp.dto.EmployeeAddressInfoBean;
import com.covalense.emp.dto.EmployeeExperienceInfoBean;
import com.covalense.emp.dto.EmployeeInfoBean;
import com.covalense.emp.dto.EmployeeOtherInfoBean;

@Controller
@RequestMapping("/employee")
@PropertySource("classpath:emp.properties")
public class EmployeeController {
	@Autowired
	@Qualifier("hibernate")

	private EmployeeDAO dao;

	@org.springframework.web.bind.annotation.InitBinder
	public void InitBinder(WebDataBinder binder) {
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, editor);
	}

	@GetMapping("/search")
	public String searchEmployee(int id, ModelMap modelMap) {

		List<EmployeeInfoBean> bean = dao.getEmployeeListInfo(id);
		modelMap.addAttribute("empList", bean);

		modelMap.addAttribute("msg", "Invalid credentials!!!");
		return SEARCH_PAGE;

	}

	@PostMapping("/create")
	public String addEmployee(EmployeeInfoBean bean,ModelMap map) {
		
		List<EducationDetailsInfoBean> educationDetailsInfoBeans =bean.getEducationDetailsInfoBeans();
		for (EducationDetailsInfoBean detailsInfoBean: educationDetailsInfoBeans) {
			detailsInfoBean.getEducationDetailsPKBean().setInfoBean(bean);
		}
		
		List<EmployeeAddressInfoBean> addressInfoBean =bean.getAddressInfoBean();
		for(EmployeeAddressInfoBean employeeAddressInfoBean :addressInfoBean) {
			employeeAddressInfoBean.getAddressPKBean().setInfoBean(bean);
		}
		List<EmployeeExperienceInfoBean> employeeExperienceInfoBeans =bean.getEmployeeExperienceInfoBeans();
		for(EmployeeExperienceInfoBean experienceInfoBean: employeeExperienceInfoBeans) {
			experienceInfoBean.getEmployeeExPKBean().setInfoBean(bean);
		}
		
		EmployeeOtherInfoBean otherInfoBean =bean.getEmployeeOtherInfoBean();
		otherInfoBean.setInfoBean(bean);
		
		boolean result = dao.createEmployeeInfo(bean);
		if(result) {
			map.addAttribute("msg", "Employee Succesfully added!!!!!!");
		} else {
			map.addAttribute("msg", "Employee Insertion failed!!");
		}
		return CREATE_EMPLOYEE;
	}
	@GetMapping("/create")
	public String createEmployee(HttpSession session, ModelMap modelMap) {
		if (session.isNew()) {
			modelMap.addAttribute("msg", "Successfully Inserted!!!");
			return VIEW_LOGINPAGE;
		}

		return CREATE_EMPLOYEE;
	}
	
	@GetMapping("/updateEmployee")
	public String getUpdaterEmployee() {
		return UPDATE_EMPLOYEE;
	}
	
	@PostMapping("/updateEmployee")
	public String updaterEmployee(EmployeeInfoBean infoBean, String mngrId) {
		EmployeeInfoBean myBean=dao.getEmployeeInfo(mngrId);
		infoBean.setMngrId(myBean);
		dao.updateEmployeeInfo(infoBean);
		return VIEW_HOMEPAGE;
	}
}
