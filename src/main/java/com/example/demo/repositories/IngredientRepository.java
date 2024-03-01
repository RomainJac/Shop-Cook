package com.example.demo.repositories;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.ingredients.Ingredient;
public interface IngredientRepository extends CrudRepository<Ingredient, Integer>{
    
}
