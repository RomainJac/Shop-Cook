package com.example.demo.ingredients;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private List<DietaryRestriction> dietaryRestrictions;
    private float nutriscore;
    private int calories;

    public Ingredient(String name, List<DietaryRestriction> dietaryRestrictions, float nutriscore, int calories) {
        this.name = name;
        this.dietaryRestrictions = dietaryRestrictions;
        this.nutriscore = nutriscore;
        this.calories = calories;
    }
    public String getName() {
        return name;
    }
    public List<DietaryRestriction> getDietaryRestrictions() {
        return dietaryRestrictions;
    }
    public float getNutriscore() {
        return nutriscore;
    }
    public int getCalories() {
        return calories;
    }
    public void addDietaryRestriction(DietaryRestriction dietaryRestriction) {
        this.dietaryRestrictions.add(dietaryRestriction);
    }
}
