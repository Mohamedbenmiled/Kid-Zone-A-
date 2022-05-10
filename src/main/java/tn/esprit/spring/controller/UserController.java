package tn.esprit.spring.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.Iservice.IUserService;
import tn.esprit.spring.service.UserService;

import tn.esprit.spring.entity.User;




@CrossOrigin
@RestController
@RequestMapping("/User")
public class UserController {

	@Autowired
	IUserService UserService;

	// http://localhost:8068/User/affiche
	@GetMapping(value = "/affiche"  , produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<User> getUsrs() {
		List<User> list = UserService.retrieveAllUsers();
		return list;
	}

	
	@GetMapping("/retrieve-usr/{idUsr}")
	@ResponseBody
	public User retrieveUser(@PathVariable("idUsr") Long idUsr) {
		return UserService.retrieveUser(idUsr);
	}
}
