package com.kishu.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kishu.beans.User;
import com.kishu.service.UserService;

@Controller
public class WelcomeController {
	@Autowired UserService userService;
	@RequestMapping("/")
	public String forIndex() {
		return "index";
	}
	@RequestMapping("/signup")
	public String forSingup(Model model ) {
		
		model.addAttribute("command", new User());
		return "signup";
	}
	@PostMapping("/signup")
	public String forPostSingup(Model model,@Valid @ModelAttribute("command")User user,BindingResult result) {
		if(result.hasErrors()) {
			model.addAttribute("errmsg","Please Enter valid data.");
			return "signup";
		}
		user=userService.addUser(user);
		if(user!=null) {
			model.addAttribute("command", new User());
			model.addAttribute("msg","user register successfully.");
			return "signup";
		}
		model.addAttribute("errmsg","Error in user registeristration.");
		return "signup";
	}
	@RequestMapping("/signin")
	public String forSingin() {
		return "signin";
	}
	@RequestMapping("/allUser")
	public String forAllUser(Model model) {
		List<User> ulist=userService.getAllUser();
		model.addAttribute("list",ulist);
		return "allUser";
	}
}
