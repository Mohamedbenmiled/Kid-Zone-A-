package tn.esprit.spring.Iservice;

import java.util.List;

import tn.esprit.spring.entity.Rendezvous;

public interface IRendezVousService {
	List<Rendezvous> retrieveAllRendezvous();
	
	Rendezvous addRendezvous(Rendezvous rdv);
	
	Rendezvous updateRendezvous(Rendezvous rdv);
	
	Rendezvous retrieveRendezvous(Long id);
	
	void removeRendezvous(Long id);

	}