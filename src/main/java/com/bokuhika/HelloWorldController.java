package com.bokuhika;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@GetMapping("/helloworld")
	public String helloworld() {
		return "sepo";
		 
	}
}
