package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.CategoriePost;

@Repository
public interface CategoriePostRepository extends CrudRepository<CategoriePost, Long>{

}
