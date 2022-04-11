package tn.esprit.tn.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
	
	private int IdUser ; 
	
	private String Nom ; 
	
	private String Prenom ; 

	private String Email ; 
	
	private String Password ; 
	
	private String Introduction ; 
	
	private int  NbrEmploye ;
	
	private int Numero_Tel ; 
	
	private String Localisation ; 
	
	@Autowired
	@Enumerated(EnumType.STRING)
	private Role Role;	
	
	@OneToMany (mappedBy="Parents")
	private Set<Enfants> Enfants ;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Rendezvous Rendezvous ;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Reclamation Reclamation ;
	
	@OneToMany (mappedBy="Publication")
	private Set<Publication> Publication ; 
	
	@OneToMany (mappedBy="Jardin")
	private Set<Classe> Classe ;
	
	@OneToMany (mappedBy="Jardin")
	private Set<Employe> Employe ;

}

