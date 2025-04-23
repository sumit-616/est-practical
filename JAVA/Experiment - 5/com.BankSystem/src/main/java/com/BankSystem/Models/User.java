package com.BankSystem.Models;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import jakarta.annotation.Generated;

@Embeddable
public class User {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String fullName;
	private String address;
	private Integer age;
	private String emailID;
	private int phoneNumber;
	
	
	public User() {
		super();
		
	}
	public User(Integer id, String fullName, String address, Integer age, String email, int phoneNumber) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.address = address;
		this.age = age;
		this.emailID = email;
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", fullName=" + fullName + ", address=" + address + ", age=" + age + ", email="
				+ emailID + ", phoneNumber=" + phoneNumber + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmail() {
		return emailID;
	}
	public void setEmail(String email) {
		this.emailID = email;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	

	
	
	
}
