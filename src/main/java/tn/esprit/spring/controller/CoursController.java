package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.Iservice.ICoursService;
import tn.esprit.spring.entity.*;
@RestController
@RequestMapping("CoursController")
public class CoursController {
	@Autowired
	ICoursService coursService;
	 
	@GetMapping( "/listCours" )
	@ResponseBody
	public List<Cours> getCour() {
		return coursService.retrieveAll();
	}
	
	@PostMapping("/addCours")
	@ResponseBody
	public Cours addCours( @RequestBody Cours cours) {
		return coursService.addCours(cours);
				
	}
	
	@PostMapping("/updateCours")
	@ResponseBody
	public Cours updateCours(@RequestBody Cours cours) {

		return coursService.updateCours(cours);
	}
	
	@DeleteMapping("/deleteCours/{idCours}")
	@ResponseBody
	void deleteClasse(@PathVariable("idCours") Integer idCours) {
		coursService.deleteCours(idCours);
	}
}
