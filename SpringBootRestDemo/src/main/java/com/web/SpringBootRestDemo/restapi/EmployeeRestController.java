package com.web.SpringBootRestDemo.restapi;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.web.SpringBootRestDemo.entity.Employee;
import com.web.SpringBootRestDemo.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeRestController {

	//@Autowired 
	private EmployeeService employeeService;

	public EmployeeRestController(EmployeeService employeeService) {
		System.out.println("emp constructor");
		this.employeeService = employeeService;
	}
	//	@GetMapping
	//	public List<Employee> getAllEmployees(){
	//		return employeeService.getEmployees();
	//	}
	@GetMapping
	public List<Employee> getEmployees(
			@RequestParam(defaultValue = "S") String nameStartsWith){
//		if(nameStartsWith != null)
//			return employeeService.getEmployeesByNameStarts(nameStartsWith);
//		return employeeService.getEmployees();
		if(nameStartsWith.equals("all"))
			return employeeService.getEmployees();
		return employeeService.getEmployeesByNameStarts(nameStartsWith);
	}
	@GetMapping("/{id}")
	public Employee getEmployeeBYId(@PathVariable() Integer id){
		return employeeService.getEmployeeById(id);
	}
	@PostMapping
	public Employee addEmployee(@RequestBody Employee emp){
		return employeeService.addEmployee(emp);
	}
	@DeleteMapping("/{id}")
	public boolean deleteEmployeeBYId(@PathVariable Integer id){
		return employeeService.deleteEmployee(id);
	}
	@PutMapping
	public Employee updateEmployee(@RequestBody Employee emp){
		return employeeService.updateEmployee(emp);
	}
	@PatchMapping
	public Employee updatePatchOfEmployee(@RequestBody Employee emp){

		/*
		 * update emp set cnames
		 */
		return employeeService.updateEmployee(emp);
	}
}

