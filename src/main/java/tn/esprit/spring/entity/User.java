package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@Table(name="User")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idUser")

	private int idUser ; 
	@Column(name="Nom")

	private String nom ; 
	@Column(name="Prenom")

	private String prenom ; 
	@Column(name="Email")

	private String email ; 
	@Column(name="Password")

	private String password ; 
	@Column(name="Introduction")

	private String introduction ; 
	@Column(name="NbrEmployee")

	private int  nbrEmploye ;
	@Column(name="Numero")

	private int numero_Tel ; 
	@Column(name="Localisation")

	private String localisation ; 
	

	@JsonIgnore
	@OneToMany (mappedBy="user")
	private Set<Enfants> enfants ;
	
	@JsonIgnore
	@OneToMany (mappedBy="user")
	private Set<Rendezvous> rendezvous ;
	@JsonIgnore
	@OneToMany (mappedBy="user")
	private Set<Publication> publication ; 
	@JsonIgnore
	@OneToMany (mappedBy="jardin")
	private Set<Classe> classe ;
	@JsonIgnore
	@OneToMany (mappedBy="jardin")
	private Set<Employe> employe ;
	
	
	//@JsonBackReference
	//@OneToMany (mappedBy="user")
	//private Set<Reclamation> reclamation ;

}

