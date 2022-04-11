package tn.esprit.tn.entity;

import java.util.Set;

import javax.persistence.OneToMany;

public class Reclamation {

	private int IdReclamation  ; 
	
	private Boolean Note ;
	
	@OneToMany (mappedBy="Reclamation")
	private Set<User> User ;
}
