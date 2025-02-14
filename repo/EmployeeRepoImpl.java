package com.ust.EmpMs.repo;

import java.util.List;

import java.util.ArrayList;

import java.util.Optional;

import com.ust.EmpMs.dto.EmployeeDTO;

public class EmployeeRepoImpl implements EmployeeRepo {
	
	private List<EmployeeDTO> empDB = new ArrayList<>();

	@Override
	public void addEmployee(EmployeeDTO emp) {
		// TODO Auto-generated method stub
		empDB.add(emp);

	}

	@Override
	public Optional<EmployeeDTO> findEmployeeById(int id) {
		// TODO Auto-generated method stub
		for(EmployeeDTO emp : empDB) {	// Iterate through the employeeDB
			if(emp.getId() == id) { 	// // Check if the current employee's ID matches the target ID
				return Optional.of(emp); // If found, return the employee wrapped in an Optional
			}
		}
		return Optional.empty();  // // If the loop completes without finding a match, return an empty Optional
	}

	@Override
	public List<EmployeeDTO> getAllEmployees() {
		// TODO Auto-generated method stub
		return empDB;
	}

	@Override
	public boolean removeEmployee(int id) {
		// TODO Auto-generated method stub
		return empDB.removeIf(emp -> emp.getId() == id);
	}

}
