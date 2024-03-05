package com.example.demo.ingredients;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DietaryRestriction implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    public DietaryRestriction(String name) {
        this.name = name;
    }
    public DietaryRestriction() {
        this.name = "";
    }
}
