package com.BankSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BankSystem.Models.Loan;

public interface LoanRepository extends JpaRepository<Loan,Integer> {

}
