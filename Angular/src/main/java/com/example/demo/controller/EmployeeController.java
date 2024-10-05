package com.example.demo.controller;
import com.example.demo.excpetion.*;
import com.example.demo.entity.Employee;
import com.example.demo.excpetion.ResourceNotFoundExcpetion;
import com.example.demo.repository.EmployeeRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository emprepo;

    @GetMapping("/employee")
    public List<Employee> getAllEmployees() {
        return emprepo.findAll();
    }

   
    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee employee) {
        return emprepo.save(employee);
    }
    
    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable int id)
    {
    	Employee employee=emprepo.findById(id).orElseThrow(()->new ResourceNotFoundExcpetion("Employee not exist with id"+id));
		return ResponseEntity.ok(employee);
    	
    }
    
    @PutMapping("/employee/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable int id,@RequestBody Employee employeedetails)
    {
    	Employee employee=emprepo.findById(id).orElseThrow(()->new ResourceNotFoundExcpetion("Employee not exist with id"+id));
		
    	employee.setFirstName(employeedetails.getFirstName());
    	employee.setLastName(employeedetails.getLastName());
    	employee.setSalary(employeedetails.getSalary());
    	emprepo.save(employee);
    	
    	return ResponseEntity.ok(employee);
    	
    }
    
    @DeleteMapping("/employee/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable int id)
    {
    	Employee employee=emprepo.findById(id).orElseThrow(()->new ResourceNotFoundExcpetion("Employee not exist with id"+id));
    	
    	emprepo.delete(employee);
    	Map<String,Boolean>response=new HashMap<String,Boolean>();
    	response.put("delete", Boolean.TRUE);
    	
    	return ResponseEntity.ok(response);
    	
    }
}
