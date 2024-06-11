package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

	@RequestMapping("/")
	public String home()
	{
		System.out.println("Home page requested");
		return "index";
	}
	
	@RequestMapping("add")
	public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, Model m)
	{
		
		
		int num3 = i+j;
		//return "result.jsp?num3=" +num3;
		
		m.addAttribute("num3", num3);
		return "result";
	}
}
