package com.spring.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.metamodel.Metamodel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name","Varun Ranjan");
		System.out.println("home page by controller");
		return "index";
	}
	@RequestMapping("/about")
	public ModelAndView about(Model model) {
		ModelAndView mv = new ModelAndView();
		List<String> list = new ArrayList<String>();
		list.add("Delhi");
		list.add("Bihar");
		list.add("Punjab");
		list.add("Jharkand");
		mv.addObject("location",list);
		mv.setViewName("about");
		
		System.out.println("About page by controller");
		return mv;
	}
}
