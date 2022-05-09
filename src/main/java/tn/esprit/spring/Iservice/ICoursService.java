package tn.esprit.spring.Iservice;

import java.util.List;

import tn.esprit.spring.entity.Cours;

public interface ICoursService {
	Cours addCours(Cours cours);
	Cours updateCours(Cours cours);
	void deleteCours(Integer idcours);
	List<Cours> retrieveAll();
}
