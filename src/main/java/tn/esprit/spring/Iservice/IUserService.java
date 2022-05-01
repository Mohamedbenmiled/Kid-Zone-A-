package tn.esprit.spring.Iservice;

import java.util.List;

import tn.esprit.spring.entity.Role;
import tn.esprit.spring.entity.User;

public interface IUserService {

		User addUser(User u);
//		Role saveRole(Role role);
//		void addRoleToUser(String userName, String roleName);
		User getUser(String userName);
		User updateUser(User u);
		List<User> retrieveAll();
		void deleteUser(Long IdUser);
}