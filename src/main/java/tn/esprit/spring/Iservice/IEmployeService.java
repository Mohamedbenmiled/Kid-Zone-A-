package tn.esprit.spring.Iservice;

import java.util.List;

import tn.esprit.spring.entity.Employe;;

public interface IEmployeService {
	Employe addEmploye(Employe emp);
	Employe updateEmploye(Employe emp);
	void deleteEmploye(Integer idEmployee);
	List<Employe> retrieveAll();

}
