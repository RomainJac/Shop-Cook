package l3.miage.shopcook.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import l3.miage.shopcook.recipes.Recipe;
import l3.miage.shopcook.repositories.RecipeRepository;
import l3.miage.shopcook.user.User;

@Service
public class RecipeServiceImpl implements RecipeService {
    @Autowired
    private RecipeRepository recipeRepository;

    @Override
    public Recipe save(Recipe recipe) {
        try {
            return this.recipeRepository.save(recipe);
        } catch (Exception e) {

            return null;
        }
    }

    @Override
    public Recipe delete(Recipe recipe) {
        this.recipeRepository.delete(recipe);
        return recipe;
    }

    @Override
    public Recipe update(Recipe recipe) {
        if (this.recipeRepository.existsById(recipe.getId())) {
            this.recipeRepository.deleteById(recipe.getId());
            return this.save(recipe);
        }
        return null;
    }

    @Override
    public Recipe findById(int id) {
        return this.recipeRepository.findById(id).get();
    }

    @Override
    public List<Recipe> findAll() {
        return this.recipeRepository.findAll();
    }

    @Override
    public List<Recipe> findByUser(User user) {
        return this.recipeRepository.findByUser(user);
    }

    @Override
    public Recipe deleteById(Integer id) {
        Recipe recipe = this.recipeRepository.findById(id).get();
        this.recipeRepository.deleteById(id);
        return recipe;
    }

    @Override
    public Recipe findByName(String title) {
        return this.recipeRepository.findByName(title);
    }

}
