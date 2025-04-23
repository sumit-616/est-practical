package com.pradeep.InventoryManagementSystem.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity

public class InventoryRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Product product;

    private int quantity;

    public void addStock(int amount) {
        this.quantity += amount;
    }

    public void reduceStock(int amount) {
        if (amount <= quantity) {
            this.quantity -= amount;
        } else {
            throw new IllegalArgumentException("Not enough stock to reduce.");
        }
    }
}
