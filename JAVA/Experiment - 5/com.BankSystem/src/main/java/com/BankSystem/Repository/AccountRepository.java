package com.BankSystem.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BankSystem.Models.Account;




public interface AccountRepository extends JpaRepository<Account, Integer> {
	
	public Optional findById(Integer id);
	
	
	public List<Account> findByAccountNumber(Integer accountNumber);
	
	public List<Account> findByIFSCCODE(String ifscCode);
	
	public List<Account> findByName(String name);
	
	public List<Account> findByPhoneNumber(Integer number);
	
	public List<Account> findByAge(Integer age);
	
	
	
}
