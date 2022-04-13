package tn.esprit.spring.Iservice;

import java.util.List;

import tn.esprit.spring.entity.Reclamation;

public interface IReclamationService{
	List<Reclamation> retrieveAllReclamations();
	
	Reclamation addReclamation(Reclamation rec);
	
	Reclamation updateReclamation(Reclamation rec);
	
	//Reclamation retrieveReclamation(Reclamation rec);
	
	void removeReclamation(Long id);


	}
