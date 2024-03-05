package com.example.demo.ingredients;

import java.io.Serializable;
import java.util.List;

import jakarta.annotation.Nullable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Ingredient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    @ElementCollection
    @OneToMany
    private List<DietaryRestriction> dietaryRestrictions;
    @Nullable
    private float nutriscore;
    @Nullable
    private int calories;

    public Ingredient(String name, List<DietaryRestriction> dietaryRestrictions, float nutriscore, int calories) {
        this.name = name;
        this.dietaryRestrictions = dietaryRestrictions;
        this.nutriscore = nutriscore;
        this.calories = calories;
    }
    public Ingredient() {
        this.name = "";
    }
    public Ingredient(String name, float nutriscore, int calories) {
        this.name = name;
        this.nutriscore = nutriscore;
        this.calories = calories;
    }
    public Ingredient(String name) {
        this.name = name;
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
