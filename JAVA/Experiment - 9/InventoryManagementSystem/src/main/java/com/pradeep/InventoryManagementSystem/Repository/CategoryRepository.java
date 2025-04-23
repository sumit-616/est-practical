package com.pradeep.InventoryManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pradeep.InventoryManagementSystem.Models.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	Object findByName(String categoryName);

}
