package tn.esprit.spring.Iservice;

import java.util.List;

import tn.esprit.spring.entity.Reclamation;

public interface IReclamationService{
	List<Reclamation> retrieveAllReclamations();
	
	Reclamation addReclamation(Reclamation rec);
	
	Reclamation updateReclamation(Reclamation rec);
	
    Reclamation retrieveReclamation(Long  id);
    public List<Reclamation> getAllReclamationLabel();
	
	public List<Reclamation> getLabelDesc();
	
	public List<Reclamation> rechercheReclamation(String label);
		


	
	void removeReclamation(Long id);


	}
