package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Publication;
@Repository
public interface PublicationRepository extends CrudRepository<Publication, Long> {

}
