package com.pradeep.InventoryManagementSystem.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.pradeep.InventoryManagementSystem.Models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
	
}
