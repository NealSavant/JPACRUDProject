package com.skilldistillery.aquarium.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.aquarium.data.AquariumDAO;
import com.skilldistillery.aquarium.entities.Organism;

@Controller
public class AquariumController {

	@Autowired
	private AquariumDAO dao;
	
	@RequestMapping(path= {"/" ,"home.do"})
	public String home() {
		return "home";
	}
	
	@RequestMapping(path= "createPage.do")
	public String createPage() {
		return "create";
	}
	
	@RequestMapping(path= "searchPage.do")
	public String searchPage() {
		return "search";
	}
	
	
	@RequestMapping(path="listPage.do")
	public String showFilm(Model model) {
		List<Organism> organisms = dao.findAll();
		model.addAttribute("organisms", organisms);
		return "listTables";
	}
	
//	@RequestMapping(path="getOrganism.do")
//	public String showFilm(@RequestParam("id") Integer id, Model model) {
//		Organism organism = null;
////		organism = dao.findById(id);
//		model.addAttribute("organism", organism);
//		return "listTables";
//	}
	
}