package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Reclamation;

@Repository

public interface ReclamationRepository extends CrudRepository<Reclamation, Long> {
	@Query("Select a FROM Reclamation a ORDER BY a.description ASC")
	public List<Reclamation> getByLabelAsc();
	
@Query("Select a FROM Reclamation a ORDER BY a.description DESC")
	public List<Reclamation> getByLabelDesc();

@Query("SELECT t FROM Reclamation t WHERE t.description LIKE %:description%")
List<Reclamation> SearchByLabel(@Param("description") String label);

}
