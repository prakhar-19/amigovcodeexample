package com.amigo.example.employeemanager.service;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.amigo.example.employeemanager.model.Employee;
import com.amigo.example.employeemanager.repo.*;

@Service
public class EmployeeService {
private final Employeerepo employeerepo;

public EmployeeService(Employeerepo employeerepo) {
	super();
	this.employeerepo = employeerepo;
}
	
	public Employee addEmployee(Employee employee) {
		employee.setEmployeecode(UUID.randomUUID().toString());
		return employeerepo.save(employee);
	}
	
	public List<Employee> findAllEmployees(){
		return employeerepo.findAll();
	}
	
	public Employee updateEmployee(Employee employee)
	{
		return employeerepo.save(employee);
	}
    public void deleteEmployee(Long Id) {
    	employeerepo.deleteEmployeeById(Id);
    }
	}

