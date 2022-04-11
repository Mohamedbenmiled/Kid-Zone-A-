package tn.esprit.tn.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Rendezvous {

	private int IdRdv ;
	private Date Date ; 
	
	@OneToMany (mappedBy="Rendezvous")
	private Set<User> User ;
}
