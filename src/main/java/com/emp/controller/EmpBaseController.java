package com.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmpBaseController {

	@RequestMapping(path="/home", method=RequestMethod.GET)
	public String homePage() {
		return "success";
	}
}
