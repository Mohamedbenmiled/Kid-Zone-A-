package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Employe;;


@Repository
public interface EmployeRepository extends JpaRepository<Employe, Long>{
	//@Query("SELECT e FROM employee e"+ " WHERE e.nom LIKE %:nom%")
   // List<Employe> EmployeByName(@Param("nom") String nom);
}
