package com.ust.EmpMs.repo;

import com.ust.EmpMs.dto.EmployeeDTO;
import java.util.List;
import java.util.Optional;


public interface EmployeeRepo {
	void addEmployee(EmployeeDTO emp);
	Optional<EmployeeDTO> findEmployeeById(int id);
	List<EmployeeDTO> getAllEmployees();
	boolean removeEmployee(int id);
}
