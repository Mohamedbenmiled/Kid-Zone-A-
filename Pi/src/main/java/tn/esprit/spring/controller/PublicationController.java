package tn.esprit.spring.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.Iservice.IPublicationService;
import tn.esprit.spring.entity.Publication;




@RestController
@RequestMapping("/Publication")
public class PublicationController {

	@Autowired
	IPublicationService publicationService;

	// http://localhost:8068/Publication/retrieve-all-publication
	@GetMapping("/retrieve-all-publication")
	@ResponseBody
	public List<Publication> getPosts() {
		List<Publication> list = publicationService.retreiveAllPublication();
		return list;
	}


	// http://localhost:8068/Publication/add-post
	@PostMapping("/add-post")
	@ResponseBody
	public Publication addPublication(@RequestBody Publication p) {
		Publication publication = publicationService.addPublication(p);
		return publication;
	}

	// http://localhost:8068/Publication/remove-post/{stock-id}
	@DeleteMapping("/remove-post/{idPost}")
	@ResponseBody
	public void removePost(@PathVariable("idPost") Long idPost) {
		publicationService.deletePublication(idPost);
	}

	// http://localhost:8068/Publication/modify-post
	@PutMapping("/modify-post")
	@ResponseBody
	public Publication modifyPublication(@RequestBody Publication p) {
		return publicationService.updatePublication(p);
	}

}