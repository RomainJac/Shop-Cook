package l3.miage.shopcook.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import l3.miage.shopcook.recipes.Recipe;
import l3.miage.shopcook.repositories.RecipeRepository;
@Service
public class RecipeServiceImpl implements RecipeService{
    @Autowired
    private RecipeRepository recipeRepository;
    @Override
    public boolean save(Recipe recipe) {
        this.recipeRepository.save(recipe);
        return true;
    }

    @Override
    public boolean delete(Recipe recipe) {
        this.recipeRepository.delete(recipe);
        return true;
    }

    @Override
    public boolean update(Recipe recipe) {
        if (this.recipeRepository.existsById(recipe.getId())) {
            this.recipeRepository.deleteById(recipe.getId());
            this.save(recipe);
            return true;
        }
        return false;
    }

    @Override
    public Recipe findById(int id) {
        return this.recipeRepository.findById(id).get();
    }

    @Override
    public List<Recipe> findAll() {
        return this.recipeRepository.findAll();
    }
    
}
