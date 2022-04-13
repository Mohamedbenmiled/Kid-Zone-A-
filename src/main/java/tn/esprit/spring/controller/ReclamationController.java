package tn.esprit.spring.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.Iservice.IReclamationService;
import tn.esprit.spring.service.ReclamationService;

import tn.esprit.spring.entity.Reclamation;





@RestController
@RequestMapping("/Reclamation")
public class ReclamationController {

	@Autowired
	IReclamationService ReclamationService;

	// http://localhost:8068/Reclamation/affiche
	@GetMapping(value = "/affiche"  , produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Reclamation> getRecs() {
		List<Reclamation> list = ReclamationService.retrieveAllReclamations();
		return list;
	}


	// http://localhost:8068/Reclamation/add-post
	@PostMapping("/add-rec")
	@ResponseBody
	public Reclamation addRec(@RequestBody Reclamation r) {
		Reclamation reclamation = ReclamationService.addReclamation(r);
		return reclamation;
	}

	// http://localhost:8068/Reclamation/remove-post/{idPost}
	@DeleteMapping("/remove-rec/{idRec}")
	@ResponseBody
	public void removeRec(@PathVariable("idRec") Long idRec) {
		ReclamationService.removeReclamation(idRec);
	}

	// http://localhost:8068/Reclamation/modify-post/{idPost}
	/*@PutMapping("/modify-post")
	@ResponseBody
	public Reclamation modifyReclamation(@RequestBody Reclamation p) {
		return ReclamationService.updateReclamation(p);*/
	}

