package tn.esprit.tn.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


public class CategorieEvent {

	private int IdCategorie ; 
	
	private int Label ; 
	
	@OneToMany (mappedBy="CategorieEvent")
	private Set<Event> Event ;
}
