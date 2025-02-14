package com.ust.EmpMs.service;

import java.util.List;

import com.ust.EmpMs.dto.EmployeeDTO;

import com.ust.EmpMs.Exceptions.EmployeeNotFoundException;
import com.ust.EmpMs.repo.EmployeeRepo;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepo empRepo;
	
	public EmployeeServiceImpl(EmployeeRepo empRepo) {
        this.empRepo = empRepo;
    }


	@Override
	public void addEmployee(EmployeeDTO emp) {
		// TODO Auto-generated method stub
		empRepo.addEmployee(emp);

	}

	@Override
	public
	EmployeeDTO findEmployeeById(int id) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		  return empRepo.findEmployeeById(id)
		                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found with id: " + id));
	}
	
	@Override
	public List<EmployeeDTO> getAllEmployees() {
		// TODO Auto-generated method stub
		return empRepo.getAllEmployees();
	}
	
	@Override
	public
	boolean removeEmployee(int id) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		if(empRepo.removeEmployee(id)) {
			return true;
		}
		else {
			throw new EmployeeNotFoundException("Employee with id: " + id + "not found");		}
	}

}
