package tn.esprit.tn.entity;

import java.util.Set;

import javax.persistence.OneToMany;

public class CategoriePost {

	private int IdCategoriePost ; 
	
	private String Label ; 
	
	@OneToMany (mappedBy="Categorie")
	private Set<Publication> Publication ;
}
