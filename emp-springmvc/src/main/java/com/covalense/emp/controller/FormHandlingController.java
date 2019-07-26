package com.covalense.emp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.covalense.emp.beans.UserBean;

@Controller
@RequestMapping("/forms")
public class FormHandlingController {

	@GetMapping("/getForm")
	public String getForm() {
		return "myForm";
	}

	@PostMapping("/formSubmit")
	public String submitForm(HttpServletRequest req) {
		int userId = Integer.parseInt(req.getParameter("userId"));
		String password = req.getParameter("password");
		req.setAttribute("userId", userId);
		req.setAttribute("password", password);
		return "formDataDisplay";

	}

	@PostMapping("/submitForm2")
	public String submitForm2(int userId, String password, ModelMap modelMap) {
		modelMap.addAttribute("userId", userId);
		modelMap.addAttribute("password", password);

		return "formDataDisplay";

	}

	@PostMapping("/submitForm3")
	public String submitform3(UserBean userBean, ModelMap modelMap) {
		modelMap.addAttribute("userBean", userBean);

		return "formDataBeanDisplay";

	}// end of submitForm3..

	@PostMapping("/submitForm4")
	public String submitform4(@RequestParam(name = "userId") int userId,
			@RequestParam(name = "password") String password, ModelMap modelMap) {
		modelMap.addAttribute("userId", userId);
		modelMap.addAttribute("password", password);

		return "formDataDisplay";

	}// end of submitForm4..
	
	@PostMapping("/submitForm5")
	public String submitform5(@RequestParam(name = "userId") int userId,
			@RequestParam(name = "password") String password, ModelMap modelMap) {
		modelMap.addAttribute("userId", userId);
		modelMap.addAttribute("password", password);

		return "formDataDisplayEL";

	}// end of submitForm5..
	
	@PostMapping("/submitForm6")
	public String submitform6(UserBean userBean, ModelMap modelMap) {
		modelMap.addAttribute("userBean", userBean);

		return "formDataBeanDisplayEL";

	}// end of submitForm6..

}
