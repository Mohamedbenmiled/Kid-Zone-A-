package tn.esprit.tn.entity;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Publication {
	
	private int IdPost  ; 
	
	@ManyToOne(cascade = CascadeType.ALL)
	private CategoriePost Categorie ; 
	
	private String Contenue ; 
	
	private String Commentaire ; 
	
	private Boolean Interraction ;
	
	private String Image ;
	
	@ManyToOne ( cascade = CascadeType.ALL)
	private Publication Publication ;
}
