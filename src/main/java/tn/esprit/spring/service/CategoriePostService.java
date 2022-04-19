package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.Iservice.ICategoriePostService;
import tn.esprit.spring.Iservice.IPublicationService;
import tn.esprit.spring.entity.CategoriePost;
import tn.esprit.spring.entity.Publication;
import tn.esprit.spring.repository.CategoriePostRepository;


@Service

public class CategoriePostService implements ICategoriePostService {
	@Autowired
	CategoriePostRepository categoriePostRepository;
	@Override
	public CategoriePost addCategoriePost(CategoriePost c) {
		categoriePostRepository.save(c);
	return null;
	}

	@Override
	public List<CategoriePost> retreiveAllCategoriePost() {
		List<CategoriePost> listCateg = (List<CategoriePost>) categoriePostRepository.findAll();	
		
		return listCateg;
	}

	@Override
	public void deleteCategoriePost(long id) {
		categoriePostRepository.deleteById(id);
		
	}

	@Override
	public CategoriePost updateCategoriePost(CategoriePost c) {
		return categoriePostRepository.save(c);
	}

	@Override
	public CategoriePost getCategoriePostById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	


}
