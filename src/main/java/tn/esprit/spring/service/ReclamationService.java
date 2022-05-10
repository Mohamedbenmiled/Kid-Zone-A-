package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.Iservice.IReclamationService;
import tn.esprit.spring.entity.Reclamation;
import tn.esprit.spring.repository.ReclamationRepository;

@Service 
public class ReclamationService implements IReclamationService {
@Autowired
ReclamationRepository RR;
	
	@Override
	public List<Reclamation> retrieveAllReclamations() {
		// TODO Auto-generated method stub
		List<Reclamation> listRec = (List<Reclamation>) RR.findAll();	
		
		return listRec;
	}

	@Override
	public Reclamation addReclamation(Reclamation rec) {
		// TODO Auto-generated method stub
		RR.save(rec);
		return rec;
	}

	@Override
	public Reclamation updateReclamation(Reclamation rec) {
		RR.save(rec);
		return rec;
	}

	@Override
	public Reclamation retrieveReclamation(Long id) {
		Reclamation rec = RR.findById(id).orElse(null);
		return rec;
	}

	@Override
	public void removeReclamation(Long id) {
		// TODO Auto-generated method stub
		RR.deleteById(id);
		
	}
	@Override
	public List<Reclamation> getAllReclamationLabel(){
		return RR.getByLabelAsc();
	}

	@Override
	public List<Reclamation> getLabelDesc(){
		return RR.getByLabelDesc();
	}
	@Override
	public List<Reclamation> rechercheReclamation(String label) {
		
		return RR.SearchByLabel(label);
	}

}
