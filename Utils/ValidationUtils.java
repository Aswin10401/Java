package com.ust.EmpMs.Utils;

public class ValidationUtils {
	public static boolean isValidSalary(double salary) {
		return salary> 0;
	}
	public static boolean isValidName(String name) {
		return name != null && name.trim().isEmpty();
	}
}
