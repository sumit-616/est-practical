package com.pradeep.InventoryManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pradeep.InventoryManagementSystem.Models.Supplier;

public interface SupperRepository extends JpaRepository<Supplier, Long> {

	Object findByName(String supplierName);

}
