package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Employe;;


@Repository
public interface EmployeRepository extends JpaRepository<Employe, Long>{
	@Query("Select a FROM Employee a ORDER BY a.nom DESC")
	public List<Employe> getByNomDesc();
	@Query("SELECT t FROM Employee t WHERE t.nom LIKE %:nom%")
    List<Employe> SearchByNom(@Param("nom") String nom);
}
