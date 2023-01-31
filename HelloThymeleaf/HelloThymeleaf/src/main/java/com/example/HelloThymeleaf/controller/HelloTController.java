package com.example.HelloThymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloTController {
	
	@GetMapping("/hello")												//url-end point
	public String greetingForm(@RequestParam(name="name") String nimi, //lukee nimi ja ika
			@RequestParam(name="age") int ika, Model model) {
		model.addAttribute("nimi", nimi); 							//avain-arvo parit lisätään model-olioon
		model.addAttribute("ika", ika);
		return "hello";												//kutsuu hello.html
	}
}
