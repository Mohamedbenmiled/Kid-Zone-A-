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

import tn.esprit.spring.Iservice.IRendezVousService;
import tn.esprit.spring.service.RendezVousService;

import tn.esprit.spring.entity.Rendezvous;





@RestController
@RequestMapping("/RendezVous")
public class RendezVousController {

	@Autowired
	IRendezVousService RendezVousService;

	// http://localhost:8068/RendezVous/affiche
	@GetMapping(value = "/affiche"  , produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Rendezvous> getRdvs() {
		List<Rendezvous> list = RendezVousService.retrieveAllRendezvous();
		return list;
	}


	// http://localhost:8068/RendezVous/add-post
	@PostMapping("/add-rdv")
	@ResponseBody
	public Rendezvous addRdv(@RequestBody Rendezvous r) {
		Rendezvous reclamation = RendezVousService.addRendezvous(r);
		return reclamation;
	}

	// http://localhost:8068/RendezVous/remove-post/{idPost}
	@DeleteMapping("/remove-rdv/{idRdv}")
	@ResponseBody
	public void removeRdv(@PathVariable("idRdv") Long idRdv) {
		RendezVousService.removeRendezvous(idRdv);
	}

	// http://localhost:8068/RendezVous/modify-post/{idPost}
	@PutMapping("/modify-rdv")
	@ResponseBody
	public Rendezvous modifyRendezVous(@RequestBody Rendezvous r) {
		return RendezVousService.updateRendezvous(r);
	}
	
	@GetMapping("/retrieve-rdv/{idRdv}")
	@ResponseBody
	public Rendezvous retrieveRendezVous(@PathVariable("idRdv") Long idRdv) {
		return RendezVousService.retrieveRendezvous(idRdv);
	}
}
