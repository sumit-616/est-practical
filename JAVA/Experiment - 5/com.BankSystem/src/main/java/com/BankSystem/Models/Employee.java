package com.BankSystem.Models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;


@Entity
public class Employee extends User{
    
  
    private Double salary;
    private String status;
    private String bankBranch; 
    
    @OneToOne(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
    private User user;
   
    private Customer cus;


    public Employee() {}

    public Employee(String eid, String eName, String eAddress, Double salary, String status, String bankBranch) {
   
        this.salary = salary;
        this.status = status;
        this.bankBranch = bankBranch;
    }


   
  
    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", status=" + status + ", bankBranch=" + bankBranch + ", user=" + user
				+ "]";
	}
    
    
    


  
}
