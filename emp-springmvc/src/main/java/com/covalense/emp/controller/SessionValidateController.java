package com.covalense.emp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import static com.covalense.emp.common.EmpCommons.VIEW_HOMEPAGE;
import static com.covalense.emp.common.EmpCommons.VIEW_LOGINPAGE;


@Controller
@RequestMapping("/validator")
public class SessionValidateController {
	@GetMapping("/validate")
	public String validate(HttpSession session ,ModelMap modelmap,
			@Value("${invalidLog}") String msg,
			@PathVariable("url1") String url1,
			@PathVariable("url2") String url2)  {
		if(session.isNew()) {
			modelmap.addAttribute("msg", msg);
			return VIEW_LOGINPAGE;
		}
		return "forward:"+url1+"/"+url2;
	}

	@PostMapping("/validate")
	public String validateForPost(HttpSession session ,ModelMap modelmap,@Value("${invalidLog}") String msg,
			@PathVariable("url1") String url1,
			@PathVariable("url2") String url2)  {
		
			return validate(session, modelmap, msg, url1, url2);
	
	}
}
