package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.Iservice.ICoursService;
import tn.esprit.spring.entity.Cours;
import tn.esprit.spring.repository.CoursRepository;
@Service
public class CoursService implements ICoursService {
	@Autowired 
	CoursRepository CoursRepository;
	@Override
	public Cours addCours(Cours cours) {
		// TODO Auto-generated method stub
		return CoursRepository.save(cours);
	}

	@Override 
	public Cours updateCours(Cours cours) {
		// TODO Auto-generated method stub
		Cours Cours = CoursRepository.findById(cours.getIdCours()).get();
		cours.setDescription(cours.getDescription());
		cours.setTitre(cours.getTitre());
	
		return  CoursRepository.save(cours);
	}

	@Override
	public void deleteCours(Integer idcours) {
		// TODO Auto-generated method stub
		Optional<Cours> cours = CoursRepository.findById(idcours) ;
		 if (cours.isPresent()) {
			 CoursRepository.deleteById(idcours);
		 } else {
			 System.out.println("pas des cours");
			 
		 }
	}

	@Override
	public List<Cours> retrieveAll() {
		// TODO Auto-generated method stub
		return CoursRepository.findAll();
	}

}
