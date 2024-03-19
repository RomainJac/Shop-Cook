package l3.miage.shopcook.services;

import java.util.List;

import org.springframework.stereotype.Service;

import l3.miage.shopcook.entity.ingredients.Ingredient;

@Service
public interface IngredientService {
    boolean save(Ingredient ingredient);
    boolean removeIngredient(Ingredient ingredient);
    boolean updateIngredient(Ingredient ingredient);
    Ingredient getById(int id);
    List<Ingredient> findAll();
}
