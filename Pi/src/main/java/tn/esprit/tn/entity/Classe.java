package tn.esprit.tn.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Classe {
	
	private int IdClasse ; 
	
	private String Label ; 
	
	@OneToMany (mappedBy="Classe")
	private Set<Enfants> Enfants ;
	
	@OneToMany (mappedBy="Classe")
	private Set<Employe> Employe ;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private User Jardin ;
	
	
}
