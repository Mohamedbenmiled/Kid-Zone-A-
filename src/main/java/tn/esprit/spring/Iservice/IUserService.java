package tn.esprit.spring.Iservice;

import java.util.List;

import tn.esprit.spring.entity.User;

public interface IUserService{
	List<User> retrieveAllUsers();
	
    User retrieveUser(Long  id);
	

	}