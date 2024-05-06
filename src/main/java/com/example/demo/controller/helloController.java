package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class helloController {

	@RequestMapping("/hello")
	public String hello1() {

		return "bai1/Bai1";
	}

	@PostMapping("/result")
	public String resultName(@RequestParam("name") String userName, Model model) {
		if (userName.trim().length() > 0) {
			model.addAttribute("userName", userName);
		}
		return "bai1/Bai1";
	}

}
