package com.BankSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BankSystem.Models.Employee;
import com.BankSystem.Models.User;



//private Double salary;
//private String status;
//private String bankBranch; 
//private User user;



public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	
	public List<Employee> findBySalary(Double salary);
	public List<Employee> findByStatus(Boolean status);
	
	public List<Employee> findByBankBranch(String branch);
	
	

}
