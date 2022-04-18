package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.Iservice.IRendezVousService;
import tn.esprit.spring.entity.Rendezvous;
import tn.esprit.spring.repository.RendezVousRepository;

@Service 
public class RendezVousService implements IRendezVousService {
@Autowired
RendezVousRepository RdvR;
	
	@Override
	public List<Rendezvous> retrieveAllRendezvous() {
		// TODO Auto-generated method stub
		List<Rendezvous> listRec = (List<Rendezvous>) RdvR.findAll();	
		
		return listRec;
	}

	@Override
	public Rendezvous addRendezvous(Rendezvous rdv) {
		// TODO Auto-generated method stub
		RdvR.save(rdv);
		return rdv;
	}

	@Override
	public Rendezvous updateRendezvous(Rendezvous rdv) {
		RdvR.save(rdv);
		return rdv;
	}

	@Override
	public Rendezvous retrieveRendezvous(Long id) {
		Rendezvous rdv = RdvR.findById(id).orElse(null);
		return rdv;
	}

	@Override
	public void removeRendezvous(Long id) {
		// TODO Auto-generated method stub
		RdvR.deleteById(id);
		
	}

}
