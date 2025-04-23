package com.BankSystem.Services;

import java.util.List;

import com.BankSystem.Models.Employee;
import com.BankSystem.Repository.EmployeeRepository;

public class EmployeeService {
	
	
	EmployeeRepository er;
	
	
	public List<Employee> getBySalary(Double Salary){
		return er.findBySalary(Salary);
	}
	
	public List<Employee> getByStatus(Boolean status){
		return er.findByStatus(status);
		
	}
	
	public List<Employee> getByBankBranch(String branch){
		return er.findByBankBranch(branch);
	}
	

}
