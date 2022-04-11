package tn.esprit.tn.entity;

import javax.persistence.CascadeType;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;

public class Employe {

		private int IdEmploye ;
		
		private String Nom ;
		
		private String Prenom ;
		
		private int Tel ; 
		
		private String Email ;
		
		@ManyToOne(cascade = CascadeType.ALL)
		private User Jardin ;
		
		@ManyToOne(cascade = CascadeType.ALL)
		private Classe Classe ;
		
		@Autowired
		@Enumerated(EnumType.STRING)
		private RoleEmployee RoleEmployee;
		
}
