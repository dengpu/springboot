package com.bokuhika;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class WelcomeController {
	@PostMapping("/helloworld")
	public String welcome(String name, Model model,int age){
		System.out.println("name : " + name +" age : " +age);
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		
		return "welcome";
	}
	
	
}
