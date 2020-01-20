package com.skilldistillery.aquarium.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.aquarium.data.AquariumDAO;
import com.skilldistillery.aquarium.entities.Organism;

@Controller
public class AquariumController {

	@Autowired
	private AquariumDAO dao;

	@RequestMapping(path = { "/", "home.do" })
	public String home() {
		return "home";
	}

	@RequestMapping(path = "createPage.do")
	public String createPage() {
		return "create";
	}

	@RequestMapping(path = "searchPage.do")
	public String searchPage() {
		return "search";
	}

	@RequestMapping(path = "listPage.do")
	public String showFilm(Model model) {
		List<Organism> organisms = dao.findAll();
		model.addAttribute("organisms", organisms);
		return "listTables";
	}

	// create
	@RequestMapping(path = "addOrganism.do", method = RequestMethod.POST)
	public ModelAndView newOrganism(Organism o) {
		dao.addOrganism(o);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}

	// delete
	@RequestMapping(path = "deleteOrganism.do", method = RequestMethod.POST)
	public String deleteOrganism(@RequestParam("organism") int id) {
		Organism o = dao.findById(id);
		dao.deleteOrganism(o);
		return "home";
	}

	// update organism
	@RequestMapping(path = "updatePage.do", method = RequestMethod.POST)
	public ModelAndView updateOrganism(@RequestParam("organism") int id) {
		Organism o = dao.findById(id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("o", o);//send organism to update page to keep values
		mv.setViewName("update");
		return mv;
	}
	
	@RequestMapping(path = "updateOrganism.do", method = RequestMethod.POST)
	public String updateOrganism(@RequestParam("id")int id, Organism o) {
		dao.updateOrganism(o, id);
		return "home";
	}
	

}