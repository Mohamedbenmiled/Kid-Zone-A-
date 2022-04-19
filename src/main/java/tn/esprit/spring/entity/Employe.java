package tn.esprit.spring.entity;

import java.io.Serializable;
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
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@Table(name="Employee")
public class Employe  implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	@Column(name="idEmployee")
		private int idEmploye ;
	
	@Column(name="Nom")
		private String nom ;
	
	@Column(name="Prenom")
		private String prenom ;
	
	@Column(name="Tel")
		private int tel ; 
	
	@Column(name="Email")
		private String email ;
	
	//@Column(name="Jardin")
		@ManyToOne(cascade = CascadeType.ALL)
		private User jardin ;
	//@Column(name="Classe")
	@ManyToOne(cascade = CascadeType.ALL)
		private Classe classe ;
	public int getIdEmploye() {
		return idEmploye;
	}
	public void setIdEmploye(int idEmploye) {
		this.idEmploye = idEmploye;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User getJardin() {
		return jardin;
	}
	public void setJardin(User jardin) {
		this.jardin = jardin;
	}
	public Classe getClasse() {
		return classe;
	}
	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
		

		
}
