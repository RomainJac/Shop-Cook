package l3.miage.shopcook.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import l3.miage.shopcook.ingredients.Ingredient;
import l3.miage.shopcook.repositories.IngredientRepository;

@Service
public class IngredientServiceImpl implements IngredientService {
    @Autowired
    private IngredientRepository ingredientRepository;

    @Override
    public boolean save(Ingredient ingredient) {
        try {

            this.ingredientRepository.save(ingredient);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean save(String name, float nutriscore, int calories) {
        Ingredient i = new Ingredient(name, nutriscore, calories);
        this.save(i);
        return true;
    }

    @Override
    public boolean removeIngredient(Ingredient ingredient) {
        try {
            this.ingredientRepository.delete(ingredient);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean updateIngredient(Ingredient ingredient) {
        if (this.ingredientRepository.existsById(ingredient.getId())) {
            this.ingredientRepository.deleteById(ingredient.getId());
            this.save(ingredient);
            return true;
        }
        return false;
    }

    @Override
    public Ingredient getById(int id) {
        return this.ingredientRepository.findById(id).get();
    }

    @Override
    public List<Ingredient> findAll() {
        return this.ingredientRepository.findAll();
    }

}
