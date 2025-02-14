package com.ust.EmpMs.service;

import com.ust.EmpMs.dto.EmployeeDTO;
import com.ust.EmpMs.Exceptions.EmployeeNotFoundException;
import java.util.List;

public interface EmployeeService {
	void addEmployee(EmployeeDTO emp);
	EmployeeDTO findEmployeeById(int id) throws EmployeeNotFoundException;
	List<EmployeeDTO> getAllEmployees();
	boolean removeEmployee(int id) throws EmployeeNotFoundException;

}
