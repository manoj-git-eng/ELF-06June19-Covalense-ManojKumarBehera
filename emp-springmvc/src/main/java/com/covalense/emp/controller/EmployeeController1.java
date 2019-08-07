package com.covalense.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class EmployeeController1 {
	@RequestMapping(path = "/getMessage", method = RequestMethod.GET)
	public ModelAndView getMessage() {
		ModelAndView modelAndview = new ModelAndView();
		//modelAndview.setViewName("./WEB-INF/views/messagePage.jsp");
		modelAndview.setViewName("messagePage");

		return modelAndview;
	}

	@GetMapping("/seeMessage")
	public ModelAndView getMessage(ModelAndView modelAndView) {
		modelAndView.setViewName("messagePage");
		return modelAndView;
	}

}
