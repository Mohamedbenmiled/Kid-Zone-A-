package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.Iservice.IEmployeService;
import tn.esprit.spring.entity.Employe;
@CrossOrigin(origins= "http://localhost:4200")
@RestController
@RequestMapping("EmployeController")
public class EmployeController {
	@Autowired
	IEmployeService employeService;
	 
	@GetMapping( "/all-Employes" )
	@ResponseBody
	public List<Employe> getEmploye() {
		return employeService.retrieveAll();
	}
	
	@PostMapping("/add-Employe")
	@ResponseBody
	public Employe addEmploye( @RequestBody Employe employe) {
		return employeService.addEmploye(employe);
	}
	
	@PostMapping("/edit-Employe")
	@ResponseBody
	public Employe updateEmploye(@RequestBody Employe employe) {

		return employeService.updateEmploye(employe);
	}
	
	@DeleteMapping("/delete-Employe/{id_Employee}")
	@ResponseBody
	void deleteClasse(@PathVariable("id_Employee") Integer idEmployee) {
		employeService.deleteEmploye(idEmployee);
	}
	// http://localhost:8090/SpringMVC/EmployeController/retrieve-employeByNom
	@GetMapping("/retrieve-employeByNom/{employe-nom}")
	@ResponseBody
	public List <Employe> retrieveEmployeByNom(@PathVariable("employe-nom") String name) {
		return employeService.SearchByNom(name);
	}
	@GetMapping("/getEmployeDesc")
	@ResponseBody
	public List<Employe> getEmployeDesc(){
		return employeService.getLabelDesc();
	}
	
}
