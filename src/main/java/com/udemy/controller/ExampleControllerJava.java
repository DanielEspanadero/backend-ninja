package com.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.model.Person;

@Controller
@RequestMapping("example")
public class ExampleControllerJava {
	
	public static final String EXAMPLE_VIEW = "example";
	
//	Primera forma
	@GetMapping("/exampleString")
	public String exampleString(Model model) {
		model.addAttribute("person", new Person("Jhon", 23));
		return EXAMPLE_VIEW;
	}

//	Segunda forma
	
	@GetMapping("/exampleMAV")
	public ModelAndView exampleMAV() {
		ModelAndView mav = new ModelAndView("example");
		mav.addObject("person", new Person("Jhon", 23));
		
		return mav;
	}
}