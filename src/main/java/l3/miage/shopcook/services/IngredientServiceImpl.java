package l3.miage.shopcook.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import l3.miage.shopcook.ingredients.Ingredient;
import l3.miage.shopcook.repositories.IngredientRepository;
import l3.miage.shopcook.user.User;

@Service
public class IngredientServiceImpl implements IngredientService {
    @Autowired
    private IngredientRepository ingredientRepository;

    @Override
    public Ingredient save(Ingredient ingredient) {
        try {
            return this.ingredientRepository.save(ingredient);
        } catch (Exception e) {

            return null;
        }
    }

    public boolean save(String name, float nutriscore, int calories) {
        Ingredient i = new Ingredient(name, nutriscore, calories);
        this.save(i);
        return true;
    }

    @Override
    public Ingredient removeIngredient(Ingredient ingredient) {
        try {
            this.ingredientRepository.delete(ingredient);
            return ingredient;
        } catch (Exception e) {

            return null;
        }
    }

    @Override
    public Ingredient updateIngredient(Ingredient ingredient) {
        if (this.ingredientRepository.existsById(ingredient.getId())) {
            this.ingredientRepository.deleteById(ingredient.getId());
            return this.save(ingredient);
        }
        return null;
    }

    @Override
    public Ingredient getById(int id) {
        return this.ingredientRepository.findById(id).get();
    }

    @Override
    public List<Ingredient> findAll() {
        return this.ingredientRepository.findAll();
    }

    @Override
    public List<Ingredient> findByUser(User user) {
        return this.ingredientRepository.findByUser(user);
    }

    @Override
    public Ingredient deleteById(Integer id) {
        Ingredient ingredient = this.ingredientRepository.findById(id).orElse(null);
        if (ingredient != null) {
            this.ingredientRepository.deleteById(id);
        }
        return ingredient;
    }

}
