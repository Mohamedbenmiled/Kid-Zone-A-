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
		return null;
	}

	@Override
	public Reclamation updateReclamation(Reclamation rec) {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
	public Reclamation retrieveReclamation(Reclamation rec) {
		// TODO Auto-generated method stub
		return null;
	}*/

	@Override
	public void removeReclamation(Long id) {
		// TODO Auto-generated method stub
		RR.deleteById(id);
		
	}

}