package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import tn.esprit.spring.Iservice.IEmployeService;
import tn.esprit.spring.entity.Employe;

@RestController
@RequestMapping("EmployeController")
public class EmployeController {
	@Autowired
	IEmployeService employeService;
	 
	@GetMapping( "/listEmploye" )
	@ResponseBody
	public List<Employe> getEmploye() {
		return employeService.retrieveAll();
	}
	
	@PostMapping("/addEmploye")
	@RequestBody
	public Employe addEmploye(@RequestBody Employe employe) {
		return employeService.addEmploye(employe);
	}
	
	@PostMapping("/updateEmploye")
	@RequestBody
	public Employe updateEmploye(@RequestBody Employe emp) {

		return employeService.updateEmploye(emp);
	}
	
	@DeleteMapping("/deleteEmploye/{idEmployee}")
	@ResponseBody
	void deleteClasse(@PathVariable("idEmployee") Integer idEmployee) {
		employeService.deleteEmploye(idEmployee);
	}
}
