package com.springboot.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.model.User;
import com.springboot.service.impl.SpringBootServiceImpl;

@Controller
public class SpringBootController {

	@Autowired
	private SpringBootServiceImpl springBootService;

	@RequestMapping("/")
	public String index(Model model) {
		ArrayList<User> users = springBootService.getUserList();
		model.addAttribute("users", users);
		return "homepage";
	}
	
	@RequestMapping("/profile/{id}")
	public String profile(@PathVariable("id") String id, Model model) {
		User user = springBootService.getUserDetails(id);
		model.addAttribute("user", user);
		return "profileview";
	}	
}
