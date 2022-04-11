package tn.esprit.tn.entity;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;

public class Enfants {

	private int IdEnfants ; 
	
	private String Nom ;
	
	private String Prenom ; 
	
	private int Age ; 
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Classe Classe ;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private User User ;
}
