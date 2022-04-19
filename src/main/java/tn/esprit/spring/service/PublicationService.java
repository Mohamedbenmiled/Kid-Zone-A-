package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Iservice.IPublicationService;
import tn.esprit.spring.entity.Publication;
import tn.esprit.spring.repository.PublicationRepository;

@Service

public class PublicationService implements IPublicationService {
	@Autowired
	PublicationRepository publicationRepository;
	@Override
	public Publication addPublication(Publication p) {
	publicationRepository.save(p);
	return null;
	}

	@Override
	public List<Publication> retreiveAllPublication() {
		List<Publication> listPublication = (List<Publication>) publicationRepository.findAll();	
		
		return listPublication;
	}

	@Override
	public void deletePublication(long id) {
		publicationRepository.deleteById(id);
		
	}

	@Override
	public Publication updatePublication(Publication p) {
		return publicationRepository.save(p);
	}

	@Override
	public Publication getPublicationById(long id) {
		// TODO Auto-generated method stub
		return null;
	}



}
