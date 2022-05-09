package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.Iservice.IEmployeService;
import tn.esprit.spring.entity.Employe;
import tn.esprit.spring.repository.EmployeRepository;;
@Service

public class EmployeService implements IEmployeService {

	@Autowired 
	EmployeRepository EmployeRepository;
	@Override
	public Employe addEmploye(Employe emp) {
		return EmployeRepository.save(emp);
	}

	@Override
	public Employe updateEmploye(Employe emp) {
		Employe employe = EmployeRepository.findById(emp.getIdEmploye()).get();
		employe.setIdEmploye(emp.getIdEmploye());
		employe.setNom(emp.getNom());
		employe.setPrenom(emp.getPrenom());
		employe.setTel(emp.getTel());
		employe.setEmail(emp.getEmail());
		return  EmployeRepository.save(emp);
	}

	@Override
	public void deleteEmploye(long idEmployee) {
		Optional<Employe> Employe = EmployeRepository.findById(idEmployee) ;
		 if (Employe.isPresent()) {
			 EmployeRepository.deleteById(idEmployee);
		 } else {
			 System.out.println("pas des rendezvous");
			 
		 }

	}

	@Override
	public List<Employe> retrieveAll() {
		return EmployeRepository.findAll();
	}

	@Override
	public List<Employe> retrieveEmployesByName(String nom) {
		// TODO Auto-generated method stub
		//return EmployeRepository.EmployeByName(nom);
		return null ;
	}


		
	}

	

