package com.springmvc;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.model.Alien;


@Controller
public class HomeController {
	
	@ModelAttribute
	public void modelData(Model m)
	{
		m.addAttribute("name","Aliens");
	}

	@RequestMapping("/")
	public String home()
	{
		System.out.println("Home page requested");
		return "index";
	}
	
	
	@PostMapping(value="/addAlien")
	public String addAlien(@ModelAttribute("alien") Alien a)
	{
		return "result";
	}
	
	@GetMapping(value="/getAliens")
	public String getAliens(Model m)
	{
		List<Alien> aliens = Arrays.asList(new Alien(101,"Snigdha"), new Alien(102, "Ram"));
		m.addAttribute("result", aliens);
		return "showAliens";
	}
	
}
