package com.skilldistillery.aquarium.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AquariumController {

	@RequestMapping(path= {"/" ,"home.do"})
	public String home() {
		return "home";
	}
}