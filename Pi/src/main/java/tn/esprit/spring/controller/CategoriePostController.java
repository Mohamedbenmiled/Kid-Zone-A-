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

import tn.esprit.spring.Iservice.ICategoriePostService;
import tn.esprit.spring.entity.CategoriePost;
@RestController
@RequestMapping("/CategoriePost")
public class CategoriePostController {

	@Autowired
	ICategoriePostService categoriePostService;

	// http://localhost:8068/CategoriePost/affiche
	@GetMapping(value = "/affiche"  , produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<CategoriePost> getPosts() {
		List<CategoriePost> list = categoriePostService.retreiveAllCategoriePost();
		return list;
	}


	// http://localhost:8068/CategoriePost/add-categ
	@PostMapping("/add-categ")
	@ResponseBody
	public CategoriePost addPublication(@RequestBody CategoriePost p) {
		CategoriePost categoriePost = categoriePostService.addCategoriePost(p);
		return categoriePost;
	}

	// http://localhost:8068/CategoriePost/remove-CategoriePost/{idCategoriePost}
	@DeleteMapping("/remove-CategoriePost/{idCategoriePost}")
	@ResponseBody
	public void removePost(@PathVariable("idCategoriePost") Long idCategoriePost) {
		categoriePostService.deleteCategoriePost(idCategoriePost);
	}

	// http://localhost:8068/Publication/modify-CategoriePost
	@PutMapping("/modify-CategoriePost/{idCategoriePost}")
	@ResponseBody
	public CategoriePost modifyPublication(@RequestBody CategoriePost c , @PathVariable long idCategoriePost) {
		return categoriePostService.updateCategoriePost(c);
	}

}