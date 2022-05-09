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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@Table(name="cours")
public class Cours  implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idCours")
		private int idCours ;
	
	@Column(name="Titre")
		private String Titre ;
	
	@Column(name="Description")
		private String Description ;

	
	//@Column(name="tuteur")
		@ManyToOne(cascade = CascadeType.ALL)
		private Employe tuteur ;

	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
		

		
}
