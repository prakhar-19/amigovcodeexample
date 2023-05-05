package com.amigo.example.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amigo.example.employeemanager.model.Employee;

public interface Employeerepo extends JpaRepository<Employee,Long> {

	void deleteEmployeeById(Long id);

}
