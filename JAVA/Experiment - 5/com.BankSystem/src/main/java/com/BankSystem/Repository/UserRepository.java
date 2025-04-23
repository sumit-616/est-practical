package com.BankSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.BankSystem.Models.User;



//private String fullName;
//private String address;
//private Integer age;
//private String email;
//private int phoneNumber;

public interface UserRepository extends JpaRepository<User, Integer> {

	
	public List<User> findByFullName(String name);
	public List<User> findByAddress(String address);
	public List<User> findByAge(Integer age);
	
	public List<User> findByEmail(String email);
	public List<User> findByPhoneNumber(String phoneNumber);
}
