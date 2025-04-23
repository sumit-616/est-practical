package com.pradeep.InventoryManagementSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.pradeep.InventoryManagementSystem.Models.Category;
import com.pradeep.InventoryManagementSystem.Models.Product;
import com.pradeep.InventoryManagementSystem.Models.Supplier;
import com.pradeep.InventoryManagementSystem.Repository.CategoryRepository;
import com.pradeep.InventoryManagementSystem.Repository.ProductRepository;
import com.pradeep.InventoryManagementSystem.Repository.SupperRepository;

import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private SupperRepository supplierRepository;

    @PostMapping
    public ResponseEntity<Product> addProduct(
            @RequestParam String name,
            @RequestParam double price,
            @RequestParam String CategoryName,
            @RequestParam String SupplierName,
            @RequestParam String SupplierContact
    ) {
   
        Category category;
       
       
            category = new Category();
            category.setName(CategoryName);
            category = categoryRepository.save(category);
       

        // Handle Supplier
        Supplier supplier;
        
            supplier = new Supplier();
            supplier.setName(SupplierName);
            supplier.setContactInfo(SupplierContact);
            supplier = supplierRepository.save(supplier);
        


        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        product.setCategory(category);
        product.setSupplier(supplier);

        Product saved = productRepository.save(product);
        return ResponseEntity.ok(saved);
    }
}
