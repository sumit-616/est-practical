package com.BankSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BankSystem.Models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	
	

}
