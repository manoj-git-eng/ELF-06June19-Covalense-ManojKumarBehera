package com.covalense.emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactoryOld;

/*@Controller
@RequestMapping("/session")*/
/*public class SessionController {
	@GetMapping("/loginpage")
	public String getLogin() {
		return "emplogin";
	}*/

	/*
	 * @PostMapping("/homepage") public String authenticate(String password,int id,
	 * HttpServletRequest req) { EmployeeDAO dao = EmployeeDAOFactory.getInstance();
	 * int idValue=Integer.parseInt(req.getParameter("id")); EmployeeInfoBean bean =
	 * dao.getEmployeeInfo(id);
	 * 
	 * if (bean != null && bean.getPassword().equals(password)) { HttpSession
	 * session = req.getSession(true); req.setAttribute("bean", bean); return
	 * "homepage"; } req.setAttribute("msg", "Invalid credentials!!!"); return
	 * "emplogin"; }
	 * 
	 * @GetMapping("/logout") public String logout(HttpSession session, ModelMap
	 * modelMap) { modelMap.addAttribute("msg", "Invalid credentials!!!"); return
	 * "emplogin";
	 * 
	 * }
	 * 
	 * 
	 * 
	 * @GetMapping("/search") public String search(HttpSession session, ModelMap
	 * modelMap) { if (session.isNew()) { modelMap.addAttribute("msg",
	 * "Invalid credentials!!!"); return "emplogin"; }
	 * 
	 * return "homepage"; }
	 * 
	 * 
	 * 
	 * 
	 * @GetMapping("/create") public String createEmployee(HttpSession session,
	 * ModelMap modelMap) { if (session.isNew()) { modelMap.addAttribute("msg",
	 * "Invalid credentials!!!"); return "emplogin"; }
	 * 
	 * return "empreg"; }
	 * 
	 * @GetMapping("/validate1")
	 * 
	 * public String validateSession1(HttpSession session, ModelMap
	 * modelMap, @RequestParam("url") String url,
	 * 
	 * @Value("${msg}") String msg, @PathVariable("url") String abc) {
	 * 
	 * if (session.isNew()) { modelMap.addAttribute("msg", msg);
	 * session.invalidate(); return "emplogin";
	 * 
	 * } return "forward:/session/" + url; }
	 * 
	 * @GetMapping("/validate2") public String validateSession2(HttpServletRequest
	 * req, ModelMap modelMap, @RequestParam String url) { if (req.getSession(false)
	 * == null) { modelMap.addAttribute("msg", "Please login first!!!"); return
	 * "emplogin";
	 * 
	 * } return "forward:/session/" + url; }
	 * 
	 * @PostMapping("/validate") public String validateSessionForPost(HttpSession
	 * session, ModelMap modelMap, @RequestParam String url) {
	 * 
	 * return validateSession1(session, modelMap, url, url, url); }
	 */


