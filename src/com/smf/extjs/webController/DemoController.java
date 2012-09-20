package com.smf.extjs.webController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.smf.extjs.extdirectspring.HelloDemoService;

@Controller
public class DemoController {

	private HelloDemoService helloDemoService;
	
	@RequestMapping("/login")
	public ModelAndView login() {
		return new ModelAndView("login");
	}
	
	@RequestMapping("/hello")
	public ModelAndView hello() {
		return new ModelAndView("hello");
	}
	
	
	@Autowired
	public void setHelloDemoService(HelloDemoService helloDemoService) {
		this.helloDemoService = helloDemoService;
	}
}
