package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twilio.Twilio;
import com.twilio.type.PhoneNumber;

import tn.esprit.spring.Iservice.IEmployeService;
import tn.esprit.spring.entity.Employe;
import tn.esprit.spring.repository.EmployeRepository;;
@Service

public class EmployeService implements IEmployeService {

	@Autowired 
	EmployeRepository EmployeRepository;
	@Override
	public Employe addEmploye(Employe emp) {
		 EmployeRepository.save(emp);
		sendsms("votre rendez vous "+ emp.getNom()+ "est le"+emp.getTel(), 0); 
		return emp;	
		}
	public void sendsms(String str, int body) {
		Twilio.init("AC7cb3effce9fe5b827c7f93b7393af6cb", "5231e89c1e2f24696561c7a21ddcb775");
		try {
			com.twilio.rest.api.v2010.account.Message message = com.twilio.rest.api.v2010.account.Message
					.creator(new PhoneNumber("+21656253868"), // To number
							new PhoneNumber("+19894410530"), // From number 
							str+ body)
					.create();
		} catch (Exception e) {
			// TODO: handle exception
		}
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
	public List<Employe> getLabelDesc() {
		return EmployeRepository.getByNomDesc();	}
	@Override
	public List<Employe> SearchByNom(String nom) {
		// TODO Auto-generated method stub
		return EmployeRepository.SearchByNom(nom);
	}
	

		
	}

	

