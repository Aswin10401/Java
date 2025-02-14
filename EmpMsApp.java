package com.ust.EmpMs;

import java.util.List;

import com.ust.EmpMs.dto.EmployeeDTO;
import com.ust.EmpMs.repo.EmployeeRepoImpl;
import com.ust.EmpMs.service.EmployeeServiceImpl;

import com.ust.EmpMs.Exceptions.EmployeeNotFoundException;

public class EmpMsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeRepoImpl empRepo = new EmployeeRepoImpl();
		EmployeeServiceImpl empService = new EmployeeServiceImpl(empRepo);
		
		//Add Employees
		empService.addEmployee(new EmployeeDTO(1, "John Doe", "IT", 50000));
		empService.addEmployee(new EmployeeDTO(2, "Jane smith", "HR", 38000));
		
		//List All Employees
		List<EmployeeDTO> employees = empService.getAllEmployees();
		for(EmployeeDTO emp : employees) {
			System.out.println(emp.getName());
		}
		
		//Find an Employee By id
		try {
			EmployeeDTO emp = empService.findEmployeeById(1);
			System.out.println("Employee Found" +emp.getName());
		}catch(EmployeeNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		//Remove an Employee
		
		try {
			if(empService.removeEmployee(2)) {
				System.out.println("Employee Removed\n");
			}
		}catch(EmployeeNotFoundException e) {
				System.out.println(e.getMessage());
			}
	}

}
