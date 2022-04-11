package tn.esprit.tn.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


public class Event {

	private int idEvent ;
	
	private String Nom ; 
	
	private Date DateEvent ; 
	
	private int NbrInscri ; 
	
	@ManyToOne(cascade = CascadeType.ALL)
	private CategorieEvent CategorieEvent ;
}
