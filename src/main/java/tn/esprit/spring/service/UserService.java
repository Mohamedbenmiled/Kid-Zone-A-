package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.Iservice.IRendezVousService;
import tn.esprit.spring.Iservice.IUserService;
import tn.esprit.spring.entity.User;
import tn.esprit.spring.repository.RendezVousRepository;
import tn.esprit.spring.repository.UserRepository;

@Service 
public class UserService implements IUserService {
@Autowired
UserRepository UserR;
	
	@Override
	public List<User> retrieveAllUsers() {
		// TODO Auto-generated method stub
		List<User> listUsr = (List<User>) UserR.findAll();	
		
		return listUsr;
	}


	@Override
	public User retrieveUser(Long id) {
		User usr = UserR.findById(id).orElse(null);
		return usr;
	}

}
